<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<! DOCTYPE html>
<html>
<body>

<form:form action="showResult" modelAttribute="employee">

    Имя <form:input path="name"/>
    <br>
    <br>
    Ранг <form:input path="rang"/>
    <br>
    <br>
    Возраст <form:input path="age"/>
    <br>
    <br>
    Опыт <form:input path="experience"/>
    <br>
    <br>
    Корпорация <form:input path="corporations"/>
    <br>
    <br>

    Департамент <form:select path="department">
        <form:options items="${employee.departments}"/>
    </form:select>

    <input type="submit" value="Согласится и зарегистрироваться">

</form:form>
 <br>
 <br>


</body>
</html>