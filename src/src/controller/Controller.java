package controller;

import model.Ator;
import model.Diretor;
import model.Filme;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    public List<Filme> listFilmes = new ArrayList<>();
    public List<Ator> listAtores = new ArrayList<>();
    public List<Diretor> listDiretores = new ArrayList<>();

    public void cadastrarFilme(Filme filme){
        listFilmes.add(filme);
    }

    public void cadastrarAtor(Ator ator){
        listAtores.add(ator);
    }

    public void cadastrarDiretor(Diretor diretor){
        listDiretores.add(diretor);
    }

    public void buscarFilme(String nomeFilme){
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
        System.out.println("Filme não encontrado");
    }
}
