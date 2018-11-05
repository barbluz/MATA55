package livraria;

public class Livro extends Titulo {

	private String autorPrincipal, resumo;
	
	public Livro(String nome, String autorPrincipal, String editora, String resumo, double preço) {
		super(nome, editora, preço);
		this.autorPrincipal = autorPrincipal;
		this.resumo = resumo;
	}
	
	public String getAutorPrincipal() {
		return autorPrincipal;
	}
	public void setAutorPrincipal(String autorPrincipal) {
		this.autorPrincipal = autorPrincipal;
	}
	public String getResumo() {
		return resumo;
	}
	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

}
