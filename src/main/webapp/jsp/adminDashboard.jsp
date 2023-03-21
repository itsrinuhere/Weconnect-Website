<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page import="java.util.*"  %>
    <%@ page import="web.Servlet.Media.*" %>
<jsp:include page="Header.jsp" />
<body>
	<nav class="navbar navbar-light" style="background-color: #e3f2fd;">
  		 <a class="navbar-brand" href="#">Weconnect</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarText">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Features</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Pricing</a>
      </li>
    </ul>
    <span class="navbar-text">
      Navbar text with an inline element
    </span>
  </div>
</nav>
	<Section id="view">
	<div class="card">
  <div class="card-header">
    Featured
  </div>
  <div class="card-body">
    <h5 class="card-title">Special title treatment</h5>
    <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
    <a href="#" class="btn btn-primary">Go somewhere</a>
  </div>
</div>
	<div class="b-example-divider"></div>

  <div class="bg-dark text-secondary px-4 py-5 text-center">
    <div class="py-5">
      <h1 class="display-5 fw-bold text-white">Dark mode hero</h1>
      <div class="col-lg-6 mx-auto">
        <p class="fs-5 mb-4">Quickly design and customize responsive mobile-first sites with Bootstrap, the world’s most popular front-end open source toolkit, featuring Sass variables and mixins, responsive grid system, extensive prebuilt components, and powerful JavaScript plugins.</p>
        <div class="d-grid gap-2 d-sm-flex justify-content-sm-center">
          <button type="button" class="btn btn-outline-info btn-lg px-4 me-sm-3 fw-bold">Custom button</button>
          <button type="button" class="btn btn-outline-light btn-lg px-4">Secondary</button>
        </div>
      </div>
    </div>
  </div>

  <div class="b-example-divider mb-0"></div>

	</Section>
	<section id="media">
	
	<%
	try{
		response.setIntHeader("Refresh", 5);
		List<PDF> data = new MediaServices().data;
		if(data!=null){
			int i=data.size()-1;
			while(i>=0){
				%>
				 <div class="container col-xxl-8 px-4 py-5">
    					<div class="row flex-lg-row-reverse align-items-center g-5 py-5">
      							<div class="col-10 col-sm-8 col-lg-6">
        							<img src="https://getbootstrap.com/docs/5.3/examples/heroes/bootstrap-themes.png" class="d-block mx-lg-auto img-fluid" alt="Bootstrap Themes" width="700" height="500" loading="lazy">
      							</div>
      							<div class="col-lg-6">
        							<h1 class="display-5 fw-bold lh-1 mb-3"><%out.println(data.get(i).getFilename()); %></h1>
        							<p class="lead"><%out.println(data.get(i).getFiledescrption()+"<h5> Uploaded By :"+data.get(i).getUploaded_by()+"</h5>");%></p>
        							<div class="d-grid gap-2 d-md-flex justify-content-md-start">
        							<%	out.println("pdf name : "+data.get(i).getFilename()+" check out <a href=\"preview?id="+data.get(i).getId()+"\">Preview</a>"+"<br>");%>
          								<button type="button" class="btn btn-primary btn-lg px-4 me-md-2">Primary</button>
          								<button type="button" class="btn btn-outline-secondary btn-lg px-4">Default</button>
        							</div>
      							</div>
    					</div>
  				</div>
				<%
				i--;
				out.println("<div class=\"b-example-divider\"></div>");
			}//end of the while
		}//end of the if 
		else{
			out.println("<h2>nothing!</h2>");
		}
	}catch(Exception ex){
		out.println("sorry for inconvienice please try again ");
	}
	
	//	out.println("pdf name : "+data.get(i).getFilename()+" check out <a href=\"preview?id="+id+"\">Preview</a>"+"<br>");
		//out.print("<a href=\"#\">Download</a>");
	%>
	</section>
</body>
</html>