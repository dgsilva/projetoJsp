package persistence;

import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

import entity.Produto;

//Produto dao herda dao
public class ProdutoDao extends Dao {
	
	//crud - create, read, update,delete
	
	
	public Integer  create(Produto p)throws Exception {
	open();
	stmt = con.prepareStatement("insert into produto values(null,?,?,?)", PreparedStatement.RETURN_GENERATED_KEYS);
	stmt.setString(1, p.getNome());
	stmt.setDouble(2, p.getPreco());
	stmt.setString(3, p.getImagem());
	stmt.execute();
	rs = stmt.getGeneratedKeys();//Buscar a chave gerada 
	rs.next();
	int chave = rs.getInt(1);// me dá o numero GERADO...
	stmt.close();
	System.out.println("Foi cadastrado com sucesso");
	close();
	return chave; //	
	}
	
	public List<Produto>findAll()throws Exception{
		open();
		stmt = con.prepareStatement("select * from produto");
		List<Produto> lista = new ArrayList<Produto>();//lista obrigadoria 
		rs = stmt.executeQuery();//Buscar a chave gerada 
		while(rs.next()) {//Enquanto existir estou em loop do primeiro ao ultimo
			Produto p = new Produto(rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getString(4));
			lista.add(p);
		}
		stmt.close();
		close();
		return lista; 
	}
	
	
	public static void main(String[] args) {
		try {
//	    Produto p = new Produto(null,"picanha", 60.00,"https://i.pinimg.com/236x/71/a9/c6/71a9c6e7ba0e8cad74cbf4e108e43f1c--brazilian-steak-brazilian-recipes.jpg");
//	    int chave = new ProdutoDao().create(p);
//	    
//	    System.out.println("O valor da chave e:" + chave);
		new ProdutoDao().findAll().forEach((x)->
	      	System.out.println(x.getNome()+ ",=" + x.getPreco())
	);
			
		}catch (Exception ex) {
			System.out.println("Error:" + ex.getMessage());
		}

	
	
	}
	
	
	
	
	

}
