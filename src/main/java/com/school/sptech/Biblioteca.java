package com.school.sptech;

public class Biblioteca {
    private String nome;
    private Double multaDiaria;
    private Integer qtdLivros;
    private Boolean ativa;

    public Biblioteca(String nome, Double multaDiaria){
        this.nome = nome;
        this.multaDiaria = multaDiaria;
        qtdLivros = 0;
        ativa = true;
    }
    public void registrarLivro(Integer quantidade){
        if (quantidade != null && quantidade > 0 && this.ativa == true){
            this.qtdLivros += quantidade;
        }
    }
    public Integer emprestar(Integer quantidade){
        if (quantidade != null && quantidade > 0 && quantidade < this.qtdLivros && this.ativa == true){
            this.qtdLivros -= quantidade;
            return quantidade;
        }
        return null;
    }

    public Integer devolver(Integer quantidade){
        if (quantidade != null && quantidade > 0 && this.ativa == true){
            this.qtdLivros += quantidade;
            return quantidade;
        }
        return null;
    }

    public Integer desativar(){
        if (this.ativa == false){
            return null;
        }
        int temp = this.qtdLivros;
        this.qtdLivros = 0;
        this.ativa = false;
        return temp;
    }

    public void transferir(Biblioteca destino, Integer quantidade){
        if (this.ativa == true && destino.ativa == true && this.qtdLivros > quantidade){
            destino.qtdLivros += quantidade;
            this.qtdLivros -= quantidade;
        }
    }

    public Boolean reajustarMulta(Double percentual){
        if (percentual != null && percentual > 0){
            this.multaDiaria += (this.multaDiaria * percentual);
            return true;
        }
        return false;
    }

    public String getNome() {
        return nome;
    }

    public Double getMultaDiaria() {
        return multaDiaria;
    }

    public Integer getQtdLivros() {
        return qtdLivros;
    }

    public Boolean getAtiva() {
        return ativa;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
