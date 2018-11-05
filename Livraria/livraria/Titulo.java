package livraria;

public class Titulo {
	private String nome, editora;
	private double preço;
	
	public Titulo(String nome, String editora, double preço) {
		this.nome = nome;
		this.editora = editora;
		this.preço = preço;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public double getPreço() {
		return preço;
	}
	public void setPreço(double preço) {
		this.preço = preço;
	}

}
