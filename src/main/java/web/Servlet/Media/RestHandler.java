package web.Servlet.Media;

import java.net.HttpURLConnection;
import java.net.URL;

public class RestHandler {
	public String getOutput(String url,String method) {
		String output;
		try {
			URL ul = new URL(url);
			HttpURLConnection urlconnection  = (HttpURLConnection) ul.openConnection();
		}catch(Exception ex) {
			
		}
		return null;
	}
	
}
