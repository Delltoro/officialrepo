<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <link href="<c:url value="/resources/theme1/css/main.css" />" rel="stylesheet">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href='http://fonts.googleapis.com/css?family=Lato&subset=latin,latin-ext' rel='stylesheet' type='text/css'>

</head>

<body>

<header class="header">

    <div class="text-box">
        <h1 class="heading-primary">
            <span class="heading-primary-main">Deal with it</span>
            <span class="heading-primary-sub">see how good you are</span>
        </h1>
    </div>

</header>

<main>


    <section class="section-register">
        <div class="row">
            <div class="register">
              <div class="register__form">
                  <form class="form" action="register">
                      <h2 class="heading-secondary">Register and search for a sparing partner</h2>

                      <div class="form__group">
                          <input id="firstname" name="fname" type="text" class="form__input"placeholder="First Name" required>
                          <label for="firstname" class="form__label">First Name</label>
                      </div>

                      <div class="form__group">
                          <input id="lastname" name="lname" type="text" class="form__input"placeholder="Last Name" required>
                          <label for="lastname" class="form__label">Last Name"</label>
                      </div>

                      <div class="form__group">
                          <input id="username" name="uname" type="text" class="form__input"placeholder="Username" required>
                          <label for="username" class="form__label">Username</label>
                      </div>

                      <div class="form__group">
                          <input id="password" name="pass" type="password" class="form__input"placeholder="Password" required>
                          <label for="password" class="form__label">Password</label>
                      </div>


                      <div class="form__group">
                          <input id="email" name="mail" type="email" class="form__input"placeholder="Email" required>
                          <label for="email" class="form__label">Email</label>
                      </div>

                     <div class="form__group">
                         <button type="submit" class="btn">Submit</button>
                     </div>

                  </form>
              </div>
            </div>
        </div>
    </section>


</main>



</body>
</html>
