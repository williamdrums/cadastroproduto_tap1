package br.ucdb;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet({ "/CadastroController", "/CadastroServlet" })
public class CadastroController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		//Pega Lista De Produtos Cadastrados
		GerenciadorProdutos gp = new GerenciadorProdutos();
		List<CadastroProdutos> produtos = gp.getCadastroProdutos();
		
		//Acidiona a lista no request como atributo
		req.setAttribute("prod", produtos);
		
		//leva para o JSP
				RequestDispatcher view = req.getRequestDispatcher("produtos.jsp");
				view.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
		String id = request.getParameter("id");
		String descricao = request.getParameter("descricao");
		String valor = request.getParameter("valor");
		
		CadastroProdutos cadproduto = new CadastroProdutos();
		cadproduto.setId(id);
		cadproduto.setDescricao(descricao);
		cadproduto.setValor(valor);
		
		GerenciadorProdutos gp = new GerenciadorProdutos();
		gp.salvar(cadproduto);
	}

}
