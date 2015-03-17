package br.ucdb;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorProdutos {

	private static List<CadastroProdutos> produtos = new ArrayList<CadastroProdutos>();

	public void salvar(CadastroProdutos cadproduto) {

		produtos.add(cadproduto);
	}

	public List<CadastroProdutos> getCadastroProdutos() {

		return produtos;
	}
}
