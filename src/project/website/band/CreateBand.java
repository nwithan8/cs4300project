package project.website.band;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateBand
 */
@WebServlet("/CreateBand")
public class CreateBand extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateBand() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		DBinteract database = new DBinteract();
		String bandname = request.getParameter("bandname");
		String description = request.getParameter("description");
		String facebook  = request.getParameter("facebook");
		String email = request.getParameter("email");
		String twitter = request.getParameter("twitter");
		String soundcloud = request.getParameter("soundcloud");
		String youtube = request.getParameter("youtube");
		String telephone = request.getParameter("phonenumber");
		String[]genres = request.getParameterValues("genres");
		DBinteract.fillBandInfo( bandname, facebook,  twitter,  soundcloud, youtube,  telephone);
		
	
        
		request.setAttribute("band_name", bandname );
		request.setAttribute("band_email", email);
		request.setAttribute("band_phone", telephone);
		request.setAttribute("band_description", description);
		request.getRequestDispatcher("./Band.ftl").forward(request, response);//forwards the request
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
