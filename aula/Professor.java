package aula;

public class Professor extends Pessoa {

	private String disciplina;
	
	public Professor(String nome, String endereco, String disciplina) {
		super(nome, endereco);
		this.disciplina = disciplina;		
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Disciplina: " + disciplina + "\n";
	}
}
