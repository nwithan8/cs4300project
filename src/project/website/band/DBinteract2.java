import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;


public class DBinteract{
	public static int login(String username, String password){
		int success = 0;
		int numResults = 0;
		
		String query = "select * from useraccount where username = \'" + username + "\' and pw = \'" + password + "\'" ;
		System.out.println(query);
		ResultSet rs = DatabaseAccessInterface.retrieve(query);
		try {
			
			while(rs.next()){
				numResults++;
				success = rs.getInt("id");			}
		} catch (SQLException e) {
			return -1;
		}
		if(numResults<1){
			return 0;
		}
		else if(numResults>1){
			return -1;
		}
		else{
			return success;
		}
		
	}
	
	//choice is 1 is its a venue, 0 if its a band
	public static int createAccount(boolean choice, String username, String password, String name, String description, String email){
		String query = "insert into useraccount values (";
		String id = Integer.toString(getMaxId(choice));
		query+=id;
		query+= ", \"" + username + "\", \"" + password + "\")";
		System.out.println(query);
		int z =  DatabaseAccessInterface.create(query);
		if(z==0)return z;
		
		if(choice){
			String query2 = "insert into venues values (";
			query2+=id;
			query2+=", \"" + name + "\",\"" + description + "\", null,\"" + email + "\", null,null,null)";
			System.out.println(query2);
			z =  DatabaseAccessInterface.create(query2);
			
		}
		else if(!choice){
			String query2 = "insert into bands values (";
			query2+=id;
			query2+=", \"" + name + "\",\"" + description + "\", null,\"" + email + "\", null,null,null,null)";
			System.out.println(query2);
			z =  DatabaseAccessInterface.create(query2);
		}
		
		return z;
		

	}
	//choice is 1 is its a venue, 0 if its a band
	public static int getMaxId(boolean choice){
		String query = "select MAX(id) from useraccount ";
		if(!choice)query += "where id <20000000";
		System.out.println(query);
		ResultSet rs = DatabaseAccessInterface.retrieve(query);
		
		
		try {
			int result = -2;
			while(rs.next())result = rs.getInt(1);
			System.out.println("result: " + result);
			int done = result + 1;
			System.out.println("done:" + done);
			if(choice && done<20000000){
				done+=20000000;
				System.out.println("done2: " + done);
			}
			return done;
		} catch (SQLException e) {
			System.out.println("we had an error.");
			return -1;
		}
		
		
	}
	public static int getMaxEventId(){
		String query = "select MAX(id) from events ";
		int id = 1;
		System.out.println(query);
		ResultSet rs = DatabaseAccessInterface.retrieve(query);
		
		
		try {
			int result = -2;
			while(rs.next())result = rs.getInt(1);
			System.out.println("result: " + result);
			int done = result + 1;
			System.out.println("done:" + done);
			id = done;
		} catch (SQLException e) {
			System.out.println("we had an error.");
			return -1;
		}
		
		return id;
	}
	public static int getMaxApplicationId(){
		String query = "select MAX(id) from applications ";
		int id = 1;
		System.out.println(query);
		ResultSet rs = DatabaseAccessInterface.retrieve(query);
		
		
		try {
			int result = -2;
			while(rs.next())result = rs.getInt(1);
			System.out.println("result: " + result);
			int done = result + 1;
			System.out.println("done:" + done);
			id = done;
		} catch (SQLException e) {
			System.out.println("we had an error.");
			return -1;
		}
		
		return id;
	}
	public static int createEvent(int venue_id, String title, String date, String description){
		String query = "insert into events values (";
		int id = getMaxEventId();
		int isFilled = 0;
		query += id;
		query += "," + venue_id;
		query += ",\"" + title;
		query += "\",\"" + date;
		query += "\"," + isFilled;
		query += ", NULL , \"";
		query += description + "\");";
		System.out.println(query);
		return DatabaseAccessInterface.create(query);

	}
	public static int createApplication(int event_id, int band_id){
		String query = "insert into applications values (";
		int id = getMaxApplicationId();
		query += id + "," + event_id + "," + band_id + ");";
		System.out.println(query);
		return DatabaseAccessInterface.create(query);
	}
	public static int acceptApplication(int event_id, int band_id){
		//updates the event so it is now filled
		String query = "UPDATE events SET isFilled = 1, band_id =" + band_id + " WHERE id = " + event_id;
		System.out.println(query);
		return DatabaseAccessInterface.update(query);

	}
	public static int denyApplication(int event_id, int band_id){
		String query = "DELETE FROM applications WHERE event_id = " + event_id + " AND band_id = " + band_id + ";";
		System.out.println(query);
		return DatabaseAccessInterface.delete(query);
	}
	public static Vector<application >getApplicationsByBand(int band_id){
		Vector<application> bandapps = new Vector<application>();
		String query = "SELECT * FROM applications WHERE band_id = " + band_id; 
		ResultSet rs = DatabaseAccessInterface.retrieve(query);
		try {
			
			while(rs.next()){
				application app = new application(rs.getInt(1),rs.getInt(2),rs.getInt(3));
				bandapps.add(app);
			}
			
		} catch (SQLException e) {
			return null;
		}
		return bandapps;
	}
	public static Vector<application> getApplicationsByEvent(int event_id){
		Vector<application> eventapps = new Vector<application>();
		String query = "SELECT * FROM applications WHERE event_id = " + event_id; 
		ResultSet rs = DatabaseAccessInterface.retrieve(query);
		try {
			
			while(rs.next()){
				application app = new application(rs.getInt(1),rs.getInt(2),rs.getInt(3));
				eventapps.add(app);
			}
			
		} catch (SQLException e) {
			return null;
		}
		return eventapps;
	}
	public static Vector<event> getEvents(){
		Vector<event> currEvents = new Vector<event>();
		String query = "SELECT * FROM events";
		ResultSet rs = DatabaseAccessInterface.retrieve(query);
		try {
			
			while(rs.next()){
				boolean curr = false;
				if(rs.getInt(5) == 1)curr = true;
				event evnt = new event(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4), curr, rs.getInt(6),rs.getString(7));
				currEvents.add(evnt);
			}
			
		} catch (SQLException e) {
			return null;
		}
		return currEvents;
	}
	public static Vector<event> getEventsByVenue(int venue_id){
		Vector<event> currEvents = new Vector<event>();
		String query = "SELECT * FROM events WHERE venue_id = " + venue_id;
		ResultSet rs = DatabaseAccessInterface.retrieve(query);
		try {
			
			while(rs.next()){
				boolean curr = false;
				if(rs.getInt(5) == 1)curr = true;
				event evnt = new event(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4), curr, rs.getInt(6),rs.getString(7));
				currEvents.add(evnt);
			}
			
		} catch (SQLException e) {
			return null;
		}
		return currEvents;
	}
	public static Vector<event> getEventsByBand(int band_id){
		Vector<event> currEvents = new Vector<event>();
		String query = "SELECT * FROM events WHERE band_id = " + band_id;
		ResultSet rs = DatabaseAccessInterface.retrieve(query);
		try {
			
			while(rs.next()){
				boolean curr = false;
				if(rs.getInt(5) == 1)curr = true;
				event evnt = new event(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4), curr, rs.getInt(6),rs.getString(7));
				currEvents.add(evnt);
			}
			
		} catch (SQLException e) {
			return null;
		}
		return currEvents;
	}
}