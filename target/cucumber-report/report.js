$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/05_ValidarExtrato.feature");
formatter.feature({
  "name": "validacao",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@ValidandoExtrato"
    }
  ]
});
formatter.scenario({
  "name": "validando aba de extrato",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@ValidandoExtrato"
    }
  ]
});
formatter.before({
  "status": "passed"
});
