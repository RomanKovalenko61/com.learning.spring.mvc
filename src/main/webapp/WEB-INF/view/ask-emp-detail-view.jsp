<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<h2>Dear Employee, Please enter your detail</h2>
<%--<form action="${pageContext.request.contextPath}/employee/showDetails" method="get">--%>
<%--    <br/>--%>
<%--    <br/>--%>
<%--    <input type="text" name="employeeName" placeholder="Write your name"/>--%>
<%--    <input type="submit">--%>
<%--</form>--%>

<br/>
<br/>

<%--@elvariable id="employee" type="com.learning.spring.mvc.Employee"--%>
<form:form action="showDetails" modelAttribute="employee">

    Name <form:input path="name"/>
    <form:errors path="name"/>
    <br><br>
    Surname <form:input path="surname"/>
    <form:errors path="surname"/>
    <br><br>
    Salary <form:input path="salary"/>
    <form:errors path="salary"/>
    <br><br>
    Department <form:select path="department">
    <form:options items="${employee.deparments}"/>
<%--    <form:option value="Information Technology" label="IT"/>--%>
<%--    <form:option value="Human Resources" label="HR"/>--%>
<%--    <form:option value="Sales" label="Sales"/>--%>
    </form:select>
    <br><br>
    Which car do you want?
    <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
<%--    BMW <form:radiobutton path="carBrand" value="BMW"/>--%>
<%--    Audi <form:radiobutton path="carBrand" value="Audi"/>--%>
<%--    MB <form:radiobutton path="carBrand" value="Mercedes-Benz"/>--%>
    <br><br>
    Foreign Language(s)
    <form:checkboxes path="languages" items="${employee.languagesList}"/>
<%--    <form:checkbox path="languages" value="Englidh" label="EN"/>--%>
<%--    <form:checkbox path="languages" value="Deutch" label="DE"/>--%>
<%--    <form:checkbox path="languages" value="Franch" label="FR"/>--%>
    <br><br>
    Phone <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>
    <br><br>
    Email <form:input path="email"/>
    <form:errors path="email"/>
    <br><br>
    <input type="submit" value="OK">
</form:form>

</body>
</html>