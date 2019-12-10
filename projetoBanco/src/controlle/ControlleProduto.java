package controlle;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Produto;
import persistence.ProdutoDao;


@WebServlet("/ControlleProduto")
public class ControlleProduto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ControlleProduto() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Produto p = new Produto();
		p.setNome(request.getParameter("nome"));
		p.setPreco(new Double(request.getParameter("preco")));
		p.setImagem(request.getParameter("imagem"));
		
		try {
			ProdutoDao dao = new ProdutoDao();
			dao.create(p);
			request.setAttribute("msg","Gravado com sucesso");
			request.getRequestDispatcher("sistema.jsp").forward(request, response);
		}catch (Exception ex) {
			ex.printStackTrace();
			request.setAttribute("msg","Error de gravação" + ex.getMessage());
			request.getRequestDispatcher("sistema.jsp").forward(request, response);
			
		  
		}
	}

}
