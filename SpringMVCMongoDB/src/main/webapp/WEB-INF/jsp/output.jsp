<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false"%>
<html>
<body>
    <h2>Here is a simple CRUD using Spring MVC and MongoDB.</h2>
        <form action="customer/save" method="post">
            <input type="hidden" name="id">
            <label for="name">Customer Name</label>
            <input type="text" id="name" name="name"/>
            <input type="submit" value="Add Customer"/>
        </form>
    <table border="1">
            <tr>
                <td><h4>Customer Name</h4></td>
                <td><h4>Delete </h4></td>
            </tr>
        <c:forEach var="customer" items="${customerList}">
            <tr>
                <td>${customer.name}</td><td>
                <input type="button" value="Delete Customer" onclick="window.location='customer/delete?id=${customer.id}'"/></td>
            </tr>
        </c:forEach>
    </table>    
</body>
</html>