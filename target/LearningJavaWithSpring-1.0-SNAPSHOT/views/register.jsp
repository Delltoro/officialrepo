<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link href="<c:url value="/resources/theme1/css/main.css" />" rel="stylesheet">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href='http://fonts.googleapis.com/css?family=Lato&subset=latin,latin-ext' rel='stylesheet' type='text/css'>

</head>

<body>


<main>


    <section class="section-register">
        <div class="row">
            <div class="register">
                <div class="register__form">
                    <form class="form" action="register" method="post">
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


<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>
