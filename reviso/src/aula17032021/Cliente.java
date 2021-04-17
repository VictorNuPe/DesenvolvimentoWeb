package aula17032021;

public class Cliente {

	public Cliente(String nome, String rg, String cpf) {
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
	}
	
	
	private String nome;
	private String rg;
	private String cpf;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
