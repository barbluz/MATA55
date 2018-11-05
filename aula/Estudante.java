package aula;

public class Estudante extends Pessoa {
	
	private String nomeEscola;
	private String serie;

	public Estudante(String nome, String endereco, String nomeEscola, String serie ) {
		super(nome, endereco);
		this.nomeEscola = nomeEscola;
		this.serie = serie;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Nome da escola: " + nomeEscola + "\nSérie: " + serie + "\n";
	}

}
