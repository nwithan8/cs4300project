package project.website.band;

import project.website.objects.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;

import project.website.objects.Band;
import project.website.objects.Venue;



public class DBinteract{
	public static Vector<project.website.objects.Message> getMessages(String username) throws SQLException{
		Vector<project.website.objects.Message> messageVector = new Vector <project.website.objects.Message>();
		String query = "Select * from messages where recipient_name ='"+username+"';";
		ResultSet rs = DatabaseAccessInterface.retrieve(query);
		while(rs.next()){
			project.website.objects.Message newMessage = new project.website.objects.Message();
			newMessage.setRecipient_id(Integer.parseInt(rs.getString("recipient_id")));
			newMessage.setRecipient_name(rs.getString("recipient_name"));
			newMessage.setSender_id(Integer.parseInt(rs.getString("sender_id")));
			newMessage.setSender_name(rs.getString("sender_name"));
			newMessage.setTime_sent(rs.getString("time_sent"));
			newMessage.setContents(rs.getString("contents"));
			newMessage.setTitle(rs.getString("title"));
		
			messageVector.add(newMessage);
		}
		return messageVector;
		
	}
	public static String getUserIdByName(String name) throws SQLException{
		String userId = "";
		String queryone = "Select id from band where band_name= '"+name+"';";
		String querytwo = "Select id from venue where venue_name= '"+name+"';";
		
		ResultSet rs1 = DatabaseAccessInterface.retrieve(queryone);
		if(!rs1.next()){
			System.out.println("No id found in band for user:" + name+" now searching in venue" );

			ResultSet rs2 = DatabaseAccessInterface.retrieve(querytwo);

			while(rs2.next()){
				
				userId = Integer.toString(rs2.getInt("id"));
				break;
			}
		}else{
	

			userId = Integer.toString(rs1.getInt("id"));
			System.out.println("User Id found for band:" + name+" is "+userId );


		}

		return userId;
		
	}
	public static int createMessage (String sender_name, String sender_id, String recipient_name, String recipient_id, String title, String contents, String timesent){
		int z = 0;
		String query = "INSERT INTO messages values (";
		query +="null" + ", '" + sender_name + "','" + recipient_name + "'," + sender_id + "," + recipient_id + ",'" + title;
		//,"here is a message","1-1-2017");";
		query += "','" + contents + "','" + timesent + "');"; 
		System.out.println(query);
		z =  DatabaseAccessInterface.create(query);
		return z;
		}
	
