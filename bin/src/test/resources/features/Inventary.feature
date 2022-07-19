#language: pt
#enconding: UTF-8

@invetary
Funcionalidade: Invetary

  @testarcompra
  Cenario: Adcionar um produto no carrinho
    Quando o usuario escolher "Price (low to high)"
    E adcionar um produto ao carrinho
    E clicar no carrinho
    Entao devera aparecer a pagina de "DESCRIPTION"

  @desfazercompra
  Cenario: Remover um produto no carrinho
    Quando o usuario escolher "Price (low to high)"
    E adcionar um produto ao carrinho
    E clicar no carrinho
    E clicar no botao remover
    Entao devera aparecer o carrinho vazio

  @compraSimples
  Cenario: olhar Status e finalizar compra
    Quando adcionar o produto no carrinho
    E clicar no carrinho
    E clicar no botao CHECKOUT
    E inserir o primeiro nome "Valmir"
    E inserir o sobrenome "Junior"
    E inserir o codigo postal "72815005"
    E clicar no botao continue
    E finalizar a compra
    Entao devera aparecer a menssagem "THANK YOU FOR YOUR ORDER"

  @compraComplexa
  Cenario: escolher dois produtos e finalizar compra
    Quando abrir status do primeiro produto
    E adcionar primeiro produto no carrinho
    E voltar para a pagina de produtos
    E abrir status do segundo produto
    E adcionar segundo produto no carrinho
    E clicar no carrinho
    E clicar no botao CHECKOUT
    E inserir o primeiro nome "Valmir"
    E inserir o sobrenome "Junior"
    E inserir o codigo postal "72815005"
    E clicar no botao continue
    E finalizar a compra
    Entao devera aparecer a menssagem "THANK YOU FOR YOUR ORDER"

  @usoMenu
  Cenario: Abrir status de um produto, abrir o item menu e escolher primeira opção
    Quando abrir status do primeiro produto
    E clicar no menu
    E escolher a primeira opção
    Entao deve aparecer a pagina de "PRODUCTS"

@usoMenuClear
Cenario: Adcionar tres produtos no carrinho e usar o menu para limpar carrinho
  Quando abrir status do primeiro produto
  E adcionar primeiro produto no carrinho
  E voltar para a pagina de produtos
  E adcionar o segundo produto no carrinho
  E adcionar terceiro produto no carrinho
  E clicar no menu
  E escolher a opção resetar
  Entao devera aparecer o carrinho vazio

