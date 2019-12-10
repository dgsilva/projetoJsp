<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="mb" class="manager.ManagerBean" scope="request"></jsp:useBean>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<form   method="post" action="ControlleProduto">
<br>Nome<br>
<input type="text" name="nome" id size="30" value=""/>
<br>Preco<br>
<input type="number" name="preco" size="10" value=""/>
<br>Imagem<br>
<input type="text" name="imagem" size="50" value=""/>
<br/>
<button type="submit">Enviar Dados</button>
<br/>
${msg} 
</form>

<table id="tabela1" border="1">
<tr>
<td>Id</td>
<td>Nome:</td>
<td>Preco:</td>
<td>Imagem:</td>
</tr>
<c:forEach items="${mb.produtos}" var="linha">
<tr>

<td>${linha.id}</td>
<td>${linha.nome}</td>
<td>${linha.preco}</td>
<td><img  alt="" src="${linha.imagem}" width="150px" height="150px"/></td>

</tr>

</c:forEach>
</table>
</body>
</html>