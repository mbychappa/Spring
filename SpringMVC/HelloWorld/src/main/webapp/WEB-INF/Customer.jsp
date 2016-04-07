<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head><title>Customer Info</title></head>
<body>
<table>
  <form:form action="saveCustomer" method="post" commandName="customer">
	<tr>  <td>Customer Name:</td> <td><form:input  path="customerName"/> </td> </tr> 
	<tr> <td colspan=2>   <input type="submit"> </td>
  </form:form>
</table>   
</body>
</html> 