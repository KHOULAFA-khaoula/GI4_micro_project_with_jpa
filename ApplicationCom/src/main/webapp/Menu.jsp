<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title >Menu</title>
</head>
<body>

<h1 style ="color : #476c74 ;font-weight : bold ; text-align : center">Bonjour ${client.nom} ${client.prenom} </h1>

<div style="border:solid blue 1px ;margin: auto 10%; padding:10px 1em">
     <a href="catalog" >Consulter le catalogue</a><br />
     <a href="purchase?link=panier" >Visualisez votre panier</a>
</div>

</body>
</html>