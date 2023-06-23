<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="View/area.css">
    <title>Perímetro Trapecio</title>
</head>
<body>

    <form action="servlet" method="post">
        <h1>Perímetro del Trapecio</h1>
        <br>
        <label>Ingrese el valor del lado paralelo 1</label>
            <input type="number" name="lado1">
        <br><br>
        <label>Ingrese el valor del lado paralelo 2</label>
            <input type="number" name="lado2">
        <br><br>
        <label>Ingrese el valor de la altura</label>
            <input type="number" name="altura">
        <br><br>
        <button type="submit" name="control" value="petrapecio">Calcular</button>
        <br><br>
        <a href="servlet?control=index">Elegir otra figura</a>
    </form>
    
</body>
</html>