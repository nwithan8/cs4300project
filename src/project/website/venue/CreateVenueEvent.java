package project.website.venue;

import java.io.IOException;
import java.io.Writer;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapperBuilder;
import freemarker.template.SimpleHash;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;

/**
 * Servlet implementation class hello
 */
@WebServlet("/CreateVenueEvent")
public class CreateVenueEvent extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Configuration cfg = null;
	private String templateDir = "/WEB-INF/templates";
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateVenueEvent() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void init(){
    	cfg = new Configuration(Configuration.VERSION_2_3_25);
    	cfg.setServletContextForTemplateLoading(getServletContext(), templateDir);
    	cfg.setTemplateExceptionHandler(TemplateExceptionHandler.HTML_DEBUG_HANDLER);
    	
    }
    public void runTemplate(HttpServletRequest request, HttpServletResponse response) {

		// You can use this structure for all of your objects to be sent to browser
		Template template = null;
		DefaultObjectWrapperBuilder df = new DefaultObjectWrapperBuilder(Configuration.VERSION_2_3_25);
		SimpleHash root = new SimpleHash(df.build());
		
		String name = request.getParameter("name");
		String date = request.getParameter("date");
		String genre= request.getParameter("genre");
		root.put("name", name);
		root.put("date", date);
		root.put("genre", genre);
		
		
		try {
			String templateName = "CreateVenueEvent.ftl";
			template = cfg.getTemplate(templateName );
			response.setContentType("text/html");
			Writer out = response.getWriter();
			template.process(root, out);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (TemplateException e) {
			e.printStackTrace();
		}
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		runTemplate(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
