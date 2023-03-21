package web.Servlet.Media;


	import java.io.Serializable;
	import java.util.Date;

	import org.apache.commons.codec.binary.Base64;

import com.google.gson.annotations.SerializedName;
	public class Template implements Serializable{
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		@SerializedName("id")
		String id;
		@SerializedName("filename")
		String filename;
		@SerializedName("filedescription")
		String filedescrption;
		@SerializedName("uploaded_time")
		Date uploaded_time;
		@SerializedName("size")
		long size;
		@SerializedName("filetype")
		String filetype;
		String[] tags;
		String file;
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getFilename() {
			return filename;
		}
		public void setFilename(String filename) {
			this.filename = filename;
		}
		public String getFiledescrption() {
			return filedescrption;
		}
		public void setFiledescrption(String filedescrption) {
			this.filedescrption = filedescrption;
		}
		public Date getUploaded_time() {
			return uploaded_time;
		}
		public void setUploaded_time(Date uploaded_time) {
			this.uploaded_time = uploaded_time;
		}
		public String[] getTags() {
			return tags;
		}
		public void setTags(String[] tags) {
			this.tags = tags;
		}
		public String getFile() {
			return file;
		}
		public void setFile(String file) {
			this.file = file;
		}
		public String getUploaded_by() {
			return uploaded_by;
		}
		public void setUploaded_by(String uploaded_by) {
			this.uploaded_by = uploaded_by;
		}
		
		public long getSize() {
			return size;
		}
		public void setSize(long size) {
			this.size = size;
		}
		public String getFiletype() {
			return filetype;
		}
		public void setFiletype(String filetype) {
			this.filetype = filetype;
		}
		String uploaded_by;
		
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("{\"description\":\""+getFiledescrption()+"\",");
			builder.append("\"filename\": \""+getFilename()+"\",");
			builder.append("\"size\": \""+getSize()+"\",");
			builder.append("\"filetype\": \""+getFiletype()+"\",");
			builder.append("\"id\":\""+getId()+"\",");
			try {
			//String n = new Base64().encodeToString(getFile());
		//	builder.append("\"file\":\""+n+"\"");
			}catch(Exception ex) {
				System.out.println(ex);
			}
			builder.append("}");
		return builder.toString();
	}

	}

