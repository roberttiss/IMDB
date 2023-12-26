package model;

import java.util.ArrayList;
import java.util.List;

public class Ator extends Pessoa{

    private List<Filme> filmes;
    private int quantidadeOscars;

    public Ator(String nome, int idade, String nacionalidade, int quantidadeOscars) {
        super(nome, idade, nacionalidade);
        this.quantidadeOscars = quantidadeOscars;
    }

    public void adicionarFilme(Filme filme) {
        if (filmes == null) {
            filmes = new ArrayList<>();
        }
        filmes.add(filme);
    }

    public int getQuantidadeOscars() {
        return quantidadeOscars;
    }

    public List<Filme> getFilmes() {
        return filmes;
    }
}
