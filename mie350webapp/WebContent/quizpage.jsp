<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR" %>
	<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

	<html lang="en">

		<head>
			<title>MIE350 Sample Web App - About</title>
			<meta charset="utf-8">
			<meta name="viewport" content="width=device-width, initial-scale=1">
			<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
			<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
			<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

			<!-- Date Picker Javascript -->
			<!-- https://jqueryui.com/datepicker/ -->
			<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
			<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
			<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

			<link rel="stylesheet" type="text/css" href="css/mystyle.css">

		</head>

		<body>

			<%@ include file="navbar.jsp" %>
				<div class="container-fluid">
					<div class="div overall-quiz">
						<p></p>
						<div class="question">
							<p>Katy Perry: dark Horse</p>
							<a href="https://www.youtube.com/watch?v=0KSOMA3QBU0">link to dark horse</a>
							<input type="range" min="0" max="10" value="5">

						</div>
						<div class="question">
							<p>Adele: hello</p>
							<input type="range" min="0" max="10" value="5">
							<a href="">abc</a>
						</div>
						<div class="question">
							<p>Lil Nas X: Industry Baby</p>
							<input type="range" min="0" max="10" value="5">
							<a href="">abc</a>
						</div>
					</div>
				</div>

		</body>

	</html>