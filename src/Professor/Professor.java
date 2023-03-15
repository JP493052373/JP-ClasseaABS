package Professor;

import Pessoa.Pessoa;


public class Professor extends Pessoa {
	private String nome;
	private String nascimento;
	private int siape;
	private String areaConcurso;
	
	public Professor(int siape) {
		super();
		this.siape = siape;
	}


public Professor(String nome, String nascimento, int siape , String areaConcurso) {
	super(nome, nascimento, areaConcurso);
	this.areaConcurso = areaConcurso;
	this.siape = siape;
	
}


public String getNome() {
	return nome;
}


public void setNome(String nome) {
	this.nome = nome;
}


public String getNascimento() {
	return nascimento;
}


public void setNascimento(String nascimento) {
	this.nascimento = nascimento;
}


public int getSiape() {
	return siape;
}


public void setSiape(int siape) {
	
	this.siape = siape;
}


public String getAreaConcurso() {
	return areaConcurso;
}


public void setAreaConcurso(String areaConcurso) {
	
	this.areaConcurso = areaConcurso;
}
@Override
public String toString() {
	
	return super.toString() + this.getClass().getSimpleName() + ":\nNumero Siape = " + ("4543997 " ) + "\n" +("Area do Concurso = Ciências Biológicas" ) + "\n";
}




}