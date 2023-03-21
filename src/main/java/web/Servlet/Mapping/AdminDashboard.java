package web.Servlet.Mapping;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Admin-dashboard")
public class AdminDashboard extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req , HttpServletResponse res)  {
		try{
			RequestDispatcher rd = req.getRequestDispatcher("/jsp/adminDashboard.jsp");
			rd.forward(req, res);
		}catch(Exception ex) {
			System.err.println(ex);
		}
	}
	protected void doGet(HttpServletRequest req , HttpServletResponse res){
		doPost(req,res);
	}
}
