<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="./View/estilos.css">
    <title>Figuras Geometricas</title>
</head>
<body>

    <h1>Elige una figura geométrica</h1>
    <br><br>


    <div class="f1">
        <img src="./Assets/IMG/rombo.JPG" width="250" height="250">
        <center><a href="servlet?control=rombo">Área Rombo</a></center>
        <center><a href="servlet?control=rombo1">Perímetro Rombo</a></center>
    </div>
    

    <div class="f2">
        <img src="./Assets/IMG/trapecio.JPG" width="250" height="250">
        <center><a href="servlet?control=trapecio">Área Trapecio</a></center>
        <center><a href="servlet?control=trapecio1">Perímetro Trapecio</a></center>
    </div>
    

    <div class="f3">
        <img src="./Assets/IMG/pentagono.JPG" width="250" height="250">
        <center><a href="servlet?control=pentagono">Área Pentágono</a></center>
        <center><a href="servlet?control=pentagono1">Perímetro Pentágono</a></center>
    </div>

    <div class="f4">
        <img src="./Assets/IMG/circulo.JPG" width="250" height="250">
        <center><a href="servlet?control=circulo">Área Círculo</a></center>
        <center><a href="servlet?control=circulo1">Perímetro Círculo</a></center>
    </div>
    

</body>
</html>
