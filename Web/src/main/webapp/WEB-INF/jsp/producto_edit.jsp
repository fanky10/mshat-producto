<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>

<body>

 <form:form method="post" action="edit.html" commandName="producto">
    <table>
    <tr>
        <td><form:label path="id"><spring:message code="label.productid"/></form:label></td>
        <td><form:input readonly="true" path="id" /></td>
    </tr>
    <tr>
        <td><form:label path="nombre"><spring:message code="label.productname"/></form:label></td>
        <td><form:input path="nombre" /></td>
    </tr>
    <tr>
        <td><form:label path="precio"><spring:message code="label.productprice"/></form:label></td>
        <td><form:input path="precio" /></td>
    </tr>
        <td colspan="2">
            <input type="submit" value="<spring:message code="label.editproduct"/>"/>
        </td>
    </tr>
</table>
</form:form>