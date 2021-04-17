package aula17032021;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		Cliente[] clientes = new Cliente[5];
		
		clientes[0] = new Cliente("Maria", "999", "999");
		clientes[1] = new Cliente("José", "888", "888");
		clientes[2] = new Cliente("Francisco", "777", "777");
		clientes[3] = new Cliente("Claudia", "555", "555");
		clientes[4] = new Cliente("Heleno", "444", "444");
		
		for (Cliente cliente:clientes) {
			System.out.println("Nome: " + cliente.getNome());
			System.out.println("RG: " + cliente.getRg());
			System.out.println("CPF: " + cliente.getCpf());
			System.out.println("-------------------------");
			
		}
		
	}

}
