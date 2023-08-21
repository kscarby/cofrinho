package projects;

public class Real extends Moeda {

	public Real(double valor) {
		this.valor = valor;
	}

	@Override
	public double converter() {
		valor = valor * 1;
		return valor;
	}

	@Override
	public String info() {
		tipo = "Real";
		return tipo;
	}

}