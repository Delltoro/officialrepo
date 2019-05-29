<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type"
          content="text/html;
          charset=ISO-8859-1">
    <link href="<c:url value="/resources/theme1/css/main.css" />" rel="stylesheet">
    <title>Terror movies</title>
</head>
<body>

<section class="section-register">
    <div class="row">
        <div class="login">
            <div class="register__form">
                <form class="form" action="/j_spring_security_check" method="post">
                    <h2 class="heading-secondary">Please login to your account</h2>

                    <div class="form__group">
                        <input id="username" name="j_username" type="text" class="form__input"placeholder="Username" required>
                        <label for="username" class="form__label">Username</label>
                    </div>

                    <div class="form__group">
                        <input id="password" name="j_password" type="password" class="form__input"placeholder="Password" required>
                        <label for="password" class="form__label">Password</label>
                    </div>


                    <div class="form__group">
                        <button type="submit" class="btn">Submit</button>
                    </div>

                </form>
            </div>
        </div>
    </div>
</section>

</body>
</html>










<%--<form action="/j_spring_security_check" method="post"> --%>
<%--    Username<input type="text" name="j_username"/><br/>   --%>
<%--    Password<input type="text" name="j_password"/><br/> --%>
<%--    <input type="submit"/>  --%>
<%--</form>--%>