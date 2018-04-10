# encoding: UTF-8
# language: pt

Funcionalidade: Calculo de Triângulo
					 
	Cenário: Calculando triângulo equiátero
		Dado que eu estou na pagina de consulta de triangulo
		Quando eu preencho os seguintes lados
			|lado1|lado2|lado3|
			|  1  |  1  |  1  |
			|  5  |  5  |  5  |
		Entao apresenta mensagem "Triângulo Equilátero"


	Cenário: Calculando triângulo isósceles
		Dado que eu estou na pagina de consulta de triangulo
		Quando eu preencho os seguintes lados
			|lado1|lado2|lado3|
			|  2  |  2  |  1  |
			|  5  |  7  |  5  |
			|  5  |  5  |  7  |
		Entao apresenta mensagem "Triângulo Isósceles"	
		
		
	Cenário: Calculando triângulo escaleno
		Dado que eu estou na pagina de consulta de triangulo
		Quando eu preencho os seguintes lados
			|lado1|lado2|lado3|
			|  2  |  3  |  4  |
			|  3  |  7  |  9  |
		Entao apresenta mensagem "Triângulo Escaleno"	