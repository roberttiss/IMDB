package model;

public class Filme {
    private String nome;
    private String descricao;
    private double orcamento;
    private int anoLancamento;
    private Diretor diretor;
    private Ator[] elenco;

    public Filme(String nome, String descricao, double orcamento, int anoLancamento, Diretor diretor, Ator[] elenco) {
        this.nome = nome;
        this.descricao = descricao;
        this.orcamento = orcamento;
        this.anoLancamento = anoLancamento;
        this.diretor = diretor;
        this.elenco = elenco;
    }


}
