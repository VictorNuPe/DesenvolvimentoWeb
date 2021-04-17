package aula17032021;

import java.util.ArrayList;

public class ListaDeClientes {

	public static void main(String[] args) {
		
		ArrayList<Cliente> clientes = new ArrayList<>();

		clientes.add(new Cliente("Maria", "999", "999"));
	
		for (Cliente cliente : clientes) {	
			System.out.println("Nome: " + cliente.getNome());
			System.out.println("RG: " + cliente.getRg());
			System.out.println("CPF: " + cliente.getCpf());
			System.out.println("-------------------------");		
		}
		
		System.out.println("=========================");
		
		clientes.add(new Cliente("André", "3445", "4665"));
		
		for (Cliente cliente : clientes) {	
			System.out.println("Nome: " + cliente.getNome());
			System.out.println("RG: " + cliente.getRg());
			System.out.println("CPF: " + cliente.getCpf());
			System.out.println("-------------------------");		
		}
		
		clientes.remove(1);
	}
	

}