	public static int login(String username, String password){
		int success = 0;
		int numResults = 0;
		
		String query = "select * from account_info where username = \'" + username + "\' and pw = \'" + password + "\'" ;
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
		String query = "insert into account_info values (";
		String id = Integer.toString(getMaxId(choice));
		query+=id;
		query+= ", '" + username + "', '" + password + "')";
		System.out.println(query);
		int z =  DatabaseAccessInterface.create(query);
		if(z==0)return z;
		
		if(choice){
			String query2 = "insert into venue values (";
			query2+=id;
			query2+=", '" + name + "', '" + description + "', null,'" + email + "', null,null,null)";
			System.out.println(query2);
			z =  DatabaseAccessInterface.create(query2);
			
		}
		else if(!choice){
			String query2 = "insert into band values (";
			query2+=id;
			query2+=", '" + name + "','" + description + "', null,'" + email + "', null,null,null,null)";
			System.out.println(query2);
			z =  DatabaseAccessInterface.create(query2);
		}
		z = Integer.parseInt(id);
		return z;
		

	}
	//choice is 1 is its a venue, 0 if its a band
	public static int getMaxId(boolean choice){
		String query = "select MAX(id) from account_info ";
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
	/*
	String bandname = request.getParameter("bandname");
	String facebook  = request.getParameter("facebook");
	String email = request.getParameter("email");
	String twitter = request.getParameter("twitter");
	String soundcloud = request.getParameter("soundcloud");
	String youtube = request.getParameter("youtube");
	String telephone = request.getParameter("telephone");
	String[]genres = request.getParameterValues("genres");*/
	
	public static int fillBandInfo(String Bandname, String facebook, String twitter, String soundcloud,String youtube, String telephone){
		String query = "UPDATE band SET facebook ='"+facebook+"',twitter='"+twitter+"',soundcloud='"+soundcloud+"',youtube='"+youtube+"',telephone='"+telephone+"' WHERE band_name='"+Bandname+"';";
		int z =  DatabaseAccessInterface.create(query);
		
		return z;
	}
	public static int fillVenueInfo(String Venuename, String facebook, String twitter,String youtube, String telephone){
		String query = "UPDATE venue SET facebook ='"+facebook+"',twitter='"+twitter+"', youtube='"+youtube+"',telephone='"+telephone+"' WHERE venue_name='"+Venuename+"';";
		int z =  DatabaseAccessInterface.create(query);
		
		return z;
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

	public static Vector<String> getApplicantsByEventID(int eventid){
		Vector<String> applicantlist = new Vector<String>();
		String query = "Select band_name from band join applications ON applications.band_id = band.id  AND applications.event_id ="+eventid+";";
		ResultSet rs = DatabaseAccessInterface.retrieve(query);
		try {
			
			while(rs.next()){
				applicantlist.add(rs.getString(1));

			}
			
		} catch (SQLException e) {
			return null;
		}
			return applicantlist;
		
		
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
		String query = "SELECT * FROM events WHERE venue_id = " + venue_id+";";
		ResultSet rs = DatabaseAccessInterface.retrieve(query);
		try {
			
			while(rs.next()){
				boolean curr = false;
				if(rs.getInt(5) == 1)curr = true;
				event evnt = new event(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4), curr, rs.getInt(6),rs.getString(7));
				System.out.println("Added event titled : "+ evnt.getTitle());
				currEvents.add(evnt);
			}
			
		} catch (SQLException e) {
			return null;
		}
		return currEvents;
	}
	public static Vector<String> getSearchResults(String str, String queryType) throws SQLException{
		Vector<String> SearchResults = new Vector<String>();
		if(queryType.equals("band")){
		String query = "SELECT band_name FROM band WHERE band_name LIKE '%"+str+"%';";
		ResultSet rs = DatabaseAccessInterface.retrieve(query);
		while(rs.next()){
			SearchResults.add(rs.getString(1));
		}
		}else if(queryType.equals("venue")){
			String query = "SELECT venue_name FROM venue WHERE venue_name LIKE '%"+str+"%';";
			ResultSet rs = DatabaseAccessInterface.retrieve(query);
			while(rs.next()){
				SearchResults.add(rs.getString(1));
			}
			
		}
		return SearchResults;
		
	}
	public static Band getBandInfo(String bandname) throws SQLException{
		Band theBand = new Band();
		String query = "SELECT * FROM band WHERE band_name = '"+bandname+"';";
		ResultSet rs = DatabaseAccessInterface.retrieve(query);
		while(rs.next()){
			String id = rs.getString("id");
			String band_name=rs.getString("band_name");
			String description=rs.getString("description");
			String telephone=rs.getString("telephone");
			String email=rs.getString("email");
			String facebook=rs.getString("facebook");
			String twitter=rs.getString("twitter");
			String soundcloud=rs.getString("soundcloud");
			String youtube=rs.getString("youtube");
			theBand.setId(Integer.parseInt(id));
			theBand.setName(band_name);
			theBand.setDescription("description");
			theBand.setTelephone(telephone);
			theBand.setEmail(email);
			theBand.setFacebook(facebook);
			theBand.setTwitter(twitter);
			theBand.setSoundcloud(soundcloud);
			theBand.setYoutube(youtube);
		}
		
		return theBand;
		
	}
	public static Band getBandInfoById(int id) throws SQLException{
		Band theBand = new Band();
		String query = "SELECT * FROM band WHERE id = '"+id+"';";
		ResultSet rs = DatabaseAccessInterface.retrieve(query);
		while(rs.next()){
			String band_name=rs.getString("band_name");
			String description=rs.getString("description");
			String telephone=rs.getString("telephone");
			String email=rs.getString("email");
			String facebook=rs.getString("facebook");
			String twitter=rs.getString("twitter");
			String soundcloud=rs.getString("soundcloud");
			String youtube=rs.getString("youtube");
			theBand.setName(band_name);
			theBand.setDescription("description");
			theBand.setTelephone(telephone);
			theBand.setEmail(email);
			theBand.setFacebook(facebook);
			theBand.setTwitter(twitter);
			theBand.setSoundcloud(soundcloud);
			theBand.setYoutube(youtube);
		}
		
		return theBand;
		
	}
	public static Venue getVenueInfo(String venuename) throws SQLException{
		Venue theVenue = new Venue();
		String query = "SELECT * FROM venue WHERE venue_name = '"+venuename+"';";
		ResultSet rs = DatabaseAccessInterface.retrieve(query);
		while(rs.next()){
			String id = rs.getString("id");
			String venue_name=rs.getString("venue_name");
			String description=rs.getString("description");
			String telephone=rs.getString("telephone");
			String email=rs.getString("email");
			String facebook=rs.getString("facebook");
			String twitter=rs.getString("twitter");
			String youtube=rs.getString("youtube");
			theVenue.setId(Integer.parseInt(id));
			System.out.println("The Id of the venue "+venue_name+" is "+theVenue.getId());
			theVenue.setVenue_name(venue_name);
			theVenue.setDescription(description);
			theVenue.setTelephone(telephone);
			theVenue.setEmail(email);
			theVenue.setFacebook(facebook);
			theVenue.setTwitter(twitter);
			theVenue.setYoutube(youtube);
		}
		
		return theVenue;
		
	}
	public static Venue getVenueInfoById(int id) throws SQLException{
		Venue theVenue = new Venue();
		String query = "SELECT * FROM venue WHERE id = '"+id+"';";
		ResultSet rs = DatabaseAccessInterface.retrieve(query);
		while(rs.next()){
			String venue_name=rs.getString("venue_name");
			String description=rs.getString("description");
			String telephone=rs.getString("telephone");
			String email=rs.getString("email");
			String facebook=rs.getString("facebook");
			String twitter=rs.getString("twitter");
			String youtube=rs.getString("youtube");
			theVenue.setVenue_name(venue_name);
			theVenue.setDescription(description);
			theVenue.setTelephone(telephone);
			theVenue.setEmail(email);
			theVenue.setFacebook(facebook);
			theVenue.setTwitter(twitter);
			theVenue.setYoutube(youtube);
		}
		
		return theVenue;
		
	}
	public static Vector<event> getEventsByVenueName(String venue_name){
		int id = -1;
		String query = "SELECT * FROM venue WHERE venue_name = '" + venue_name + "';";
		ResultSet rs = DatabaseAccessInterface.retrieve(query);
		try {
			
			while(rs.next()){
				id = rs.getInt(1);
				System.out.println("Found venue with matching ID");
			}
			
		} catch (SQLException e) {
			return null;
		}
		Vector<event> events = getEventsByVenue(id);
		return events;
	}
	public static Vector<event> getEventsByBandName(String band_name){
		int id = -1;
		String query = "SELECT * FROM band WHERE band_name = '" + band_name + "';";
		ResultSet rs = DatabaseAccessInterface.retrieve(query);
		try {
			
			while(rs.next()){
				id = rs.getInt(1);
				System.out.println("Found band with matching ID");
			}
			
		} catch (SQLException e) {
			return null;
		}
		Vector<event> events = getEventsByBand(id);
		return events;
	}
	
	public static Vector<event> getEventsByBand(int band_id){
		String query = "Select * from events join applications ON applications.band_id = "+band_id+"  AND events.id = applications.event_id;";

		Vector<event> currEvents = new Vector<event>();
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