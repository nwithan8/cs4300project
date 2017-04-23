package project.website.messenger;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import project.website.band.DBinteract;
import project.website.objects.Band;
import project.website.objects.Venue;

/**
 * Servlet implementation class createMessage
 */
@WebServlet("/createMessage")
public class createMessage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public createMessage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*
		 * needed to make full request
		 * sender_name GOOD
		 * sender_id GOOD
		 * recipient_name GOOD
		 * recipient_id NEED THIS
		 * title GOOD
		 * contents GOOD
		 * time_sent GOOD
		 * 
		 * */
		Band theband = new Band();
		Venue thevenue = new Venue();
		
		String userType = request.getParameter("user_type");
		String sender_id=request.getParameter("sender_id");
		String recipient_name=request.getParameter("recipient_name");
		String sender_name=request.getParameter("sender_name");
		String timesent = request.getParameter("time_sent");
		String title = request.getParameter("title");
		String contents = request.getParameter("contents");
		String recipient_id = "";
		if(userType.equals("band")){
			try {
				theband = DBinteract.getBandInfo(recipient_name);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			recipient_id = Integer.toString(theband.getId());
			
		}else if(userType.equals("venue")){
			try {
				thevenue = DBinteract.getVenueInfo(recipient_name);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			recipient_id = Integer.toString(thevenue.getId());

		}
		
		DBinteract.createMessage(sender_name, sender_id, recipient_name, recipient_id, title, contents, timesent);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
