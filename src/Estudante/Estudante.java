package Estudante;

import Pessoa.Pessoa;

public class Estudante extends Pessoa {
	private String nome;
	private String nascimento;
	private int ra;
	private String curso;
	public Estudante(int ra) {
		super();
		this.ra = ra;
	}

	public Estudante(String nome, String nascimento, int ra , String curso) {
		super(nome, nascimento, curso);
		this.curso = curso;
		this.ra = ra;
		
	}
	
	
	
	
	
	
	
	
	public String getnascimento() {
		
		return nascimento;
	}
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	public String getcurso() {
		
		return curso;
	}
	public void setCurso(String curso) {
	
		this.curso = curso;
		
		
	}
	public int getra() {
		
		
		return ra;
	}
	public int setRa(int ra) {
		
		return this.ra;
	}
	
	
	
	
	
	
	@Override
	public String toString() {
		
		return super.toString() + this.getClass().getSimpleName() + ":\nRegistro de Aluno = " + ("1843967 " ) +  "\n" +("Nome  do Curso  = Biologia " ) +"\n" ;
		
		
		
	}
	

}
