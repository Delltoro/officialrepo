<%@ page import="org.hibernate.mapping.Map" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: jakub
  Date: 03.06.19
  Time: 00:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tennis page</title>

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link href="<c:url value="/resources/theme1/css/main.css" />" rel="stylesheet">
</head>
<body>
<jsp:include page="../elements/navbar.jsp" />


<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

<section class="section-advertisement">
    <form class="centring" action="/add_TennisAdv" method="get">
        <button type="submit" class="btn btn-primary btn-adv">Add tennis advertisement</button>
    </form>
    <h2 class="heading-secondary">Tennis player advertisements</h2>
    <div class="row">
        <div class="advertisements">
            <c:if test = "${empty advertisements}">
            <p><h1>Advertisements are empty</h1><p>
            </c:if>

            <table>
                <thead>
                <tr>
                    <th class="table_header">ID</th>
                    <th class="table_header">Discipline</th>
                    <th class="table_header">City</th>
                    <th class="table_header">Skills</th>
                    <th class="table_header">GameStyle</th>
                </tr>
                </thead>
                <hr>
                <tbody>
                <c:forEach items="${advertisements}" var="adv">
                    <tr>
                        <td>${adv.discipline}</td>
                        <td>${adv.city}</td>
                        <td>${adv.cityRegion}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>

        </div>
    </div>
</section>

</body>
</html>
