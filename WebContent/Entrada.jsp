<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="Cabecalho.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">

<title>Envia</title>
</head>
<body>
<form method="post" action="informacoes">

<label>Nome</label>
<input type="text" name="nome" title="Digite o nome" required><br>

<label>Matrícula</label>
<input type="text" name="matricula" title="Digite a matrícula" required><br>

<label>Disciplina</label>
<input type="text" name="disciplina" title="Digite a disciplina" required><br>


<input type="submit" value="Enviar">
</form>
</body>
</html>