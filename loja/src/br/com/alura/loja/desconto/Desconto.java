package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public abstract class Desconto {
    
    protected Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    public BigDecimal calcular(Orcamento orcamento){
        if(deveAplicar(orcamento)){
            return efetuarCalculo(orcamento);
        }else{
            return proximo.calcular(orcamento);
        }
    }

    protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);
    protected abstract Boolean deveAplicar(Orcamento orcamento);

}
