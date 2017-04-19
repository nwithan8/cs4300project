package project.website.band;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import project.website.objects.Band;
import project.website.objects.Venue;

/**
 * Servlet implementation class OpenProfile
 */
@WebServlet("/OpenProfile")
public class OpenProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OpenProfile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("search");
		String type = request.getParameter("typeofsearch");
		
		if(type.equals("band")){
		Band theband = new Band();
		
		try {
			theband = DBinteract.getBandInfo(name);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		request.setAttribute("band_name", theband.getName() );
		request.setAttribute("band_email", theband.getEmail());
		request.setAttribute("band_phone", theband.getTelephone());
		request.setAttribute("band_description", theband.getDescription());
		request.setAttribute("facebook", theband.getFacebook());
		request.setAttribute("twitter", theband.getTwitter());
		request.setAttribute("youtube", theband.getYoutube());
		request.setAttribute("soundcloud", theband.getSoundcloud());
		request.getRequestDispatcher("./Band.ftl").forward(request, response);//forwards the request
		}else if(type.equals("venue")){
			Venue thevenue = new Venue();
			
			try {
				thevenue = DBinteract.getVenueInfo(name);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
			request.setAttribute("venue_name", thevenue.getVenue_name() );
			request.setAttribute("venue_email", thevenue.getEmail());
			request.setAttribute("venue_phone", thevenue.getTelephone());
			request.setAttribute("venue_description", thevenue.getDescription());
			request.setAttribute("facebook", thevenue.getFacebook());
			request.setAttribute("twitter", thevenue.getTwitter());
			request.setAttribute("youtube", thevenue.getYoutube());
			request.getRequestDispatcher("./Venue.ftl").forward(request, response);//forwards the request
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
