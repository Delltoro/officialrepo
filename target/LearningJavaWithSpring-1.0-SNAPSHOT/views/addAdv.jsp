<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Don
  Date: 5/27/2019
  Time: 2:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User account</title>
</head>
<body>
Login user: <h1>${name}</h1>

<main>

    <section class="section-register">
        <div class="row">
            <div class="register">
                <div class="register__form">
                    <form class="form" action="addAdver">
                        <h2 class="heading-secondary">Register and search for a sparing partner</h2>

                        <div class="form__group">
                            <input id="disc" name="disciplineJSP" value="${discipline}" type="text" class="form__input"placeholder="${discipline}" required disabled>
                            <label for="disc" class="form__label">Discipline</label>
                        </div>

                        <div class="form__group">
                            <input id="description" name="descriptionJSP" type="text" class="form__input"placeholder="Description" required>
                            <label for="description" class="form__label">description"</label>
                        </div>

                        <div class="form__group">
                            <input id="city" name="cityJSP" type="text" class="form__input"placeholder="city" required>
                            <label for="city" class="form__label">city</label>
                        </div>

                        <div class="form__group">
                            <input id="cityRegion" name="cityRegionJSP" type="text" class="form__input"placeholder="cityRegion" required>
                            <label for="cityRegion" class="form__label">cityRegion</label>
                        </div>


                        <div class="form__group">
                            <input id="experience" name="experienceJSP" type="email" class="form__input"placeholder="experience" required>
                            <label for="experience" class="form__label">experience</label>
                        </div>

                        <div class="form__group">
                            <input id="wantSparring" name="wantSparringJSP" type="email" class="form__input"placeholder="wantSparring" required>
                            <label for="wantSparring" class="form__label">wantSparring</label>
                        </div>

                        <div class="form__group">
                            <input id="wantTraining" name="wantTrainingJSP" type="email" class="form__input"placeholder="wantTraining" required>
                            <label for="wantTraining" class="form__label">wantTraining</label>
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
