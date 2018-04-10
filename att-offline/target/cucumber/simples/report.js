$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TrianguloSimples.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# encoding: UTF-8"
    },
    {
      "line": 2,
      "value": "# language: pt"
    }
  ],
  "line": 4,
  "name": "Calculo de Triângulo",
  "description": "",
  "id": "calculo-de-triângulo",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "line": 6,
  "name": "Calculando triângulo equilátero",
  "description": "",
  "id": "calculo-de-triângulo;calculando-triângulo-equilátero",
  "type": "scenario",
  "keyword": "Cenário"
});
formatter.step({
  "line": 7,
  "name": "que eu estou na pagina de consulta de triangulo",
  "keyword": "Dado "
});
formatter.step({
  "line": 8,
  "name": "eu preencho o lado1 com \"2\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 9,
  "name": "eu preencho o lado2 com \"2\"",
  "keyword": "E "
});
formatter.step({
  "line": 10,
  "name": "eu preencho o lado3 com \"2\"",
  "keyword": "E "
});
formatter.step({
  "line": 11,
  "name": "apresenta mensagem \"Triângulo Equilátero\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "TrianguloSimplesStepsDefinition.que_eu_estou_na_pagina_de_consulta_de_triangulo()"
});
formatter.result({
  "duration": 239038336,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 25
    }
  ],
  "location": "TrianguloSimplesStepsDefinition.eu_preencho_o_lado1_com(int)"
});
formatter.result({
  "duration": 5826600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 25
    }
  ],
  "location": "TrianguloSimplesStepsDefinition.eu_preencho_o_lado2_com(int)"
});
formatter.result({
  "duration": 158834,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 25
    }
  ],
  "location": "TrianguloSimplesStepsDefinition.eu_preencho_o_lado3_com(int)"
});
formatter.result({
  "duration": 133674,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Triângulo Equilátero",
      "offset": 20
    }
  ],
  "location": "TrianguloSimplesStepsDefinition.apresenta_mensagem(String)"
});
formatter.result({
  "duration": 2038755,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Calculando triângulo isósceles",
  "description": "",
  "id": "calculo-de-triângulo;calculando-triângulo-isósceles",
  "type": "scenario",
  "keyword": "Cenário"
});
formatter.step({
  "line": 14,
  "name": "que eu estou na pagina de consulta de triangulo",
  "keyword": "Dado "
});
formatter.step({
  "line": 15,
  "name": "eu preencho o lado1 com \"2\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 16,
  "name": "eu preencho o lado2 com \"2\"",
  "keyword": "E "
});
formatter.step({
  "line": 17,
  "name": "eu preencho o lado3 com \"3\"",
  "keyword": "E "
});
formatter.step({
  "line": 18,
  "name": "apresenta mensagem \"Triângulo Isósceles\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "TrianguloSimplesStepsDefinition.que_eu_estou_na_pagina_de_consulta_de_triangulo()"
});
formatter.result({
  "duration": 153295,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 25
    }
  ],
  "location": "TrianguloSimplesStepsDefinition.eu_preencho_o_lado1_com(int)"
});
formatter.result({
  "duration": 142434,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 25
    }
  ],
  "location": "TrianguloSimplesStepsDefinition.eu_preencho_o_lado2_com(int)"
});
formatter.result({
  "duration": 118400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 25
    }
  ],
  "location": "TrianguloSimplesStepsDefinition.eu_preencho_o_lado3_com(int)"
});
formatter.result({
  "duration": 128392,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Triângulo Isósceles",
      "offset": 20
    }
  ],
  "location": "TrianguloSimplesStepsDefinition.apresenta_mensagem(String)"
});
formatter.result({
  "duration": 123761,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Calculando triângulo isósceles2",
  "description": "",
  "id": "calculo-de-triângulo;calculando-triângulo-isósceles2",
  "type": "scenario",
  "keyword": "Cenário"
});
formatter.step({
  "line": 21,
  "name": "que eu estou na pagina de consulta de triangulo",
  "keyword": "Dado "
});
formatter.step({
  "line": 22,
  "name": "eu preencho o lado1 com \"2\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 23,
  "name": "eu preencho o lado2 com \"3\"",
  "keyword": "E "
});
formatter.step({
  "line": 24,
  "name": "eu preencho o lado3 com \"2\"",
  "keyword": "E "
});
formatter.step({
  "line": 25,
  "name": "apresenta mensagem \"Triângulo Isósceles\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "TrianguloSimplesStepsDefinition.que_eu_estou_na_pagina_de_consulta_de_triangulo()"
});
formatter.result({
  "duration": 126501,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 25
    }
  ],
  "location": "TrianguloSimplesStepsDefinition.eu_preencho_o_lado1_com(int)"
});
formatter.result({
  "duration": 122100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 25
    }
  ],
  "location": "TrianguloSimplesStepsDefinition.eu_preencho_o_lado2_com(int)"
});
formatter.result({
  "duration": 125654,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 25
    }
  ],
  "location": "TrianguloSimplesStepsDefinition.eu_preencho_o_lado3_com(int)"
});
formatter.result({
  "duration": 121311,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Triângulo Isósceles",
      "offset": 20
    }
  ],
  "location": "TrianguloSimplesStepsDefinition.apresenta_mensagem(String)"
});
formatter.result({
  "duration": 98621,
  "status": "passed"
});
});