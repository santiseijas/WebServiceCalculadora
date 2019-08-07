package com.ws.calculadora;

import javax.jws.WebService;

@WebService(endpointInterface="com.ws.calculadora.ICalculadora")
public class CalculadoraImpl implements ICalculadora {

	double resultado=0;
	@Override
	public double suma(int valor1, int valor2) {
		resultado=valor1+valor2;
		return resultado;
	}

	@Override
	public double resta(int valor1, int valor2) {
		resultado=valor1-valor2;
		return resultado;
	}

	@Override
	public double multiplicacion(int valor1, int valor2) {
		resultado=valor1*valor2;
		return resultado;
	}

	@Override
	public double division(int valor1, int valor2) {
		resultado=valor1/valor2;
		return resultado;
	}

}
