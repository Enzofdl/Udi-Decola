package Trecho;

import java.util.ArrayList;

import Voo.Voo;

import Aeroporto.*;

import Utilitarios.Utilitario;

public class Trechos {
    private final String nome;
    private final Aeroporto origem;
    private final Aeroporto destino;
    private final String CodigoIdentificador;
    private ArrayList<Voo> futurosvoos;
    private ArrayList<Voo> historicovoo;

    private boolean ativo;

    private Trechos(Aeroporto origem, Aeroporto destino, String nome, String CodigoIdentificador){
        this.origem = origem;
        this.destino = destino;
        this.nome = nome;
        ativo = true;
        futurosvoos = new ArrayList<Voo>();
        historicovoo = new ArrayList<Voo>();
        if(origem == destino) ativo = false;
        if(Utilitario.validaIdentif(CodigoIdentificador)) this.CodigoIdentificador = CodigoIdentificador;
        else this.CodigoIdentificador = "00000";
    }

    public static boolean criartrecho(Aeroporto origem, Aeroporto destino, String nome, String CodigoIdentificador, String Identificador, Trechos a){
        if(origem != destino) {
            a = new Trechos(origem, destino, nome, CodigoIdentificador);
            return true;
        }
        return false;
    }

    public void encerrartrecho(){
        ativo = false;
    }

    public boolean novovoo(Voo a){
        futurosvoos.add(a);
        return true;
    }
    public boolean efetuarvoo(Voo a){
        if(!futurosvoos.contains(a)) return false;
        futurosvoos.remove(a);
        historicovoo.add(a);
        return true;
    }





    public String getNome() {
        return nome;
    }

    public Aeroporto getOrigem() {
        return origem;
    }

    public Aeroporto getDestino() {
        return destino;
    }

    public ArrayList<Voo> getFuturosvoos() {
        return futurosvoos;
    }

    public ArrayList<Voo> getHistoricovoo() {
        return historicovoo;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public String getCodigoIdentificador()
    {
        return CodigoIdentificador;
    }



}
