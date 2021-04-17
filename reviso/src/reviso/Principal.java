package reviso;


public class Principal {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Maria");
		cliente1.setEstado("SP");
		cliente1.setValorCompra(200);
		cliente1.setValorComDesconto(cliente1.calcularDesconto(90));
		
		System.out.println("Nome: " + cliente1.getNome());
		System.out.println("Estado: " + cliente1.getEstado());
		System.out.println("Valor de Compra: " + cliente1.getValorCompra());
		System.out.println("Valor com Desconto: " + cliente1.getValorComDesconto());
	}

}
