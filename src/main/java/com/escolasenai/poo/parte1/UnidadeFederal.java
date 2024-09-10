package com.escolasenai.poo.parte1;

public enum UnidadeFederal {
    
    RJ("Rio de Janeiro"),
    SP("São Paulo"),
    MG("Minas Gerais"),
    ES("Espírito Santo");


    private final String nomePorExtenso;

    UnidadeFederal(String nomePorExtenso){
        this.nomePorExtenso = nomePorExtenso;
    }

    public String getNomePorExtenso() {
        return nomePorExtenso;
    }
}
