package br.com.alura.loja.pedido;

import java.math.BigDecimal;

public class GeraPedido {
    
    private String cliente;
    private BigDecimal valorOrcamento;
    private int quantidadeItens;

    public GeraPedido(String cliente, BigDecimal valorOrcamento, int quantidadeItens) {
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.quantidadeItens = quantidadeItens;
    }

    public String getCliente() {
        return this.cliente;
    }

    public BigDecimal getValorOrcamento() {
        return this.valorOrcamento;
    }

    public int getQuantidadeItens() {
        return this.quantidadeItens;
    }
    
}
