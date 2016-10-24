<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="BASE" value="${pageContext.request.contextPath}"/>

<html>
<head>
    <title>客户管理</title>
</head>
<body>
<h1>客户列表</h1>

<table>
    <tr>
        <th>name</th>
        <th>contact</th>
        <th>telephone</th>
        <th>email</th>
        <th>remark</th>
    </tr>
    <c:forEach var="customer" items="${customerList}">
        <tr>
            <td>${customer.name}</td>
            <td>${customer.contact}</td>
            <td>${customer.telephone}</td>
            <td>${customer.email}</td>
            <td>
                <a href="${BASE}/customer_edit?id=${customer.id}">edit</a>
                <a href="${BASE}/customer_delete?id=${customer.id}">delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
