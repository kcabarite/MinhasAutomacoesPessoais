$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Validar_Preco_Produto.feature");
formatter.feature({
  "name": "Validar Preco do Carrinho de Produto",
  "description": "  Com um o seu acesso de usuario\n  Maria seleciona um produto no site YourLogo\n  Para que consiga verificar o pre�o na tela Summary",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@PrecoProduto"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Comparar Preco Produto 1",
  "description": "",
  "keyword": "Esquema do Cenario"
});
formatter.step({
  "name": "que Maria entra com \u003cusuario\u003e e \u003csenha\u003e na tela inicial do YourLogo",
  "keyword": "Dado "
});
formatter.step({
  "name": "ela escolhe um produto no site",
  "keyword": "Quando "
});
formatter.step({
  "name": "ela deve finalizar a compra e ir na tela Summary para conferir se o preco total da compra esta correto",
  "keyword": "Entao "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Exemplos",
  "rows": [
    {
      "cells": [
        "usuario",
        "senha"
      ]
    },
    {
      "cells": [
        "\"email@email.email\"",
        "\"tester123\""
      ]
    }
  ]
});
formatter.scenario({
  "name": "Comparar Preco Produto 1",
  "description": "",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "name": "@PrecoProduto"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que Maria entra com \"email@email.email\" e \"tester123\" na tela inicial do YourLogo",
  "keyword": "Dado "
});
formatter.match({
  "location": "everis.Validar_Preco_Produto.que_Maria_entra_com_e_na_tela_inicial_do_YourLogo(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ela escolhe um produto no site",
  "keyword": "Quando "
});
formatter.match({
  "location": "everis.Validar_Preco_Produto.ela_escolhe_um_produto_no_site()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ela deve finalizar a compra e ir na tela Summary para conferir se o preco total da compra esta correto",
  "keyword": "Entao "
});
formatter.match({
  "location": "everis.Validar_Preco_Produto.ela_deve_finalizar_a_compra_e_ir_na_tela_Summary_para_conferir_se_o_preco_total_da_compra_esta_correto()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});