package projects;

import java.util.ArrayList;

public class Cofrinho {

	private ArrayList<Moeda> moedas = new ArrayList<Moeda>();


	public void adicionar(Moeda addMoeda) {
		moedas.add(addMoeda);
		return;
	}

	public void remover(double valor) {
		for (int i = 0; i < moedas.size(); i++) {
			double m = moedas.get(i).converter();
			
			if (m == valor) {
				moedas.remove(i);			
			}
			
		}
		System.out.println("Removido!");
		return;

	}

	public void listagemMoedas() {
		for (int i = 0; i < moedas.size(); i++) {
			String listagem = moedas.get(i).info() + " - " + moedas.get(i).converter();
			System.out.println(listagem);
			
		}

		return;

	}

	public void totalConvertido() {
		var total = 0;
		for (int i = 0; i < moedas.size(); i++) {
			total += moedas.get(i).converter();

		}

		System.out.println(total + " reais");
		

		return;
	}

}