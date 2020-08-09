package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {

	private boolean turboLigado;
	private boolean arLigado;

	public Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		setDelta(15);
	}

	@Override
	public void acelerar() {
		super.acelerar();
		registrarVelocidade();
	}

	@Override
	public void ligarTurbo() {
		this.turboLigado = true;
	}

	@Override
	public void desligarTurbo() {
		this.turboLigado = false;
	}
	@Override
	public void registrarVelocidade() {
		registroDeVelocidade.add(getVelocidade());
	}
	@Override
	public double maiorRegistro() {
		registroDeVelocidade.add(0.0);
		return registroDeVelocidade.last();
	}

	@Override
	public void ligarAr() {
		this.arLigado = true;
	}

	@Override
	public void desligarAr() {
		this.arLigado = false;
	}

	@Override
	public int getDelta() {
		if (turboLigado && !arLigado) {
			return 35;
		} else if (turboLigado && arLigado) {
			return 30;
		} else if (!turboLigado && !arLigado) {
			return 15;
		} else {
			return 10;
		}
	}

}
