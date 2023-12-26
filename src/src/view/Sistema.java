package view;

import controller.Controller;
import model.Ator;
import model.Diretor;
import model.Filme;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {

    private Scanner input = new Scanner(System.in);
    Controller controller = new Controller();

    public void menu(){
        input = new Scanner(System.in);
        int opcao;
        do{
            System.out.println("1 - Cadastrar Filme");
            System.out.println("2 - Cadastrar Ator");
            System.out.println("3 - Cadastrar Diretor");
            System.out.println("4 - Buscar por filme");
            System.out.println("5 - Sair");
            System.out.print("Digite a opção desejada: ");
            opcao = input.nextInt();
            switch(opcao){
                case 1:
                    Filme filme = lerFilme();
                    controller.cadastrarFilme(filme);
                    break;
                case 2:
                    Ator ator = lerAtor();
                    controller.cadastrarAtor(ator);
                    break;
                case 3:
                    Diretor diretor = lerDiretor();
                    controller.cadastrarDiretor(diretor);
                    break;
                case 4:
                    String filmeBuscado = lerBuscaFilme();
                    controller.buscarFilme(filmeBuscado);
                    break;
                case 5:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (opcao != 5);
    }

    public Filme lerFilme() {
        input.nextLine();
        System.out.print("Digite o nome do filme: ");
        String nome = input.nextLine();
        System.out.print("Digite a descrição do filme: ");
        String descricao = input.nextLine();
        System.out.print("Digite o orçamento do filme: ");
        double orcamento = input.nextDouble();
        System.out.print("Digite o ano de lançamento do filme: ");
        int anoLancamento = input.nextInt();
        input.nextLine();
        Diretor diretor = lerDiretor();
        Filme filme = new Filme(nome, descricao, orcamento, anoLancamento, diretor, new ArrayList<>());
        diretor.adicionarFilme(filme);
        List<Ator> atores = new ArrayList<>();
        System.out.print("Digite a quantidade de atores do filme: ");
        int quantidadeAtores = input.nextInt();
        input.nextLine();
        for (int i = 0; i < quantidadeAtores; i++) {
            Ator ator = lerAtor();
            ator.adicionarFilme(filme);
            filme.getElenco().add(ator);
        }
        return filme;
    }

    public String lerBuscaFilme(){
        input = new Scanner(System.in);
        System.out.print("Digite o nome do filme: ");
        String nome = input.nextLine();
        controller.buscarFilme(nome);
        return nome;
    }

    public Ator lerAtor(){
        input = new Scanner(System.in);
        System.out.print("Digite o nome do ator do filme: ");
        String nomeAtor = input.nextLine();
        System.out.print("Digite a idade do ator do filme: ");
        int idadeAtor = input.nextInt();
        input.nextLine();
        System.out.print("Digite a nacionalidade do ator do filme: ");
        String nacionalidadeAtor = input.nextLine();
        System.out.print("Digite a quantidade de Oscars do ator do filme: ");
        int quantidadeOscars = input.nextInt();
        Ator ator = new Ator(nomeAtor, idadeAtor, nacionalidadeAtor, quantidadeOscars);
        return ator;
    }

    public Diretor lerDiretor(){
        input = new Scanner(System.in);
        System.out.print("Digite o nome do diretor do filme: ");
        String nomeDiretor = input.nextLine();
        System.out.print("Digite a idade do diretor do filme: ");
        int idadeDiretor = input.nextInt();
        input.nextLine();
        System.out.print("Digite a nacionalidade do diretor do filme: ");
        String nacionalidadeDiretor = input.nextLine();
        Diretor diretor = new Diretor(nomeDiretor, idadeDiretor, nacionalidadeDiretor);
        return diretor;
    }
}
