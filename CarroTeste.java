package oo.heranca.teste;

import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class CarroTeste {
	public static void main(String[] args) {

		Ferrari ferrari = new Ferrari(250);
		Civic civic = new Civic(190);

		System.out.println(civic.toString());
		civic.acelerar();
		System.out.println(civic.toString());
		civic.frear();
		System.out.println(civic.toString());

		System.out.println("A maior velocidade da ferrari até agora foi: " + ferrari.maiorRegistro());
		System.out.println(ferrari.toString());
		ferrari.acelerar();
		System.out.println("A maior velocidade da ferrari até agora foi: " + ferrari.maiorRegistro());
		System.out.println(ferrari.toString());
		
		ferrari.ligarTurbo();
		ferrari.acelerar();
		System.out.println("A maior velocidade da ferrari até agora foi: " + ferrari.maiorRegistro());
		System.out.println(ferrari.toString());
		
		ferrari.frear();
		ferrari.desligarAr();
		ferrari.acelerar();
		System.out.println("A maior velocidade da ferrari até agora foi: " + ferrari.maiorRegistro());
		System.out.println(ferrari.toString());
		
		ferrari.frear();
		System.out.println("A maior velocidade da ferrari até agora foi: " + ferrari.maiorRegistro());
		System.out.println(ferrari.toString());
		ferrari.frear();
		System.out.println("A maior velocidade da ferrari até agora foi: " + ferrari.maiorRegistro());
		System.out.println(ferrari.toString());
		ferrari.frear();
		System.out.println("A maior velocidade da ferrari até agora foi: " + ferrari.maiorRegistro());
		System.out.println(ferrari.toString());
		ferrari.frear();
		System.out.println("A maior velocidade da ferrari até agora foi: " + ferrari.maiorRegistro());
		System.out.println(ferrari.toString());
		ferrari.frear();
		System.out.println("A maior velocidade da ferrari até agora foi: " + ferrari.maiorRegistro());
		System.out.println(ferrari.toString());
		ferrari.frear();
		System.out.println("A maior velocidade da ferrari até agora foi: " + ferrari.maiorRegistro());
		System.out.println(ferrari.toString());
		ferrari.frear();
		System.out.println("A maior velocidade da ferrari até agora foi: " + ferrari.maiorRegistro());
		System.out.println(ferrari.toString());
		ferrari.frear();
		System.out.println("A maior velocidade da ferrari até agora foi: " + ferrari.maiorRegistro());
		System.out.println(ferrari.toString());
		ferrari.frear();
		System.out.println("A maior velocidade da ferrari até agora foi: " + ferrari.maiorRegistro());
		System.out.println(ferrari.toString());
		
				

		

		
	}
}
