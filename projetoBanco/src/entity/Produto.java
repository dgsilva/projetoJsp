package entity;

import java.io.Serializable;

public class Produto implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String nome;
	private Double preco;
	private String imagem;
	
	public Produto() {
		// TODO Auto-generated constructor stub
	}

	public Produto(Integer id, String nome, Double preco, String imagem) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.imagem = imagem;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", preco=" + preco + ", imagem=" + imagem + "]";
	}
	
	
	

}
