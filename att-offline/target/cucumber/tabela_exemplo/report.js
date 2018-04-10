$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TrianguloUI.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#encoding: utf-8"
    },
    {
      "line": 2,
      "value": "#language: pt"
    },
    {
      "line": 5,
      "value": "# Este exemplo utiliza o Scenario Outline que foi traduzido como Esquema do Cenário."
    },
    {
      "line": 6,
      "value": "# Um Scenario Outline deve sempre utilizar a subistituição dos valores por \u003ccoluna_tabela\u003e"
    },
    {
      "line": 7,
      "value": "# e deve conter, obrigatoriamente, um item de Exemples (Exemplos)"
    },
    {
      "line": 8,
      "value": "# https://github.com/cucumber/cucumber/wiki/Scenario-Outlines"
    }
  ],
  "line": 11,
  "name": "Calculo de triangulos",
  "description": "",
  "id": "calculo-de-triangulos",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "line": 22,
  "name": "Calculo de todos os tipos de triangulo",
  "description": "",
  "id": "calculo-de-triangulos;calculo-de-todos-os-tipos-de-triangulo;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenario"
});
formatter.step({
  "line": 14,
  "name": "os tres campos de entrada",
  "keyword": "Dado "
});
formatter.step({
  "line": 15,
  "name": "eu informo o lado1 com valor 1",
  "matchedColumns": [
    0
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 16,
  "name": "eu informo o lado2 com valor 1",
  "matchedColumns": [
    1
  ],
  "keyword": "E "
});
formatter.step({
  "line": 17,
  "name": "eu informo o lado3 com valor 1",
  "matchedColumns": [
    2
  ],
  "keyword": "E "
});
formatter.step({
  "line": 18,
  "name": "exibe a mensagem \"Triângulo Equilatero\"",
  "matchedColumns": [
    3
  ],
  "keyword": "Entao "
});
formatter.match({
  "location": "TrianguloUIStepsDefinition.os_tres_campos_de_entrada()"
});
formatter.result({
  "duration": 359204652,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 29
    }
  ],
  "location": "TrianguloUIStepsDefinition.eu_informo_o_lado1_com_valor(int)"
});
formatter.result({
  "duration": 4023112,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 29
    }
  ],
  "location": "TrianguloUIStepsDefinition.eu_informo_o_lado2_com_valor(int)"
});
formatter.result({
  "duration": 160713,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 29
    }
  ],
  "location": "TrianguloUIStepsDefinition.eu_informo_o_lado3_com_valor(int)"
});
formatter.result({
  "duration": 154110,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Triângulo Equilatero",
      "offset": 18
    }
  ],
  "location": "TrianguloUIStepsDefinition.exibe_a_mensagem(String)"
});
formatter.result({
  "duration": 9493711013,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Calculo de todos os tipos de triangulo",
  "description": "",
  "id": "calculo-de-triangulos;calculo-de-todos-os-tipos-de-triangulo;;3",
  "type": "scenario",
  "keyword": "Esquema do Cenario"
});
formatter.step({
  "line": 14,
  "name": "os tres campos de entrada",
  "keyword": "Dado "
});
formatter.step({
  "line": 15,
  "name": "eu informo o lado1 com valor 2",
  "matchedColumns": [
    0
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 16,
  "name": "eu informo o lado2 com valor 3",
  "matchedColumns": [
    1
  ],
  "keyword": "E "
});
formatter.step({
  "line": 17,
  "name": "eu informo o lado3 com valor 4",
  "matchedColumns": [
    2
  ],
  "keyword": "E "
});
formatter.step({
  "line": 18,
  "name": "exibe a mensagem \"Triângulo Escaleno\"",
  "matchedColumns": [
    3
  ],
  "keyword": "Entao "
});
formatter.match({
  "location": "TrianguloUIStepsDefinition.os_tres_campos_de_entrada()"
});
formatter.result({
  "duration": 180885,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 29
    }
  ],
  "location": "TrianguloUIStepsDefinition.eu_informo_o_lado1_com_valor(int)"
});
formatter.result({
  "duration": 203240,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 29
    }
  ],
  "location": "TrianguloUIStepsDefinition.eu_informo_o_lado2_com_valor(int)"
});
formatter.result({
  "duration": 124181,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 29
    }
  ],
  "location": "TrianguloUIStepsDefinition.eu_informo_o_lado3_com_valor(int)"
});
formatter.result({
  "duration": 127619,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Triângulo Escaleno",
      "offset": 18
    }
  ],
  "location": "TrianguloUIStepsDefinition.exibe_a_mensagem(String)"
});
formatter.result({
  "duration": 8348812617,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Calculo de todos os tipos de triangulo",
  "description": "",
  "id": "calculo-de-triangulos;calculo-de-todos-os-tipos-de-triangulo;;4",
  "type": "scenario",
  "keyword": "Esquema do Cenario"
});
formatter.step({
  "line": 14,
  "name": "os tres campos de entrada",
  "keyword": "Dado "
});
formatter.step({
  "line": 15,
  "name": "eu informo o lado1 com valor 2",
  "matchedColumns": [
    0
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 16,
  "name": "eu informo o lado2 com valor 2",
  "matchedColumns": [
    1
  ],
  "keyword": "E "
});
formatter.step({
  "line": 17,
  "name": "eu informo o lado3 com valor 3",
  "matchedColumns": [
    2
  ],
  "keyword": "E "
});
formatter.step({
  "line": 18,
  "name": "exibe a mensagem \"Triângulo Isosceles\"",
  "matchedColumns": [
    3
  ],
  "keyword": "Entao "
});
formatter.match({
  "location": "TrianguloUIStepsDefinition.os_tres_campos_de_entrada()"
});
formatter.result({
  "duration": 124639,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 29
    }
  ],
  "location": "TrianguloUIStepsDefinition.eu_informo_o_lado1_com_valor(int)"
});
formatter.result({
  "duration": 128517,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 29
    }
  ],
  "location": "TrianguloUIStepsDefinition.eu_informo_o_lado2_com_valor(int)"
});
formatter.result({
  "duration": 113146,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 29
    }
  ],
  "location": "TrianguloUIStepsDefinition.eu_informo_o_lado3_com_valor(int)"
});
formatter.result({
  "duration": 128549,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Triângulo Isosceles",
      "offset": 18
    }
  ],
  "location": "TrianguloUIStepsDefinition.exibe_a_mensagem(String)"
});
formatter.result({
  "duration": 8675906009,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Calculo de todos os tipos de triangulo",
  "description": "",
  "id": "calculo-de-triangulos;calculo-de-todos-os-tipos-de-triangulo;;5",
  "type": "scenario",
  "keyword": "Esquema do Cenario"
});
formatter.step({
  "line": 14,
  "name": "os tres campos de entrada",
  "keyword": "Dado "
});
formatter.step({
  "line": 15,
  "name": "eu informo o lado1 com valor 2",
  "matchedColumns": [
    0
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 16,
  "name": "eu informo o lado2 com valor 3",
  "matchedColumns": [
    1
  ],
  "keyword": "E "
});
formatter.step({
  "line": 17,
  "name": "eu informo o lado3 com valor 3",
  "matchedColumns": [
    2
  ],
  "keyword": "E "
});
formatter.step({
  "line": 18,
  "name": "exibe a mensagem \"Triângulo Isosceles\"",
  "matchedColumns": [
    3
  ],
  "keyword": "Entao "
});
formatter.match({
  "location": "TrianguloUIStepsDefinition.os_tres_campos_de_entrada()"
});
formatter.result({
  "duration": 191301,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 29
    }
  ],
  "location": "TrianguloUIStepsDefinition.eu_informo_o_lado1_com_valor(int)"
});
formatter.result({
  "duration": 128405,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 29
    }
  ],
  "location": "TrianguloUIStepsDefinition.eu_informo_o_lado2_com_valor(int)"
});
formatter.result({
  "duration": 140041,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 29
    }
  ],
  "location": "TrianguloUIStepsDefinition.eu_informo_o_lado3_com_valor(int)"
});
formatter.result({
  "duration": 144597,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Triângulo Isosceles",
      "offset": 18
    }
  ],
  "location": "TrianguloUIStepsDefinition.exibe_a_mensagem(String)"
});
formatter.result({
  "duration": 9364910810,
  "status": "passed"
});
});