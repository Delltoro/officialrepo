<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: dominik
  Date: 4/26/19
  Time: 9:09 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<sec:authorize access="isAuthenticated()">
<nav class="navbar navbar-expand-md navbar-dark bg-dark">
    <div class="navbar-collapse collapse w-100 order-1 order-md-0 dual-collapse2">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item"><a class="nav-link" href="/">Strona glowna</a></li>
            <li class="nav-item"><a class="nav-link" href="/table_tennis">Tenis stolowy</a></li>
            <li class="nav-item"><a class="nav-link" href="/tennis">Tenis ziemny</a></li>
            <li class="nav-item"><a class="nav-link" href="/badminton">Badminton</a></li>

        </ul>
    </div>
    <div class="navbar-collapse collapse w-100 order-3 dual-collapse2">
        <ul class="navbar-nav ml-auto">
<%--            <sec:authorize access="!isAuthenticated()">--%>
<%--                <li class="nav-item"><a class="nav-link" href="/login"><span class="glyphicon glyphicon-log-in"></span>Logowanie</a></li>--%>
<%--            </sec:authorize>--%>
<%--            <sec:authorize access="!isAuthenticated()">--%>
<%--                <li class="nav-item"><a class="nav-link" href="/register"><span class="glyphicon glyphicon-user"></span>Rejestracja</a></li>--%>
<%--            </sec:authorize>--%>
            <sec:authorize access="isAuthenticated()">
                <li class="nav-item"><a class="nav-link" href="/logout"><span
                        class="glyphicon glyphicon-log-out"></span>Wyloguj sie</a></li>
            </sec:authorize>
        </ul>
    </div>
</nav>
</sec:authorize>