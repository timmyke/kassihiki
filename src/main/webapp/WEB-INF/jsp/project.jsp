<!doctype html>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <meta charset="utf-8">
    <title>Jati-vuonhallinta</title>

    <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link href="//netdna.bootstrapcdn.com/bootstrap/2.3.2/css/bootstrap.min.css" rel="stylesheet">

    <!--
      IMPORTANT:
      This is Heroku specific styling. Remove to customize.
    -->
    <link href="http://heroku.github.com/template-app-bootstrap/heroku.css" rel="stylesheet">
    <!-- /// -->
    <body>
        <h1>Taskit</h1>

        <form:form method="post" action="${task.projectId}" commandName="task" class="form-horizontal" role="form">
            <div class="form-group">
                <form:label path="name" class="col-sm-2 control-label">Nimi</form:label>
                <div class="col-sm-10"><form:input path="name" class="form-control" /></div>
            </div>



            <input type="submit" value="Lisää" class="btn"/>
        </form:form>
        <pre>${tiedot}</pre>

        <c:if  test="${!empty taskList}">
            <h3><a href="/#edit">Taskit</a></h3>
            <table class="table table-bordered table-striped">
                <thead>
                    <tr>
                        <th>TODO</th>
                        <th>In progres</th>
                        <th>Done</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${taskList}" var="task">
                        <tr>
                            
                                <td><a href="/task/${task.id}">${task.name} ${task.state}</a></td>
                            
                            
                            <c:if  test="${task.state == 1}">
                                <td><a href="/task/${task.id}">${task.name} ${task.state}</a></td>
                            </c:if>
                            
                            <c:if  test="${task.state == 2}">
                                <td><a href="/task/${task.id}">${task.name} ${task.state}</a></td>
                            </c:if>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </c:if>
    </body>
</html>

<!--
<form action="delete/${task.id}" method="post"><input type="submit" class="btn btn-danger btn-mini" value="Delete"/></form></
-->