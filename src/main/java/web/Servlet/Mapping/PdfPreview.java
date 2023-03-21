package web.Servlet.Mapping;
import java.io.PrintWriter;
import java.util.Base64;
import java.util.List;


import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import web.Servlet.Media.MediaServices;
import web.Servlet.Media.PDF;

@WebServlet("/preview")
public class PdfPreview extends HttpServlet{
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest req , HttpServletResponse res)  {
	PrintWriter out;
		try{
			res.setContentType("text/html");
		out= res.getWriter();
		out.println("Heres the preview and download Link");
		String id = req.getParameter("id");
		PDF data = new MediaServices().getfile(id);
		String o = "data:"+data.getFiletype()+";base64,"+Base64.getEncoder().encodeToString(data.getFile());
		out.println("385\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "Implementation of a PDF file in your HTML web-page is very easy.\r\n"
				+ "\r\n"
				+ "<iframe src=\""+o+"\" width=\"720px\" height=\"480px\" />");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	protected void doGet(HttpServletRequest req , HttpServletResponse res)  {
		doPost(req,res);
	}
}
