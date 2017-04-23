package project.website.band;

import java.io.IOException;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class showEvents
 */
@WebServlet("/showEvents")
public class showEvents extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public showEvents() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String venuename = request.getParameter("name");
		System.out.println("Name of venue querying events for is... "+ venuename);
		String Response=""; 
		Vector <event> eventvector = DBinteract.getEventsByVenueName(venuename);
		Vector <String> applicants = new Vector<String>();
		
		for(int i = 0; i<eventvector.size(); i++){
			applicants = DBinteract.getApplicantsByEventID(eventvector.get(i).getId());
			
			Response +="<center><h2 style='color:white;'>Event Number "+(i+1)+"</h2><br>";
	Response+= " <form style='color:white'action='' method='get'><br><br>";
       Response+= "<table style='border: 3px solid #224730'>";
Response+="      <tr>";
Response+="<td style='color: white;'>Name:</td>";
Response+="<td style='color: white;'>"+eventvector.get(i).getTitle()+"</td>";
Response+="</tr>";
Response+="<tr>";
Response+="<td style='color: white;'>Date: </td>";
Response+="<td style='color: white;'>"+eventvector.get(i).getTimeandplace()+"</td>";
Response+="</tr>";
Response+="<tr>";
Response+="<td style='color: white;'>Description: </td>";
Response+="<td style='color: white;'>"+eventvector.get(i).getDescription()+"</td>";

Response+="</tr>";
Response+="<tr>";
Response+="<td style='color: white;'>Applicant List: </td>";

Response+="</tr>";


for(int z = 0; z<applicants.size(); z++){
	Response+="<trstyle='text-align:center'>";
	Response+="<td style='color: red;'>"+applicants.get(z)+" </td>";
	Response+="</tr>";

	
}
Response+="</table>";
Response+="Artist: <input type='text' name='artist' id='artist"+i+"'/>";
Response+="<div id='myartist"+i+"'></div>";
Response+= "   </form>";

Response+="<button value='Sign Up!' id='but"+i+"' onclick='signUp("+eventvector.get(i).getId()+");'>Sign Up!</button></center>";

		}
		response.getWriter().write(Response);

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
