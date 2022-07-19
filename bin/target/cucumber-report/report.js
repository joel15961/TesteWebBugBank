$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Inventary.feature");
formatter.feature({
  "name": "Invetary",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@invetary"
    }
  ]
});
formatter.scenario({
  "name": "Adcionar um produto no carrinho",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@invetary"
    },
    {
      "name": "@testarcompra"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "o usuario escolher \"Price (low to high)\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "stepsDefinitions.InventarySteps.oUsuarioEscolher(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "adcionar um produto ao carrinho",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.InventarySteps.adcionarUmProdutoAoCarrinho()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no carrinho",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.InventarySteps.clicarNoCarrinho()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "devera aparecer a pagina de \"DESCRIPTION\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "stepsDefinitions.InventarySteps.deveraAparecerAPaginaDe(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Remover um produto no carrinho",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@invetary"
    },
    {
      "name": "@desfazercompra"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "o usuario escolher \"Price (low to high)\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "stepsDefinitions.InventarySteps.oUsuarioEscolher(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "adcionar um produto ao carrinho",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.InventarySteps.adcionarUmProdutoAoCarrinho()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no carrinho",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.InventarySteps.clicarNoCarrinho()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no botao remover",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.InventarySteps.clicarNoBotaoRemover()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "devera aparecer o carrinho vazio",
  "keyword": "Entao "
});
formatter.match({
  "location": "stepsDefinitions.InventarySteps.deveraAparecerOCarrinhoVazio()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "olhar Status e finalizar compra",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@invetary"
    },
    {
      "name": "@compraSimples"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "adcionar o produto no carrinho",
  "keyword": "Quando "
});
formatter.match({
  "location": "stepsDefinitions.InventarySteps.adcionarOProdutoNoCarrinho()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no carrinho",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.InventarySteps.clicarNoCarrinho()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no botao CHECKOUT",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.InventarySteps.clicarNoBotaoCHECKOUT()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "inserir o primeiro nome \"Valmir\"",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.InventarySteps.inserirOPrimeiroNome(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "inserir o sobrenome \"Junior\"",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.InventarySteps.inserirOSobrenome(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "inserir o codigo postal \"72815005\"",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.InventarySteps.inserirOCodigoPostal(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no botao continue",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.InventarySteps.clicarNoBotaoContinue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "finalizar a compra",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.InventarySteps.finalizarACompra()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "devera aparecer a menssagem \"THANK YOU FOR YOUR ORDER\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "stepsDefinitions.InventarySteps.deveraAparecerAMenssagem(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "escolher dois produtos e finalizar compra",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@invetary"
    },
    {
      "name": "@compraComplexa"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "abrir status do primeiro produto",
  "keyword": "Quando "
});
formatter.match({
  "location": "stepsDefinitions.InventarySteps.abrirStatusDoPrimeiroProduto()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "adcionar primeiro produto no carrinho",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.InventarySteps.adcionarPrimeiroProdutoNoCarrinho()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "voltar para a pagina de produtos",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.InventarySteps.voltarParaAPaginaDeProdutos()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "abrir status do segundo produto",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.InventarySteps.abrirStatusDoSegundoProduto()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "adcionar segundo produto no carrinho",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.InventarySteps.adcionarSegundoProdutoNoCarrinho()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no carrinho",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.InventarySteps.clicarNoCarrinho()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no botao CHECKOUT",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.InventarySteps.clicarNoBotaoCHECKOUT()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "inserir o primeiro nome \"Valmir\"",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.InventarySteps.inserirOPrimeiroNome(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "inserir o sobrenome \"Junior\"",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.InventarySteps.inserirOSobrenome(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "inserir o codigo postal \"72815005\"",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.InventarySteps.inserirOCodigoPostal(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no botao continue",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.InventarySteps.clicarNoBotaoContinue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "finalizar a compra",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.InventarySteps.finalizarACompra()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "devera aparecer a menssagem \"THANK YOU FOR YOUR ORDER\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "stepsDefinitions.InventarySteps.deveraAparecerAMenssagem(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Abrir status de um produto, abrir o item menu e escolher primeira opção",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@invetary"
    },
    {
      "name": "@usoMenu"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "abrir status do primeiro produto",
  "keyword": "Quando "
});
formatter.match({
  "location": "stepsDefinitions.InventarySteps.abrirStatusDoPrimeiroProduto()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no menu",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.InventarySteps.clicarNoMenu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escolher a primeira opção",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.InventarySteps.escolherAPrimeiraOpção()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "deve aparecer a pagina de \"PRODUCTS\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "stepsDefinitions.InventarySteps.deveAparecerAPaginaDe(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Adcionar tres produtos no carrinho e usar o menu para limpar carrinho",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@invetary"
    },
    {
      "name": "@usoMenuClear"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "abrir status do primeiro produto",
  "keyword": "Quando "
});
formatter.match({
  "location": "stepsDefinitions.InventarySteps.abrirStatusDoPrimeiroProduto()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "adcionar primeiro produto no carrinho",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.InventarySteps.adcionarPrimeiroProdutoNoCarrinho()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "voltar para a pagina de produtos",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.InventarySteps.voltarParaAPaginaDeProdutos()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "adcionar o segundo produto no carrinho",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.InventarySteps.adcionarOSegundoProdutoNoCarrinho()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "adcionar terceiro produto no carrinho",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.InventarySteps.adcionarTerceiroProdutoNoCarrinho()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no menu",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.InventarySteps.clicarNoMenu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escolher a opção resetar",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.InventarySteps.escolherAOpçãoResetar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "devera aparecer o carrinho vazio",
  "keyword": "Entao "
});
formatter.match({
  "location": "stepsDefinitions.InventarySteps.deveraAparecerOCarrinhoVazio()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.scenario({
  "name": "Realizar login com sucesso",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@loginSucesso"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "eu informar o usuario \"standard_user\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "stepsDefinitions.LoginSteps.euInformarOUsuario(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar a senha \"secret_sauce\"",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.LoginSteps.informarASenha(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "acionar o botao login",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.LoginSteps.acionarOBotaoLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema apresenta a pagina de \"PRODUCTS\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "stepsDefinitions.LoginSteps.oSistemaApresentaAPaginaDe(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Realizar login errado e aparecer menssagem de falha",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@loginFalho"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "eu informar o usuario \"Junior\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "stepsDefinitions.LoginSteps.euInformarOUsuario(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar a senha \"Junior\"",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.LoginSteps.informarASenha(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "acionar o botao login",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.LoginSteps.acionarOBotaoLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema apresenta a menssagem \"Epic sadface: Username and password do not match any user in this service\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "stepsDefinitions.LoginSteps.oSistemaApresentaAMenssagem(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Realizar login sem usuario nem senha e aparecer menssagem de erro",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@loginBranco"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "eu informar o usuario \"\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "stepsDefinitions.LoginSteps.euInformarOUsuario(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar a senha \"\"",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.LoginSteps.informarASenha(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "acionar o botao login",
  "keyword": "E "
});
formatter.match({
  "location": "stepsDefinitions.LoginSteps.acionarOBotaoLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema apresentara a menssagem \"Epic sadface: Username is required\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "stepsDefinitions.LoginSteps.oSistemaApresentaraAMenssagem(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});