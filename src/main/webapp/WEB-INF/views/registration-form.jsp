<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<! DOCTYPE html>
<html>
<body>

<form:form action="showResult" modelAttribute="employee">

    Имя <form:input path="name"/>
    <form:errors path="name"/>
    <br>
    <br>
    Ранг <form:input path="rang"/>
    <form:errors path="rang"/>
    <br>
    <br>
    Возраст <form:input path="age"/>
    <form:errors path="age"/>
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
    <br>
    <br>
    Номер телефона : <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>
    <br>
    <br>
    Какую машину предпочитаете?
    <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
    <br>
    <br>

    Какими языками владеете?
    RU<form:checkbox path="languages" value="Russian"/>
    Ch<form:checkbox path="languages" value="China"/>
    BY<form:checkbox path="languages" value="Belaruss"/>
    <br>
    <br>

    <input type="submit" value="Согласится и зарегистрироваться">

</form:form>
 <br>
 <br>


</body>
</html>