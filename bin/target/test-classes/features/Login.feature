#language: pt
#enconding: UTF-8

@login
Funcionalidade: Login

  @loginSucesso
  Cenario: Realizar login com sucesso
    Quando eu informar o usuario "standard_user"
    E informar a senha "secret_sauce"
    E acionar o botao login
    Entao o sistema apresenta a pagina de "PRODUCTS"

  @loginFalho
  Cenario: Realizar login errado e aparecer menssagem de falha
    Quando eu informar o usuario "Junior"
    E informar a senha "Junior"
    E acionar o botao login
    Entao o sistema apresenta a menssagem "Epic sadface: Username and password do not match any user in this service"

  @loginBranco
  Cenario: Realizar login sem usuario nem senha e aparecer menssagem de erro
    Quando eu informar o usuario ""
    E informar a senha ""
    E acionar o botao login
    Entao o sistema apresentara a menssagem "Epic sadface: Username is required"
