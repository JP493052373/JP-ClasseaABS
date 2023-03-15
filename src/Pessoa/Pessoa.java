package Pessoa;

public abstract class Pessoa  {
	private String nome;
	private String dataNascimento;
	
	
	public Pessoa(String nome,String nome1, String nascimento) {
		this.nome = nome;
		this.dataNascimento = nascimento;
		
	}
	public Pessoa() {
		this.nome  = "Carlos";
		this.dataNascimento = "12/05/2000";
		
	}
	
	
	
	
	
	public String getnome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getdataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	@Override
	public String toString() {
		
		return String.format("-Pessoa:\nNome: %s\nData de Nascimento:  %s\n",this.getnome(),  this.getdataNascimento() , null);
		
	}
	
}
