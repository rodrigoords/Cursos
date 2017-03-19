<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

Bem vindo ao nosso gerenciador de empresas!<br/>
<c:if test="${not empty usuarioLogado}">
	Logado como ${usuarioLogado.email}<br/>
</c:if>
	
	<form action="controller" method="POST">
		<input type="hidden" name="tarefa" value="NovaEmpresa"> 
		Nome:<input type="text" name="nome">
		<input type="submit" value="Enviar">
	</form>
	
	<form action="controller" method="POST">
		<input type="hidden" name="tarefa" value="Login"> 
		Email: <input type="email" name="email"/>
		Senha: <input type="password" name="senha"/>
		<input type="submit" value="Enviar"/>
	</form>
	
	<form action="controller" method="POST">
		<input type="hidden" name="tarefa" value="Logout"> 
	    <input type="submit" value="Logout" />
	</form>
</body>
</html>