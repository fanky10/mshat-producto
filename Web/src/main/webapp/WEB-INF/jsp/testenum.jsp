<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>


<c:if  test="${!empty productoList}">
	<table class="data">
		<tr>
			<c:forEach items="${columnas}" var="header">
			    <th>${header.name}</th>
			</c:forEach>
		</tr>
		<c:forEach items="${productoList}" var="producto">
		    <tr>
		        <td>${producto.nombre}</td>
		        <td>${producto.precio}</td>
		        <td><a href="mod_producto/${producto.id}">editar</a></td>
		        <td><a href="delete/${producto.id}">eliminar</a></td>
		    </tr>
		</c:forEach>
	</table>
</c:if>
</body>
</html>