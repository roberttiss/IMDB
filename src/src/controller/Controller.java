package controller;

import model.Ator;
import model.Diretor;
import model.Filme;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {

    public List<Filme> listFilmes = new ArrayList<>();
    public List<Ator> listAtores = new ArrayList<>();
    public List<Diretor> listDiretores = new ArrayList<>();
    public void menu(){
        Scanner input;
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
                    cadastrarFilme();
                    break;
                case 2:
                    cadastrarAtor();
                    break;
                case 3:
                    cadastrarDiretor();
                    break;
                case 4:
                    buscarFilme();
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

    private void cadastrarFilme(){
        Scanner input;
        input = new Scanner(System.in);
        System.out.print("Digite o nome do filme: ");
        String nome = input.nextLine();
        System.out.print("Digite a descrição do filme: ");
        String descricao = input.nextLine();
        System.out.print("Digite o orçamento do filme: ");
        double orcamento = input.nextDouble();
        System.out.print("Digite o ano de lançamento do filme: ");
        int anoLancamento = input.nextInt();
        Diretor diretor = cadastrarDiretor();
        Filme filme = new Filme(nome, descricao, orcamento, anoLancamento, diretor, new ArrayList<>());
        listFilmes.add(filme);
        diretor.adicionarFilme(filme);
        System.out.print("Digite a quantidade de atores do filme: ");
        int quantidadeAtores = input.nextInt();
        input.nextLine();
        List<Ator> elenco = new ArrayList<>();
        for (int i = 0; i < quantidadeAtores; i++) {
            Ator ator = cadastrarAtor();
            ator.adicionarFilme(filme);
            filme.getElenco().add(ator);
        }
    }

    private Ator cadastrarAtor(){
        Scanner input;
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
        listAtores.add(ator);
        return ator;
    }

    private Diretor cadastrarDiretor(){
        Scanner input;
        input = new Scanner(System.in);
        System.out.print("Digite o nome do diretor do filme: ");
        String nomeDiretor = input.nextLine();
        System.out.print("Digite a idade do diretor do filme: ");
        int idadeDiretor = input.nextInt();
        input.nextLine();
        System.out.print("Digite a nacionalidade do diretor do filme: ");
        String nacionalidadeDiretor = input.nextLine();
        Diretor diretor = new Diretor(nomeDiretor, idadeDiretor, nacionalidadeDiretor);
        listDiretores.add(diretor);
        return diretor;
    }

    private void buscarFilme(){
        System.out.print("Digite o nome do filme: ");
        Scanner input;
        input = new Scanner(System.in);
        String nomeFilme = input.nextLine();
        for (Filme busca : listFilmes) {
            if (busca.getNome().equalsIgnoreCase(nomeFilme)) {
                System.out.println("Filme: " + busca.getNome());
                System.out.println("Descrição: " + busca.getDescricao());
                System.out.println("Ano de lançamento: " + busca.getAnoLancamento());
                System.out.println("Orçamento: " + busca.getOrcamento());
                System.out.println("Diretor: " + busca.getDiretor().getNome());
                System.out.println("Idade: " + busca.getDiretor().getIdade());
                System.out.println("Nacionalidade: " + busca.getDiretor().getNacionalidade());
                for (Ator ator : busca.getElenco()) {
                    System.out.println("Ator: " + ator.getNome());
                    System.out.println("Idade: " + ator.getIdade());
                    System.out.println("Nacionalidade: " + ator.getNacionalidade());
                }
            }
        }
    }
}
