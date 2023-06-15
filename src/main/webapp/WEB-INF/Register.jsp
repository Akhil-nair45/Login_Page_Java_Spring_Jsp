<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action = "insert" method="post">
Hotel Name: <input type = "text" name = "hotelname" required/><br><br>
Food Name: <input type = "text" name = "foodname" required/><br><br>
<label >Food Category</label>
<select name="fcate">
<option >Break Fast</option>
<option >Lunch</option>
<option >Dinner</option>
<option >Starters</option>
<option >All Time</option>
</select>
Description: <input type = "text" name = "description" required/><br><br>
Price: <input type = "number" name = "price" required/><br><br>
<label for="myfile">Food Image:</label>
  <input type="file" id="myfile" name="myfile"><br><br>
  <input type="Add Food">
  </form>
</body>
</html>



