<%@page import="br.ucdb.CadastroProdutos"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Lista Produtos</h1>

	<%
		//Scriptlet
		List<CadastroProdutos> produtos = (List<CadastroProdutos>) request.getAttribute("prod");
		for (CadastroProdutos cp : produtos) {
			out.print(cp.getId());
			out.print("<br>");
			

			out.print(cp.getDescricao());
			out.print("<br>");
			

			out.print(cp.getValor());
			out.print("<br>");
			out.print("<br>");
			
		}
	%>

</body>
</html>