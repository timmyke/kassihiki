<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello I am...</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">
    </head>
    <body>
        
        <div id="profile">${profile.name}</div>
        
        <h1>Hello I am...</h1>
        
        <form:form commandName="description" action="${pageContext.request.contextPath}/app/" method="POST">
            <form:input id="title" path="title" /> <form:errors path="title" />
            <input type="submit" value="Describe">
        </form:form>
            
        <ul>
            <c:forEach var="description" items="${descriptions}">
                <li>${description.title}</li>
            </c:forEach>
        </ul>
        
    </body>
</html>