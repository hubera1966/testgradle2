package testgradle2;



import java.io.IOException;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import javax.servlet.ServletException;
import java.io.PrintWriter;



/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String yourName = request.getParameter("yourName");
		PrintWriter writer = response.getWriter();
		writer.println("<h1>Hallo mein lieber Herr/Frau/Divers " + yourName + "</h1>");
		System.out.println( "Name = " + yourName );
		writer.println("<br>");
		writer.println("Willkommen im testgradle2 project, hier gehts zurueck ... <a href=/testgradle2/>Startseite</a>");
		writer.close();
	}

}
