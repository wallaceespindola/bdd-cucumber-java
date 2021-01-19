 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Eat More Cucumbers Restaurant</title>
</head>
<body>
<h2>Eat More Cucumbers Restaurant Freshville</h2>
 <form action = "Index" method = "POST" target = "">
 <table>
 <tr>
 <td>Bill Amount: </td> 
 <td><input type = "text" id="billamount" name = "billamount"/></td>
</tr>

 <tr>
 <td>Tax Rate: </td> 
 <td><input type = "text" id="taxrate" name = "taxrate"/>  
 </td>
 </tr>
 <tr>
 <td></td>
 <td>
 <br> <input type = "submit" id="mybutton" value = "Calculate Final Bill" />
  </td>
  </tr>
  </table>
      </form>
</body>
</html>
