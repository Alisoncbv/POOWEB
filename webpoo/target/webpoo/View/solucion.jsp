<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="View/area.css">
    <title>Resultado</title>
</head>
<body>
    <form>
        <h1>Resultado</h1>
        <br>
        <p>El perímetro es:<br><%=request.getAttribute("perimetro")%></p>
        <br>
        <a href="servlet?control=index">Elegir otra figura</a>
    </form>
</body>
</html>