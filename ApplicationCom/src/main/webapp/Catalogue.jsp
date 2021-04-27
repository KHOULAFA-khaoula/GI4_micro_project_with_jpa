<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%@ page import="model.Article" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title style ="color :#476c74;font-weight : bold ; text-align : center">Catalogue</title>
	<style>
		table{
			margin:10px auto;
		}
		table,tr,td{
			border:solid 2px black;
		}
		td{
			padding:15px;
		}
	</style>
</head>
<body>
	<h1>Catalogue</h1>
	<h3>Catégorie : <%= request.getAttribute("cat") %></h3>
	<form method="post" action="catalog">
		<select name="categorie">
			<option value="jazz" >Jazz</option>
			<option value="blues" >Blues</option>
		</select>
		<input type="submit" value="Choisir catégorie" />
	</form>
	<table>
		<tr>
			<td>Référence</td>
			<td>Titre</td>
			<td>Auteur</td>
			<td>Prix</td>
			<td>Panier</td>
		</tr>
		<% List<Article> articles=(ArrayList<Article>)request.getAttribute("articles");
			for(Article a:articles){
		%>
		<tr>
			<td><a href="article?link=<%= a.getCodeArticle() %>"><%= a.getCodeArticle() %></a></td>
			<td><%= a.getDesignation() %></td>
			<td><%= a.getAuteur() %></td>
			<td><%= a.getPrix() %></td>
			<td><a href="chart">Ajouter au panier</a></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>