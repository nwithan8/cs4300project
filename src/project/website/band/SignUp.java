package project.website.band;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SignUp
 */
@WebServlet("/SignUp")
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		/* <input type="text" name="firstname" placeholder="First Name" style="color:grey; width:50%; margin-bottom:10px;"><br>
         <input type="text" name="lastname" placeholder="Last Name" style="color:grey; width:50%; margin-bottom:10px;"><br>
         <input type="text" name="email" placeholder="Email Address" style="color:grey; width:50%; margin-bottom:10px;"><br>
         <input type="text" name="username" placeholder="Username" style="color:grey; width:50%; margin-bottom:10px;"><br>
         <input type="text" name="password" placeholder="Password" style="color:grey; width:50%; margin-bottom:10px;"><br>
         <input type="text" name="passwordcheck" placeholder="Confirm Password" style="color:grey; width:50%; margin-bottom:10px;"><br>
         <input type=submit value="Sign Up" class="btn btn-default sr-button"><br><br> */

	      HttpSession session = request.getSession(true);

		DBinteract database = new DBinteract();
		String choice = request.getParameter("bandorvenue");
		Boolean thechoice;
		if(choice.equals("band")){thechoice=false;}else{thechoice=true;}
		String username = request.getParameter("username");
		String password  = request.getParameter("password");
		String email = request.getParameter("email");
		String bandname = request.getParameter("name");
		String lastname = request.getParameter("lastname");
		String description = request.getParameter("description");
		int id = database.createAccount(thechoice, username, password, bandname, description, email);


        request.setAttribute("id", id);
		request.setAttribute("description",description );
		request.setAttribute("email", email);
		request.setAttribute("name", bandname);
		request.setAttribute("bandname", bandname);

		request.getRequestDispatcher("./CreateBand.ftl").forward(request, response);//forwards the request
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
