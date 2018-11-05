package livraria;

public class Revista extends Titulo {

	private String periodicidade;
	
	public Revista(String nome, String editora, double preço, String periodicidade) {
		super(nome, editora, preço);
		this.periodicidade = periodicidade;
	}
	
	public String getPeriodicidade() {
		return periodicidade;
	}
	public void setPeriodicidade(String periodicidade) {
		this.periodicidade = periodicidade;
	}
}
