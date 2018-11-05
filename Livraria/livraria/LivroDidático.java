package livraria;

public class LivroDidático extends Livro {
	
	private String area;

	public LivroDidático(String nome, String autorPrincipal, String editora, String resumo, double preço, String area) {
		super(nome, autorPrincipal, editora, resumo, preço);
		this.area = area;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

}
