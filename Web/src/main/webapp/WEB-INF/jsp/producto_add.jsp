<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>


 <form:form method="post" action="add.html" commandName="producto">
    <table>
    <tr>
        <td><form:label path="nombre"><spring:message code="label.productname"/></form:label></td>
        <td><form:input path="nombre" /></td>
    </tr>
    <tr>
        <td><form:label path="precio"><spring:message code="label.productprice"/></form:label></td>
        <td><form:input path="precio" /></td>
    </tr>
        <td colspan="2">
            <input type="submit" value="<spring:message code="label.addproduct"/>"/>
        </td>
    </tr>
</table>
</form:form>
 <!-- 
<h3>Productos</h3>
<c:if  test="${!empty productoList}">
<table class="data">
<tr>
    <th>Nombre</th>
    <th>Precio</th>
    <th>&nbsp;</th>
</tr>
<c:forEach items="${productoList}" var="producto">
    <tr>
        <td>${producto.nombre}</td>
        <td>${producto.precio}</td>
        <td><a href="load/${producto.id}">editar</a></td>
        <td><a href="delete/${producto.id}">eliminar</a></td>
    </tr>
</c:forEach>
</table>
</c:if>
-->
</body>
</html>