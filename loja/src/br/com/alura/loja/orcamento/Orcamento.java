package br.com.alura.loja.orcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.alura.loja.orcamento.situacao.EmAnalise;
import br.com.alura.loja.orcamento.situacao.SituacaoOrcamento;
import br.com.alura.loja.orcamento.situacao.Finalizado;

public class Orcamento {
    
    private BigDecimal valor;
    private SituacaoOrcamento situacao;
    private List<ItemOrcamento> itens = new ArrayList<>();

    public Orcamento(BigDecimal valor) {
        this.valor = BigDecimal.ZERO;
        this.itens = new ArrayList<>();
        this.situacao = new EmAnalise();
    }

    public void aplicarDescontoExtra(){
        BigDecimal valorDoDescontoExtra = this.situacao.calcularValorDescontoExtra(this);

        this.valor = this.valor.subtract(valorDoDescontoExtra);
    }

    public void aprovar(){
        this.situacao.aprovar(this);
    }

    public void reprovar(){
        this.situacao.reprovar(this);
    }

    public void finalizar(){
        this.situacao.finalizar(this);
    }

    public BigDecimal getValor() {
        return this.valor;
    }

    public int getQuantidadeItens() {
        return this.itens.size();
    }

    public SituacaoOrcamento getSituacao(){
        return this.situacao;
    }

    public void setSituacao(SituacaoOrcamento situacao){
        this.situacao = situacao;
    }

    public boolean isFInalizado(){
        return situacao instanceof Finalizado;
    }

    public void adicionarItem(ItemOrcamento item){
        this.valor.add(item.getValor());
        this.itens.add(item);
    }

}
