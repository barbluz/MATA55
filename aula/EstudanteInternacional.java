package aula;

public class EstudanteInternacional extends Estudante {
	
	private String paisDeOrigem;
	
	public EstudanteInternacional(String nome, String endereco, String nomeEscola, String serie, String paisDeOrigem) {
		super(nome, endereco, nomeEscola, serie);
		this.paisDeOrigem = paisDeOrigem;
	}

	public String getPaisDeOrigem() {
		return paisDeOrigem;
	}

	public void setPaisDeOrigem(String paisDeOrigem) {
		this.paisDeOrigem = paisDeOrigem;
	}

	@Override
	public String toString() {
		return super.toString() + "País de Origem: " + this.paisDeOrigem + "\n";
	}
}
