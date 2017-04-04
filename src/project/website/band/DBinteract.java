package project.website.band;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



public class DBinteract{
	public static int login(String username, String password){
		int success = 0;
		int numResults = 0;
		
		String query = "select * from accountinfo where username = \'" + username + "\' and pw = \'" + password + "\'" ;
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
	public static int createAccount(boolean choice, String username, String password){
		String query = "insert into accountinfo values (";
		query+=Integer.toString(getMaxId(choice));
		query+= ", \"" + username + "\", \"" + password + "\")";
		System.out.println(query);
		return DatabaseAccessInterface.create(query);

	}
	//choice is 1 is its a venue, 0 if its a band
	public static int getMaxId(boolean choice){
		String query = "select MAX(id) from accountinfo";
		if(!choice)query += "where id <20000000";
		
		ResultSet rs = DatabaseAccessInterface.retrieve(query);
		
		
		try {
			int result = -2;
			while(rs.next())result = rs.getInt(1);
			return result + 1;
		} catch (SQLException e) {
			System.out.println("we had an error.");
			return -1;
		}
		
		
	}
}