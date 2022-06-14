package br.com.alura.loja.orçamento;

import java.math.BigDecimal;

public class Orçamento {
    
    private BigDecimal valor;

    public Orçamento(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getValor() {
        return this.valor;
    }

}
