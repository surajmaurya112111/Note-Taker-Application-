<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Add Notes</title>
<%@include file="all_js_css.jsp"%>

</head>
<body>



	<div class="container">
		<%@include file="napbar.jsp"%>

		<br>

		<h1>Please fill your note detail</h1>
		<!-- this is add from to containat  -->
		<br>

		<form action="SaveNoteServlet" method="post">
			<div class="form-group">
				<label for="title">Note title</label> <input name="title" required type="text"
					class="form-control" id="title" aria-describedby="emailHelp"
					placeholder="Enter hear"/>

			</div>
			<div class="form-group">
				<label for="exampleInputPassword1">Note content</label>
				<textarea name="content" required id="content" placeholder="Enter your content"
					class="form-control" style="height: 250px"></textarea>
			</div>

			<!-- <div class="form-group form-check">
    <input type="checkbox" class="form-check-input" id="exampleCheck1">
    <label class="form-check-label" for="exampleCheck1">Check me out</label>
  </div> -->
			<div class="container text-center">
				<button type="submit" class="btn btn-primary">Add</button>

			</div>

		</form>
	</div>




</body>
</html>