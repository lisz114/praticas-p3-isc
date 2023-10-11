package ifsc;

import java.util.ArrayList;

public class MainProduto {

	public static void main(String[] args) {

		Produto p = new Produto();

		p.setNome("piercing");
		p.setCodBarras(6354653164l);
		p.setFornecedor("Raico");
		p.setPreco(14.99);

		Produto e = new Produto();

		e.setNome("\nElisa");
		e.setCodBarras(635468864l);
		e.setFornecedor("Jorge");
		e.setPreco(18.8);

		Produto n = new Produto();

		n.setNome("\nMax");
		n.setCodBarras(978321843l);
		n.setFornecedor("Vinisius");
		n.setPreco(15.99);

		ArrayList<Produto> produtos = new ArrayList<>(03);

		produtos.add(p);

		produtos.add(e);

		produtos.add(n);
		
		for (Produto produto : produtos) {
			System.out.println(produto.getNome());
			System.out.println(produto.getCodBarras());
			System.out.println(produto.getFornecedor());
			System.out.println(produto.getPreco());
		}
	}

}