#language: pt
# encoding: UTF-8

@cadastrarUsuario
Funcionalidade: Cadastrar usuario

  @cadastro
  Cenario: cadastrar usuario
    Quando  informar no campo Email address create acount "email2222@email.com"
    E aciono botao Create an account
    E informar no campo lastname "Pedro"
    E informar no campo firstname "Joao"
    E informar no campo password "12345678"
    E informar no campo dia de nascimento
    E informar no campo mes de nascimento "January"
    E informar no campo ano de nascimento
    E informar no campo address1 "rua washignton"
    E informar no campo city "Alabama"
    E informar no campo zip "12345"
    E informar no campo country "United States"
    E informar no campo state
    E informar no campo mobile phone "123456789"
    E acionar o botao salvar
    Entao o sistema cadastra o usuario "Pedro"

    @cadastroInvalido
    Cenario: cadastro invalido
      Quando informo no campo Email address "asd"
      E aciono botao Create an account invalido
      Entao o sistema exibe mensagem de erro