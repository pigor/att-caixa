package br.com.adaptworks.triangulo;

public class Triangulo {

	public String calcularTipo(Integer lado1, Integer lado2, Integer lado3) {
		if (verificarPositivos(lado1, lado2, lado3)
			&& verificaTrianguloValido(lado1, lado2, lado3)) {
			
			if (verificaTrianguloEquilatero(lado1, lado2, lado3))
				return "Triângulo Equilátero";
			if (verificaTrianguloIsosceles(lado1, lado2, lado3))
				return "Triângulo Isósceles";
			else
				return "Triângulo Escaleno";
		}
		return "";

	}

	private boolean verificarPositivos(Integer lado1, Integer lado2, Integer lado3) {
		return lado1 > 0 && lado2 > 0 && lado3 > 0;
	}

	private boolean verificaTrianguloEquilatero(Integer lado1, Integer lado2, Integer lado3) {
		return lado1 == lado2 && lado2 == lado3;
	}

	private boolean verificaTrianguloIsosceles(Integer lado1, Integer lado2, Integer lado3) {
		return lado1 == lado2 || lado2 == lado3 || lado1 == lado3;
	}
	
	private boolean verificaTrianguloValido(Integer lado1, Integer lado2, Integer lado3) {
		return (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado3 + lado2 > lado1);
	}

}
