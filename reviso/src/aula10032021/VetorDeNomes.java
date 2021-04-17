package aula10032021;

public class VetorDeNomes {

	public static void main(String[] args) {
		
		String[] nomes = new String[3];
		nomes[0] = "João";
		nomes[1] = "Maria";
		nomes[2] = "Pedro";
		
		
		System.out.println("Nome: " + nomes[0]);
		System.out.println("Nome: " + nomes[1]);
		System.out.println("Nome: " + nomes[2]);
		
		for (int i = 0; i < nomes.length; i++) {
			System.out.println("Nome: " + nomes[i]);
		}
		
		System.out.println();
		
		for(String nome:nomes) {
			System.out.println("Nome: " + nome);
		}
		
	}

}
