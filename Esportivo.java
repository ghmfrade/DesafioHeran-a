package oo.heranca.desafio;

import java.util.TreeSet;

public interface Esportivo {
	
	public int coisa = 0;
	
	TreeSet<Double> registroDeVelocidade = new TreeSet<Double>();

	void ligarTurbo(); // Todo método de interface é abstrato e é publico por padrao

	void desligarTurbo(); // Uma interface pode ter metodos, porém nao tem corpo
	
	void registrarVelocidade();
	
	double maiorRegistro();

}
