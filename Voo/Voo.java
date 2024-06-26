package Voo;

import Pessoa.Data_nv;

import java.io.Serializable;
import java.util.ArrayList;

import java.util.Calendar;

import Trecho.Trechos;

import java.util.Date;

public class Voo implements Serializable {
    private float preco;
    private final Trechos trecho;
    private Data_nv saida;
    private Data_nv chegada;
    private Data_nv horarioplanejado;
    private Data_nv horarioconsumado;
    private boolean ativo;
    private boolean confirmado;


    public Voo(Trechos trecho, Data_nv saida, Data_nv chegada, Data_nv horarioplanejado){
        this.trecho = trecho;
        this.saida = saida;
        this.chegada = chegada;
        this.horarioplanejado = horarioplanejado;
        ativo = true;
        confirmado = false;
    }
    public Voo(Trechos trecho, Data_nv saida, double preco, boolean ativo){
        this.trecho = trecho;
        this.saida = saida;
        this.ativo = ativo;
        confirmado = false;
    }
    public boolean alterapreco(float preco){
        if (preco>0) this.preco = preco;
        else return false;
        return true;
    }
    
    public void cancelarvoo(){ativo = false;}
    
    public void ConfirmaVoo(Data_nv horario){
        ativo = false;
        horarioconsumado = horario;
        confirmado =  true;
    }
    
    public void AlterarVoo(Data_nv datasaida, Data_nv datachegada, Data_nv horarioplanejado){
        saida = datasaida;
        chegada = datachegada;
        this.horarioplanejado = horarioplanejado;
    }

    public float getPreco() {
        return preco;
    }

    public Trechos getTrecho() {
        return trecho;
    }

    public Data_nv getSaida() {
        return saida;
    }

    public Data_nv getChegada() {
        return chegada;
    }

    public Data_nv getHorarioplanejado() {
        return horarioplanejado;
    }

    public Data_nv getHorarioconsumado() {
        return horarioconsumado;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public boolean isConfirmado() {
        return confirmado;
    }
}
