package aula10032021;

public class VetorDeObj {

	public static void main(String[] args) {
		
		Pessoa[] pessoas = new Pessoa[3];
		pessoas[0] = new Pessoa("Maria", "SP");
		pessoas[1] = new Pessoa("Pedro", "SP");
		pessoas[2] = new Pessoa("Jo�o", "SP");
		
		for(Pessoa pessoa : pessoas) {
			System.out.println("Nome: " + pessoa.getNome());
			System.out.println("Estado: " + pessoa.getEstado());
			System.out.println();
		}
		
	}

}
