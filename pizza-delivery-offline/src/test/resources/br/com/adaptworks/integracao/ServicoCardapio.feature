# encoding: UTF-8
# language: pt

Funcionalidade: Administrar Cardápio
					 
	Cenário: Adicionar produto no cardápio
		Dado que eu tenho um novo produto para adicionar ao cardapio
		Quando eu informo a descricao "Pizza Portuguesa"
		E informo o valor "10.0"
		Entao apresenta mensagem "Produto Adicionado!"
		
	Cenário: Atualizar produto no cardápio
		Dado que eu tenho um novo produto para adicionar ao cardapio
		Quando eu informo a descricao "Pizza Portuguesa"
		E informo o valor "15.0"
		Entao apresenta mensagem "Produto Atualizado!"				