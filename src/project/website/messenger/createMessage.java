package project.website.messenger;

import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
		
		String userType = request.getParameter("user_type");//good
		String sender_id=request.getParameter("sender_id");//good
		String recipient_name=request.getParameter("recipient_name");//good
		String sender_name=request.getParameter("sender_name");//good
		String timesent = new SimpleDateFormat("dd-MM-yyyy").format(new Date());//good
		String title = request.getParameter("title");//good
		String contents = request.getParameter("contents");//good
		String recipient_id="";
		try {
			System.out.println("now searching for id for username:" + recipient_name);
			recipient_id = DBinteract.getUserIdByName(recipient_name);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("The type of user you are sending this message to is..."+ userType);
	
		
		DBinteract.createMessage(sender_name, sender_id, recipient_name, recipient_id, title, contents, timesent);

		request.getRequestDispatcher("./Inbox.html").forward(request, response);//forwards the request

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
