package web.Servlet.Mapping;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import web.Servlet.Media.RestHandler;

@WebServlet("signin")
public class SignIn extends HttpServlet{
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		String username =(String) req.getAttribute("userid");
		String password =(String) req.getAttribute("password");
		if(username != null &&password !=null) {
			String ip="http://192.168.43.9";
		String url = ip+":9090/auth/validate?username="+username+"&password="+password;
		String id = new RestHandler().getOutput(url,"GET");
		res.sendRedirect(id!=null?"jsp/Dashboard.jsp":"jsp/auth.jsp?");
		}else {
			throw new IOException("input error");
		}
	}
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		doPost(req,res);
	}
}
