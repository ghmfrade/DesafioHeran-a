package oo.heranca.desafio;

import java.util.TreeSet;

public interface Esportivo {
	
	public int coisa = 0;
	
	TreeSet<Double> registroDeVelocidade = new TreeSet<Double>();

	void ligarTurbo(); // Todo m�todo de interface � abstrato e � publico por padrao

	void desligarTurbo(); // Uma interface pode ter metodos, por�m nao tem corpo
	
	void registrarVelocidade();
	
	double maiorRegistro();

}
