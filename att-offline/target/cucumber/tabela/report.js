$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TrianguloTabela.feature");
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
  "name": "Calculando triângulo equiátero",
  "description": "",
  "id": "calculo-de-triângulo;calculando-triângulo-equiátero",
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
  "name": "eu preencho os seguintes lados",
  "rows": [
    {
      "cells": [
        "lado1",
        "lado2",
        "lado3"
      ],
      "line": 9
    },
    {
      "cells": [
        "1",
        "1",
        "1"
      ],
      "line": 10
    },
    {
      "cells": [
        "5",
        "5",
        "5"
      ],
      "line": 11
    }
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 12,
  "name": "apresenta mensagem \"Triângulo Equilátero\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "TrianguloTabelaStepsDefinition.que_eu_estou_na_pagina_de_consulta_de_triangulo()"
});
formatter.result({
  "duration": 335474727,
  "status": "passed"
});
formatter.match({
  "location": "TrianguloTabelaStepsDefinition.eu_preencho_os_seguintes_lados(TrianguloTabelaStepsDefinition$LadosTriangulo\u003e)"
});
formatter.result({
  "duration": 40099841,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Triângulo Equilátero",
      "offset": 20
    }
  ],
  "location": "TrianguloTabelaStepsDefinition.apresenta_mensagem(String)"
});
formatter.result({
  "duration": 1257942,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Calculando triângulo isósceles",
  "description": "",
  "id": "calculo-de-triângulo;calculando-triângulo-isósceles",
  "type": "scenario",
  "keyword": "Cenário"
});
formatter.step({
  "line": 16,
  "name": "que eu estou na pagina de consulta de triangulo",
  "keyword": "Dado "
});
formatter.step({
  "line": 17,
  "name": "eu preencho os seguintes lados",
  "rows": [
    {
      "cells": [
        "lado1",
        "lado2",
        "lado3"
      ],
      "line": 18
    },
    {
      "cells": [
        "2",
        "2",
        "1"
      ],
      "line": 19
    },
    {
      "cells": [
        "5",
        "7",
        "5"
      ],
      "line": 20
    },
    {
      "cells": [
        "5",
        "5",
        "7"
      ],
      "line": 21
    }
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 22,
  "name": "apresenta mensagem \"Triângulo Isósceles\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "TrianguloTabelaStepsDefinition.que_eu_estou_na_pagina_de_consulta_de_triangulo()"
});
formatter.result({
  "duration": 693748,
  "status": "passed"
});
formatter.match({
  "location": "TrianguloTabelaStepsDefinition.eu_preencho_os_seguintes_lados(TrianguloTabelaStepsDefinition$LadosTriangulo\u003e)"
});
formatter.result({
  "duration": 5250165,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Triângulo Isósceles",
      "offset": 20
    }
  ],
  "location": "TrianguloTabelaStepsDefinition.apresenta_mensagem(String)"
});
formatter.result({
  "duration": 147260,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Calculando triângulo escaleno",
  "description": "",
  "id": "calculo-de-triângulo;calculando-triângulo-escaleno",
  "type": "scenario",
  "keyword": "Cenário"
});
formatter.step({
  "line": 26,
  "name": "que eu estou na pagina de consulta de triangulo",
  "keyword": "Dado "
});
formatter.step({
  "line": 27,
  "name": "eu preencho os seguintes lados",
  "rows": [
    {
      "cells": [
        "lado1",
        "lado2",
        "lado3"
      ],
      "line": 28
    },
    {
      "cells": [
        "2",
        "3",
        "4"
      ],
      "line": 29
    },
    {
      "cells": [
        "3",
        "7",
        "9"
      ],
      "line": 30
    }
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 31,
  "name": "apresenta mensagem \"Triângulo Escaleno\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "TrianguloTabelaStepsDefinition.que_eu_estou_na_pagina_de_consulta_de_triangulo()"
});
formatter.result({
  "duration": 1640431,
  "status": "passed"
});
formatter.match({
  "location": "TrianguloTabelaStepsDefinition.eu_preencho_os_seguintes_lados(TrianguloTabelaStepsDefinition$LadosTriangulo\u003e)"
});
formatter.result({
  "duration": 1483476,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Triângulo Escaleno",
      "offset": 20
    }
  ],
  "location": "TrianguloTabelaStepsDefinition.apresenta_mensagem(String)"
});
formatter.result({
  "duration": 1671709,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[Triângulo Escaleno]\u003e but was:\u003c[]\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:115)\n\tat org.junit.Assert.assertEquals(Assert.java:144)\n\tat br.com.adaptworks.triangulo.integracao.tabela.TrianguloTabelaStepsDefinition.apresenta_mensagem(TrianguloTabelaStepsDefinition.java:39)\n\tat ✽.Entao apresenta mensagem \"Triângulo Escaleno\"(TrianguloTabela.feature:31)\n",
  "status": "failed"
});
});