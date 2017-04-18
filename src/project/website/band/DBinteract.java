package project.website.band;

import java.sql.ResultSet;
import java.sql.SQLException;



public class DBinteract{
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
	
}