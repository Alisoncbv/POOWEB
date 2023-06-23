<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="View/area.css">
    <title>Perímetro del Círculo</title>
</head>
<body>

    <form action="servlet" method="post">
        <h1>Perímetro del Círculo</h1>
        <br>
        <label>Ingrese el valor del radio</label>
            <input type="number" name="radio">
        <br><br>
        <button type="submit" name="control" value="pecirculo">Calcular</button>
        <br><br>
        <a href="servlet?control=index">Elegir otra figura</a>
    </form>
    
</body>
</html>