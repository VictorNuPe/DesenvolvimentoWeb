package aula10032021;

public class Pessoa {
	
	//Construtor personalizado
	public Pessoa(String nome, String estado) {
		this.nome = nome;
		this.setEstado(estado);
	}
	
	
	//Construtor padrão
	public Pessoa(){
		
	}
	
	private String nome;
	private String estado;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {

		if(estado.equalsIgnoreCase("SP")) {
			this.estado = estado;
		}else {
			System.out.println("Cadastro Inválido");
			System.exit(1);
		}
		
	}
	
}
