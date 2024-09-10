package com.escolasenai.poo.parte1;

public enum Situacao {

    APROVADO("Aprovado!"),
    REPROVADO("Reprovado!"),
    EM_RECUPERACAO("Em Recuperação");

    private final String situacao;

    Situacao(String situacao) {
        this.situacao = situacao;
    }

    public String getSistuacao() {
        return situacao;
    }
}
