$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ServicoCardapio.feature");
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
  "name": "Administrar Cardápio",
  "description": "",
  "id": "administrar-cardápio",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "line": 6,
  "name": "Adicionar produto no cardápio",
  "description": "",
  "id": "administrar-cardápio;adicionar-produto-no-cardápio",
  "type": "scenario",
  "keyword": "Cenário"
});
formatter.step({
  "line": 7,
  "name": "que eu tenho um novo produto para adicionar ao cardapio",
  "keyword": "Dado "
});
formatter.step({
  "line": 8,
  "name": "eu informo a descricao \"Pizza Portuguesa\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 9,
  "name": "informo o valor \"10.0\"",
  "keyword": "E "
});
formatter.step({
  "line": 10,
  "name": "apresenta mensagem \"Produto Adicionado!\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "ServicoCardapioSteps.que_eu_tenho_um_novo_produto_para_adicionar_ao_cardapio()"
});
formatter.result({
  "duration": 185004119,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pizza Portuguesa",
      "offset": 24
    }
  ],
  "location": "ServicoCardapioSteps.eu_informo_a_descricao(String)"
});
formatter.result({
  "duration": 3551966,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10.0",
      "offset": 17
    }
  ],
  "location": "ServicoCardapioSteps.informo_o_valor(String)"
});
formatter.result({
  "duration": 161180,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Produto Adicionado!",
      "offset": 20
    }
  ],
  "location": "ServicoCardapioSteps.apresenta_mensagem(String)"
});
formatter.result({
  "duration": 1492980,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Atualizar produto no cardápio",
  "description": "",
  "id": "administrar-cardápio;atualizar-produto-no-cardápio",
  "type": "scenario",
  "keyword": "Cenário"
});
formatter.step({
  "line": 13,
  "name": "que eu tenho um novo produto para adicionar ao cardapio",
  "keyword": "Dado "
});
formatter.step({
  "line": 14,
  "name": "eu informo a descricao \"Pizza Portuguesa\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 15,
  "name": "informo o valor \"15.0\"",
  "keyword": "E "
});
formatter.step({
  "line": 16,
  "name": "apresenta mensagem \"Produto Atualizado!\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "ServicoCardapioSteps.que_eu_tenho_um_novo_produto_para_adicionar_ao_cardapio()"
});
formatter.result({
  "duration": 128154,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pizza Portuguesa",
      "offset": 24
    }
  ],
  "location": "ServicoCardapioSteps.eu_informo_a_descricao(String)"
});
formatter.result({
  "duration": 116381,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "15.0",
      "offset": 17
    }
  ],
  "location": "ServicoCardapioSteps.informo_o_valor(String)"
});
formatter.result({
  "duration": 104815,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Produto Atualizado!",
      "offset": 20
    }
  ],
  "location": "ServicoCardapioSteps.apresenta_mensagem(String)"
});
formatter.result({
  "duration": 132861,
  "status": "passed"
});
});