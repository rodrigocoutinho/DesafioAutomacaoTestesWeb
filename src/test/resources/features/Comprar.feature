#language: pt
# encoding: UTF-8

@comprar
Funcionalidade: Comprar produto
  Cenario: Comprar produto
    Quando informo no campo de busca compra "short"
    E aciono botao pesquisar
    E posiciono mouse no item
    E aciono botao Add to cart
    E aciono botao Proceed to checkout
    E aciono botao ProcessAddress
    E clico no campo aceitar termo
    E aciono botao Process carrier
    E aciono botao Pay card
    E aciono botao Confirm order
    Então e exibida mensagem de order complete