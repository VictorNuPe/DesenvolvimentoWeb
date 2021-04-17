package aula07042021;

public class TesteExcecao1 {

	public static void main(String[] args) {
		System.out.println("In�cio do M�todo main");
		try {
			primeiroMetodo();
		} catch (MinhaExcecao e) {
			System.out.println("Capturada a exce��o");
		}
		System.out.println("Fim do M�todo main");
	}

	public static void primeiroMetodo() throws MinhaExcecao {
		System.out.println("In�cio do M�todo primeiroMetodo");
		segundoMetodo();
		System.out.println("Fim do M�todo primeiroMetodo");
	}

	public static void segundoMetodo() throws MinhaExcecao {
		System.out.println("In�cio do M�todo segundoMetodo");
		for (int i = 0; i <= 5; i++) {
			System.out.println("N�mero: " + i);
		}
		System.out.println("Fim do M�todo segundoMetodo");
		throw new MinhaExcecao("Lancei minha exce��o!");

	}
}
