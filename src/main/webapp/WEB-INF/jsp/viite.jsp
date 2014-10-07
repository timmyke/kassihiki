<!doctype html>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <meta charset="utf-8">
    <title>BibTeX-viitteidenhallinta</title>

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
            <a href="/" class="brand">BibTeX-viitteidenhallinta</a>
            <a href="/" class="brand" id="heroku">by <strong>kh</strong></a>
        </div>
    </div>
</div>

<div class="container">
    
            <!-- <div class="page-header">
               <h1>Simple CRUD Page</h1> 
            </div>-->
            <form:form method="post" action="add" commandName="viite" class="form-horizontal" role="form">
                <div class="form-group">
                <form:label path="author" class="col-sm-2 control-label">Author</form:label>
                <div class="col-sm-10"><form:input path="author" class="form-control" /></div>
                </div>
                <div class="form-group">
                <form:label path="book_title" class="col-sm-2 control-label">Book title</form:label>
                <form:input path="book_title" />
                </div>
                <div class="form-group">
                <form:label path="title" class="col-sm-2 control-label">Title</form:label>
                <form:input path="title"/>
                </div>
                <div class="form-group">
                <form:label path="year" class="col-sm-2 control-label">Year</form:label>
                <form:input path="year"/>
                </div>
                <div class="form-group">
                <form:label path="o_editor" class="col-sm-2 control-label">Editor</form:label>
                <form:input path="o_editor"/>
                </div>
                <div class="form-group">
                <form:label path="o_volumeOrNumber" class="col-sm-2 control-label">Volume or number</form:label>
                <form:input path="o_volumeOrNumber"/>
                </div>
                <div class="form-group">
                <form:label path="o_series" class="col-sm-2 control-label">Series</form:label>
                <form:input path="o_series"/>
                </div>
                <div class="form-group">
                <form:label path="o_pages" class="col-sm-2 control-label">Pages</form:label>
                <form:input path="o_pages"/>
                </div>
                <div class="form-group">
                <form:label path="o_address" class="col-sm-2 control-label">Address</form:label>
                <form:input path="o_address"/>
                </div>
                <div class="form-group">
                <form:label path="o_month" class="col-sm-2 control-label">Month</form:label>
                <form:input path="o_month"/>
                </div>
                <div class="form-group">
                <form:label path="o_organization" class="col-sm-2 control-label">Organization</form:label>
                <form:input path="o_organization"/>
                </div>
                <div class="form-group">
                <form:label path="o_publisher" class="col-sm-2 control-label">Publisher</form:label>
                <form:input path="o_publisher"/>
                </div>
                <div class="form-group">
                <form:label path="o_note" class="col-sm-2 control-label">Note</form:label>
                <form:input path="o_note"/>
                </div>
                <div class="form-group">
                <form:label path="o_key" class="col-sm-2 control-label">Key</form:label>
                <form:input path="o_key"/>
                </div>
           
                
                <input type="submit" value="Add Viite" class="btn"/>
            </form:form>


            <c:if  test="${!empty viiteList}">
                <h3>Viitteet</h3>
                <table class="table table-bordered table-striped">
                    <thead>
                    <tr>
                        <th>Name</th>
                        <th>&nbsp;</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${viiteList}" var="viite">
                        <tr>
                            <td>${viite.author}, ${viite.title}</td>
                            <td><form action="delete/${viite.id}" method="post"><input type="submit" class="btn btn-danger btn-mini" value="Delete"/></form></td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </c:if>
       
    
</div>

</body>
</html>
