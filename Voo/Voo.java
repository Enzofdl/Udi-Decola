package Voo;

import java.util.ArrayList;

public class Voo {
    private float preco;
    private final Trecho trecho;
    private int qnt;
    private String saida;
    private String chegada;
    private String horarioplanejado;
    private String horarioconsumado;
    private boolean ativo;
    private boolean confirmado;


    public Voo(Trecho trecho, String saida, String chegada, String horarioplanejado){
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
    public void ConfirmaVoo(String horario){
        ativo = false;
        horarioconsumado = horario;
        confirmado =  true;
    }
    public void AlterarVoo(String datasaida, String datachegada, String horarioplanejado){
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

    public String getSaida() {
        return saida;
    }

    public String getChegada() {
        return chegada;
    }

    public String getHorarioplanejado() {
        return horarioplanejado;
    }

    public String getHorarioconsumado() {
        return horarioconsumado;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public boolean isConfirmado() {
        return confirmado;
    }
}
