package projects;

public class Euro extends Moeda {
	
	public Euro(double valor) {
		this.valor = valor;
	}


	@Override
	public double converter() {
		double convert = 0;
		convert = valor * 5.38;
		return convert;
	}

	@Override
	public String info() {
		tipo = "Euro";
		return tipo;
	}

}