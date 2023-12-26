package model;

import java.util.ArrayList;
import java.util.List;

public class Diretor extends Pessoa{

    private List<Filme> filmes;

        public Diretor(String nome, int idade, String nacionalidade) {
            super(nome, idade, nacionalidade);
        }

        public void adicionarFilme(Filme filme) {
            if (filmes == null) {
                filmes = new ArrayList<>();
            }
            filmes.add(filme);
        }

        public List<Filme> getFilmes() {
            return filmes;
        }
}
