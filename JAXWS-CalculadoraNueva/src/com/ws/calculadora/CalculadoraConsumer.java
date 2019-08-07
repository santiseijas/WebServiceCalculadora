package com.ws.calculadora;

public class CalculadoraConsumer {

	public static void main(String[] args) {
		CalculadoraImplService calService = new CalculadoraImplService();
		ICalculadora calculadora = calService.getCalculadoraImplPort();
		System.out.println("Suma");
		System.out.println(calculadora.suma(2, 2));
		System.out.println("Resta");
		System.out.println(calculadora.resta(8, 2));
		System.out.println("Multiplicacion");
		System.out.println(calculadora.multiplicacion(3, 4));
		System.out.println("Division");
		System.out.println(calculadora.division(8, 2));
	}

}
