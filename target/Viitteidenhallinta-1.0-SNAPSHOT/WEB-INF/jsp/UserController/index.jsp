<%-- 
    Document   : index
    Created on : Jan 25, 2013, 4:38:45 PM
    Author     : timmy
--%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <form:form commandName="person" action="${pageContext.request.contextPath}/login" method="POST">
            <form:input path="socialSecurityNumber" /><form:errors path="socialSecurityNumber" /><br/>
            <form:input path="name" /><form:errors path="name" /><br/>
            <form:input path="email" /><form:errors path="email" /><br/>
            <input type="submit">
        </form:form>
        
    </body>
</html>
