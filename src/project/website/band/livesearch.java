package project.website.band;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class livesearch
 */
@WebServlet("/livesearch")
public class livesearch extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public livesearch() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		DBinteract database = new DBinteract();
		String search = request.getParameter("q");
		String searchType = request.getParameter("searchtype");
		Vector<String> searchresults = null;
		try {
			searchresults = DBinteract.getSearchResults(search,searchType);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String searchresultsstuff = "SEARCH RESULTS <br>";
		for(int i = 0; i<searchresults.size(); i++){
			searchresultsstuff+="<input type='button' style='background:transparent; border:none; font-size:15pt;' value='"+searchresults.get(i)+"' onclick=\"changeResults(this.value);\" >"+ "<br>";
		}
		response.getWriter().write(searchresultsstuff);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
