package web.Servlet.Mapping;

import java.io.InputStream;
import java.io.PrintWriter;
import java.util.UUID;

import jakarta.servlet.http.Part;
import web.Servlet.Media.MediaServices;
import web.Servlet.Media.PDF;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/uploadmedia")
@MultipartConfig(maxFileSize = 16177215)
public class MediaUploadServlet extends HttpServlet {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

protected void doPost(HttpServletRequest req,HttpServletResponse res){
	try {
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		 InputStream inputStream = null; // input stream of the upload file
		 Part filePart = req.getPart("file");
		 if(filePart != null) {
			 inputStream = filePart.getInputStream();
		 }else {
			 out.print("file already received ");
		 }
		 byte[] file = inputStream.readAllBytes();
		PDF pdf = new PDF();
		pdf.setFiletype(filePart.getContentType());
		pdf.setId(UUID.randomUUID().toString());
		pdf.setSize(filePart.getSize());
		pdf.setUploaded_by("admin");
		pdf.setFile(file);
		pdf.setFiledescrption(req.getParameter("filedescrip"));
		pdf.setFilename(req.getParameter("filename"));
		pdf.setTags(null);
		if(new MediaServices().mediaSave(pdf)) {
			out.println("success full");
		}else out.println("failed to upload");
	}catch(Exception ex){
		ex.printStackTrace();
	}
}
}
