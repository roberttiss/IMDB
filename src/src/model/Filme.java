package model;

import java.util.ArrayList;
import java.util.List;

public class Filme {
    private String nome;
    private String descricao;
    private double orcamento;
    private int anoLancamento;
    private Diretor diretor;
    private List<Ator> elenco;

    public Filme(String nome, String descricao, double orcamento, int anoLancamento, Diretor diretor, List<Ator> elenco) {
        this.nome = nome;
        this.descricao = descricao;
        this.orcamento = orcamento;
        this.anoLancamento = anoLancamento;
        this.diretor = diretor;
        this.elenco = elenco;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getOrcamento() {
        return orcamento;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public Diretor getDiretor() {
        return diretor;
    }


    public List<Ator> getElenco() {
        return elenco;
    }
}
