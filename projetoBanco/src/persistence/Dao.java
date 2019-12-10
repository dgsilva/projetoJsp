package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
;

//data acess object
public class Dao {
	
	Connection con; //Conexao com o banco
	PreparedStatement stmt;//Tabela
	ResultSet rs;//Pesquisa
	

 public void open() throws Exception{
 Class.forName("com.mysql.jdbc.Driver");
 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/banconoite", "root", "coti"); 

}

 public void close()throws Exception{
	con.close();
}
 
 public static void main(String[] args) {
	try {
     Dao d = new Dao();
     d.open();
     System.out.println("Conexao Ok");
	}catch (Exception ex) {
		ex.printStackTrace();
		System.out.println("Não conectou");
		
	}
}


}
