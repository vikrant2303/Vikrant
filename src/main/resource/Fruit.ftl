<html>
	<head>
		<title>Fruit Picker</title>
	</head>
	<body>
		<form action="/favfruit" method="Post"/>
		<p>Choose your favourite fruit...</p>
		 <#list Fruits as fruit>
		 <p><input type="radio" name="fruit" value="${fruit}">${fruit}</input></p></#list>
		 <input type="submit" value="submit"/>
		
	</body>
</html>