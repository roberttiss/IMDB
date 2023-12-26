# Sistema IMDB

## Descrição

Este é um sistema simples para gerenciar informações de filmes, atores e diretores, inspirado no banco de dados de filmes da Internet (IMDB).

## Estrutura do Código

O método principal da aplicação está localizado no método do menu. Este método exibe o menu para o usuário e lida com a entrada do usuário. Dependendo da escolha do usuário, ele chama o método apropriado para realizar a operação desejada.

Os métodos lerFilme, lerAtor, lerDiretor e lerBuscaFilme são responsáveis por ler a entrada do usuário para as respectivas operações.

O objeto controller é responsável por realizar as operações reais, como registrar um filme, registrar um ator, registrar um diretor e procurar um filme.

## Funcionalidades

O sistema oferece as seguintes opções:

1. **Cadastrar Filme**: Permite ao usuário cadastrar um novo filme no sistema.
2. **Cadastrar Ator**: Permite ao usuário cadastrar um novo ator no sistema.
3. **Cadastrar Diretor**: Permite ao usuário cadastrar um novo diretor no sistema.
4. **Buscar por filme**: Permite ao usuário buscar um filme específico no sistema.
5. **Sair**: Encerra o programa.

## Como usar

Para usar o sistema, execute o método `menu()`. Em seguida, digite o número correspondente à opção desejada.

## Dependências

O sistema depende da biblioteca `java.util.Scanner` para entrada de dados.

## Contribuições

Contribuições são bem-vindas. Por favor, abra uma issue ou pull request para sugestões de melhorias.
