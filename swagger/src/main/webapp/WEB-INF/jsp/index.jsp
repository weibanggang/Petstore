<%--
  Created by IntelliJ IDEA.
  User: 小邦哥
  Date: 2018/10/31
  Time: 10:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/order/sele" method="post">
    <table>
        <thead>
        <tr>
            <th>orderId</th>
            <th>customer</th>
            <th>email</th>
            <th>telephone</th>
            <th>address</th>
            <th>status</th>
            <th>createDate</th>

        </tr>
        </thead>
        <tbody>
        <tr>
            <td><input name="orderId" property="orderId"/></td>
            <td><input name="customer" property="customer"/></td>
            <td><input name="email" property="email"/></td>
            <td><input name="telephone" property="telephone"/></td>
        </tr>
        <tr>
            <td><input name="address" property="address"/></td>
            <td><input name="status" property="status"/></td>
            <td><input name="createDate"type="date" property="createDate"/></td>

        </tr>
        </tbody>
    </table>
    <input type="submit"/>
</form>
</body>
</html>
