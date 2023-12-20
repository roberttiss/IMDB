package model;

public class Diretor extends Pessoa{

        Filme[] filmes;

        public Diretor(String nome, int idade, String nacionalidade, Filme[] filmes) {
            super(nome, idade, nacionalidade);
            this.filmes = filmes;
        }
}
