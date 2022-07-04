#language: pt
# encoding: UTF-8

@buscar
Funcionalidade: Buscar produto
  Cenario: BuscarProduto
    Quando  informo no campo de busca "short"
    E aciono botao pesquisar
    Entao o sistema exibe os resultados