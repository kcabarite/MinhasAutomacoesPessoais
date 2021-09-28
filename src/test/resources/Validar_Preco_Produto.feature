#language: pt
#encoding: utf-8
@PrecoProduto
Funcionalidade: Validar Preco do Carrinho de Produto
  Com um o seu acesso de usuario
  Maria seleciona um produto no site YourLogo
  Para que consiga verificar o preço na tela Summary

  Esquema do Cenario: Comparar Preco Produto 1
    Dado que Maria entra com <usuario> e <senha> na tela inicial do YourLogo
    Quando ela escolhe um produto no site
    Entao ela deve finalizar a compra e ir na tela Summary para conferir se o preco total da compra esta correto

    Exemplos: 
      | usuario             | senha       |
      | "email@email.email" | "tester123" |
