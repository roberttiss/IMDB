package model;

public class Ator extends Pessoa{

    private int quantidadeOscars;
    Filme[] filmes;

    public Ator(String nome, int idade, String nacionalidade, int quantidadeOscars) {
        super(nome, idade, nacionalidade);
        this.quantidadeOscars = quantidadeOscars;
    }

    public int getQuantidadeOscars() {
        return quantidadeOscars;
    }

    public void setQuantidadeOscars(int quantidadeOscars) {
        this.quantidadeOscars = quantidadeOscars;
    }

}
