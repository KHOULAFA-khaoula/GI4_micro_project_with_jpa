<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>INSCRIPTION</title>
<h1 style ="color : #476c74 ;font-weight : bold ; text-align : center">S'INSCRIRE </h1>

</head>
<body>

<div style ="margin:auto 30% ">
<form action = "registration"  method = "POST">
NOM <input type = "text" name = "nom"></br>
PRENOM <input type = "text" name = "prenom"></br>
ADRESSE<input type = "text" name = "adresse"></br>
CODE POSTAL <input type = "text" name ="codepostal"></br>
VILLE <input type = "text" name ="ville"></br>
TELEPHONE <input type = "text" name ="tel"></br>
EMAIL <input type = "email" name = "email" required></br>
MOT DE PASSE <input type = "password" name ="password" required></br>
<input type = "submit" value=" S'inscrire" >

</form>
</div>
<div style ="color : red ;font-weight : bold ">
   *MOT de passe obligatoire</br>
   *Email obligatoire

</div>
</body>
</html>