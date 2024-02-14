package Trecho;

public class Trechos {
    private final String nome;
    private final Aeroporto origem;
    private final Aeroporto destino;
    private Voo[] futurosvoos;
    private Voo[] historicovoo;

    private boolean ativo;

    private Trechos(Aeroporto origem, Aeroporto destino, String nome){
        this.origem = origem;
        this.destino = destino;
        this.nome = nome;
        ativo = true;
    }
    public boolean criartrecho(Aeroporto origem, Aeroporto destino, String nome){
        if(origem != destino) {Trechos(origem, destino, nome); return true;}
        return false;
    }
    public void encerrartrecho(){
        ativo = false;
    }


}
