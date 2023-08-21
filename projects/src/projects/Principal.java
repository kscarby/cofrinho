package projects;

import java.util.Scanner;

public class Principal {

	private static Scanner entrada;

	public static void main(String[] args) {

		entrada = new Scanner(System.in);
		Cofrinho cofrinho = new Cofrinho();
		double valor = 0;
		int opcaoMenu;

		System.out.println("****************");
		System.out.println("* Meu cofrinho *");
		System.out.println("****************");
		System.out.println("\n1- Adicionar Moeda");
		System.out.println("2- Listar Moedas");
		System.out.println("3- Remover Moedas");
		System.out.println("4- Total Convertido");
		System.out.println("0- Encerrar");

		// loop do while com a condicional para escolher a opção de 1 a 4
		do {

			System.out.println("\nEscolha uma opção: ");
			opcaoMenu = entrada.nextInt();

			// escolha do tipo de moeda para adicionar no cofrinho
			if (opcaoMenu == 1) {

				System.out.println("Escolha a moeda\n");
				System.out.println("1-Real");
				System.out.println("2-Dolar");
				System.out.println("3-Euro");
				int opcaoMoeda = entrada.nextInt();

				switch (opcaoMoeda) {
				case 1:
					// real
					System.out.println("\nDigite o valor: ");

					valor = entrada.nextDouble();
					Real real = new Real(valor);
					cofrinho.adicionar(real);

					break;

				case 2:
					// dollar
					System.out.println("\nDigite o valor: ");
					valor = entrada.nextDouble();

					Dolar dolar = new Dolar(valor);

					cofrinho.adicionar(dolar);

					break;

				case 3:
					// euro
					System.out.println("\nDigite o valor: ");
					valor = entrada.nextDouble();

					Euro euro = new Euro(valor);

					cofrinho.adicionar(euro);

					break;

				default:
					System.out.println("Opcçao Inválida");

					break;
				}

			}

			// listar as moedas existentes no cofrinho
			if (opcaoMenu == 2) {

				cofrinho.listagemMoedas();

			}

			// opção para remover moedas
			if (opcaoMenu == 3) {
				System.out.println("Digite o valor: ");
				valor = entrada.nextDouble();
				cofrinho.remover(valor);
			}

			if (opcaoMenu == 4) {
				
				cofrinho.totalConvertido();

			}
			
		// encerra o cofrinho
		} while (opcaoMenu != 0);
	}
}
