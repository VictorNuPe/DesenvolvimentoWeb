package aula17032021;

public class ValorDeInteiros {

	public static void main(String[] args) {

		int[] valores = new int[5];
		valores[0] = 100;
		valores[1] = 200;
		valores[2] = 15;
		valores[3] = 57;
		valores[4] = 31;
		
		for (int i = 0; i < valores.length; i++) {
			System.out.println("O vetor["+i+"] tem o valor: " + valores[i]);
		}
		
		for(int valor: valores) {
			System.out.println("O valor desse vetor é: " + valor );
		}
		
		String[] nomes = {"Victor", "Nunes", "Pedreira","Um cara bem legal"};
		
		for (String i : nomes) {
			System.out.print(i);
		}
		
		
	}

}
