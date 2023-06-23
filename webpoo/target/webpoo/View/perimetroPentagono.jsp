<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="View/area.css">
    <title>Perímetro del Pentágono</title>
</head>
<body>

    <form action="servlet" method="post">
        <h1>Perímetro del Pentágono</h1>
        <br>
        <label>Ingrese el valor de los lados</label>
            <input type="number" name="ladosP">
        <br><br>
        <label>Ingrese el valor del apotema</label>
            <input type="number" name="apotema">
        <br><br>
        <button type="submit" name="control" value="pepentagono">Calcular</button>
        <br><br>
        <a href="servlet?control=index">Elegir otra figura</a>
    </form>
    
</body>
</html>