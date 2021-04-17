package aula24032021;

import java.util.ArrayList;
import java.util.InputMismatchException;

import aula17032021.Cliente;
import java.util.Scanner;

public class MenuPrincipal {

	public static void main(String[] args) {

		ArrayList<Cliente> clientes = new ArrayList<>();

		Scanner leitor = new Scanner(System.in);

		int opcao;
		do {
			System.out.println("**********************");
			System.out.println("   MENU PRINCIPAL");
			System.out.println("**********************");
			System.out.println("1 - CADASTRAR CLIENTE");
			System.out.println("2 - MOSTRAR TODOS OS CLIENTES");
			System.out.println("3 - MOSTRAR O CLIENTE DESEJADO");
			System.out.println("4 - ALTERAR DADOS DO CLIENTE");
			System.out.println("5 - EXCLUIR CLIENTE");
			System.out.println("6 - SAIR DO SISTEMA");
			System.out.println("Escolha a opção desejada: ");

			try {
				opcao = leitor.nextInt();
			} catch (InputMismatchException e) {
				opcao = 0;
			}
			
			switch (opcao) {
			case 1:
				System.out.println("CADASTRANDO CLIENTE...");

				System.out.println("Nome: ");
				String nome = leitor.next();

				System.out.println("RG: ");
				String rg = leitor.next();

				System.out.println("CPF: ");
				String cpf = leitor.next();

				// Cliente cliente = new Cliente(nome,rg,cpf);
				// clientes.add(cliente);

				clientes.add(new Cliente(nome, rg, cpf));

				System.out.println("Cliente cadastrado com sucesso !");
				System.out.println();
				break;
			case 2:
				System.out.println("MOSTRANDO OS CLIENTES...");

				for (Cliente cliente : clientes) {
					System.out.println("Nome: " + cliente.getNome());
					System.out.println("RG: " + cliente.getRg());
					System.out.println("CPF: " + cliente.getCpf());
					System.out.println("=======================");
				}
				break;
			case 3:
				System.out.println("Digite o nome do cliente: ");
				String nomePesquisa = leitor.next();

				for (int i = 0; i < clientes.size(); i++) {

					String nomeDoVetor = clientes.get(i).getNome();

					if (nomePesquisa.equalsIgnoreCase(nomeDoVetor)) {

						System.out.println("Nome: " + clientes.get(i).getNome());
						System.out.println("RG: " + clientes.get(i).getRg());
						System.out.println("CPF: " + clientes.get(i).getCpf());
						break;

					} else {
						System.out.println("Cliente não encontrado...");
					}
				}

				break;
			case 4:
				System.out.println("Digite o nome do cliente a ser alterado: ");
				nomePesquisa = leitor.next();

				for (int i = 0; i < clientes.size(); i++) {

					String nomeDoVetor = clientes.get(i).getNome();

					if (nomePesquisa.equalsIgnoreCase(nomeDoVetor)) {

						System.out.println("Nome: ");
						clientes.get(i).setNome(leitor.next());
						System.out.println("RG: ");
						clientes.get(i).setRg(leitor.next());
						System.out.println("CPF: ");
						clientes.get(i).setCpf(leitor.next());

						System.out.println("Cliente alterado com sucesso!!!");
						break;

					} else {
						System.out.println("Cliente não encontrado...");
					}
				}

				break;
			case 5:
				System.out.println("Digite o nome do cliente a ser excluido: ");
				nomePesquisa = leitor.next();

				for (int i = 0; i < clientes.size(); i++) {

					String nomeDoVetor = clientes.get(i).getNome();

					if (nomePesquisa.equalsIgnoreCase(nomeDoVetor)) {
						clientes.remove(i);
						break;

					} else {
						System.out.println("Cliente não encontrado...");
					}
				}

			case 6:
				System.out.println("FINALIZANDO O SISTEMA");
				break;
			default:
				System.out.println("OPÇÃO " + opcao + " INVÁLIDA.");
				break;
			}
		} while (opcao != 6);

		leitor.close();
	}

}
