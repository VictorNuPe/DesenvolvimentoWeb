package aula07042021;

public class TesteExcecao1 {

	public static void main(String[] args) {
		System.out.println("Início do Método main");
		try {
			primeiroMetodo();
		} catch (MinhaExcecao e) {
			System.out.println("Capturada a exceção");
		}
		System.out.println("Fim do Método main");
	}

	public static void primeiroMetodo() throws MinhaExcecao {
		System.out.println("Início do Método primeiroMetodo");
		segundoMetodo();
		System.out.println("Fim do Método primeiroMetodo");
	}

	public static void segundoMetodo() throws MinhaExcecao {
		System.out.println("Início do Método segundoMetodo");
		for (int i = 0; i <= 5; i++) {
			System.out.println("Número: " + i);
		}
		System.out.println("Fim do Método segundoMetodo");
		throw new MinhaExcecao("Lancei minha exceção!");

	}
}
