package Voo;

import java.util.ArrayList;

import java.util.Calendar;

import java.util.Date;

public class Voo {
    private float preco;
    private final Trecho trecho;
    private int qnt;
    private Date saida;
    private Date chegada;
    private Date horarioplanejado;
    private Date horarioconsumado;
    private boolean ativo;
    private boolean confirmado;


    public Voo(Trecho trecho, Date saida, Date chegada, Date horarioplanejado){
        this.trecho = trecho;
        this.saida = saida;
        this.chegada = chegada;
        this.horarioplanejado = horarioplanejado;
        ativo = true;
        confirmado = false;
    }

    public void venda(){
        qnt++;
    }
    public float faturamento(){
        return preco*qnt;
    }
    public boolean alterapreco(float preco){
        if (preco>0) this.preco = preco;
        else return false;
        return true;
    }
    
    public void cancelarvoo(){ativo = false;}
    
    public void ConfirmaVoo(Date horario){
        ativo = false;
        horarioconsumado = horario;
        confirmado =  true;
    }
    
    public void AlterarVoo(Date datasaida, DAte datachegada, Date horarioplanejado){
        saida = datasaida;
        chegada = datachegada;
        this.horarioplanejado = horarioplanejado;
    }

    public float getPreco() {
        return preco;
    }

    public Trecho getTrecho() {
        return trecho;
    }

    public int getQnt() {
        return qnt;
    }

    public Date getSaida() {
        return saida;
    }

    public Date getChegada() {
        return chegada;
    }

    public Date getHorarioplanejado() {
        return horarioplanejado;
    }

    public Date getHorarioconsumado() {
        return horarioconsumado;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public boolean isConfirmado() {
        return confirmado;
    }
}
