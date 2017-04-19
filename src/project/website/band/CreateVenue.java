package project.website.band;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateVenue
 */
@WebServlet("/CreateVenue")
public class CreateVenue extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateVenue() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		DBinteract database = new DBinteract();
		String venuename = request.getParameter("venuename");
		String description = request.getParameter("description");
		String facebook  = request.getParameter("facebook");
		String email = request.getParameter("email");
		String twitter = request.getParameter("twitter");
		String youtube = request.getParameter("youtube");
		String telephone = request.getParameter("phonenumber");
		DBinteract.fillVenueInfo( venuename, facebook,  twitter, youtube,  telephone);
		
	
        
		request.setAttribute("venue_name", venuename );
		request.setAttribute("venue_email", email);
		request.setAttribute("venue_phone", telephone);
		request.setAttribute("venue_description", description);
		request.setAttribute("facebook", facebook);
		request.setAttribute("twitter", twitter);
		request.setAttribute("youtube", youtube);

		request.getRequestDispatcher("./Venue.ftl").forward(request, response);//forwards the request	}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
