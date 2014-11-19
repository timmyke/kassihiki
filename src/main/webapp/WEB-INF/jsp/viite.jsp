<!doctype html>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <meta charset="utf-8">
    <title>Vuonhallinta</title>

    <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link href="//netdna.bootstrapcdn.com/bootstrap/2.3.2/css/bootstrap.min.css" rel="stylesheet">

    <!--
      IMPORTANT:
      This is Heroku specific styling. Remove to customize.
    -->
    
    <link href="http://heroku.github.com/template-app-bootstrap/heroku.css" rel="stylesheet">
    
    <!-- /// -->

</head>

<body>
<div class="navbar navbar-fixed-top">
    <div class="navbar-inner">
        <div class="container">
            <a href="/" class="brand">Vuonhallinta</a>
            <a href="/" class="brand" id="heroku">by <strong>jati</strong></a>
        </div>
    </div>
</div>

<div class="container">
    <br>
            <!-- <div class="page-header">
               <h1>Simple CRUD Page</h1> 
            </div>-->
            <form:form method="post" action="add" commandName="project" class="form-horizontal" role="form">
                <div class="form-group">
                <form:label path="name" class="col-sm-2 control-label">Nimi</form:label>
                <div class="col-sm-10"><form:input path="name" class="form-control" /></div>
                </div>
               
           
                
                <input type="submit" value="Lisää" class="btn"/>
            </form:form>


            <c:if  test="${!empty projectList}">
                <h3><a href="/bibliography">Projektit</a></h3>
                <table class="table table-bordered table-striped">
                    <thead>
                    <tr>
                        <th>Name</th>
                        <th>&nbsp;</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${projectList}" var="project">
                        <tr>
                            <td><a href="/project/${project.id}">${project.name}</a></td>
                            <td><form action="delete/${project.id}" method="post"><input type="submit" class="btn btn-danger btn-mini" value="Delete"/></form></td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </c:if>
       
    
</div>

</body>
</html>
