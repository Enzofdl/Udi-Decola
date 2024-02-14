package Empresa;

class Quartos extends Hoteis {

    public int disponiveis;
    public boolean cancelamento;
    public boolean desconto;
    public int capacidade;
    public float preco;


    public Quartos (int disponiveisAux, boolean cancelamentoAux, boolean descontoAux, int capacidadeAux, float precoAux, String nome, String cnpj, String nomefantasia, String endereco, String anodecriacao, String horariocIn, String horariocOut, String tipoQuarto, float estrelasAux, boolean aceitaPetsAux, int nroQuartosAux) {
        super(nome, cnpj, nomefantasia, endereco, anodecriacao, horariocIn, horariocOut, tipoQuarto, estrelasAux, aceitaPetsAux, nroQuartosAux);
        disponiveis = disponiveisAux;
        cancelamento = cancelamentoAux;
        desconto = descontoAux;
        capacidade = capacidadeAux;
        preco = precoAux;
    }
    public Quartos(){}
}
