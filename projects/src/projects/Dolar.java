package projects;

public class Dolar extends Moeda {
	
	public Dolar(double valor) {
		this.valor = valor;
	}


	@Override
	public double converter() {
		double convert = 0;
		convert = valor * 4.91;
		return convert;
	}

	@Override
	public String info() {
		tipo = "Dolar";
		return tipo;
	}

}
