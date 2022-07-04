#language: pt
# encoding: UTF-8

@login
Funcionalidade: Login
  Cenario: usuario invalido
    Quando  eu informar o usuario invalido "Ad@email.com"
    E informar a senha invalida "asd"
    E clicar no botao login invalido
    Entao o sistema exibe a mensagem usuario invalido

  Cenario: Realizar login
    Quando  eu informar o usuario "email2222@email.com"
    E informar a senha "12345678"
    E clicar no botao login
    Entao o sistema exibe o usuario logado