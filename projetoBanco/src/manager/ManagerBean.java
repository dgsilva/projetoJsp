package manager;

import java.util.List;

import entity.Produto;
import persistence.ProdutoDao;
//Para consultar uma das grandes classes é essa...
public class ManagerBean {
	
	//Lista(get)
	//Produtos chama
	
	private List<Produto>produtos;//Buscar todos...

	public List<Produto> getProdutos() {
		try {
			produtos = new ProdutoDao().findAll();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	
	
	

}
