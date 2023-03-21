<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<section id="uploadmedia">
		<form action="uploadmedia" method="POST" enctype="multipart/form-data">
			FILE Upload : <input name="file" type="file"><br>
			FILE NAME   : <input type="text" name="filename"><br>
			FILE Description :<input type="text" name="filedescrip"><br>
			File tags :<input type="text" name="filetags"><br>
			<input type="submit">
		</form>
	</section>
</body>
</html>