package Hoteis

public class Hoteis{
private String endereco;
private String anocriacao;
private float avaliacao;
private boolean pets;
private int numeroquartos;
private Quartos[] locacao;
private String descricao;
private String mensagem;
private String cidade;
private int[][] tipoquarto;
private float desconto;

public Hoteis(String cnpj, String nome, String nomefantasia, String endereco, String cidade, 
String anocriacao, float avaliacao, boolean pets, int numeroquartos){


}

//PARTE BERNARDO

package Hoteis;

public class Hoteis {
    private final String nome;
    private final String cnpj;
    private final String nomefantasia;
    private final String endereco;
    private final String anodecriacao;
    private final String horariocIn;
    private final String horariocOut;
    private final String tipoQuarto;

    private float estrelas;
    private boolean aceitaPets;
    private int nroQuartos;

    public void mensagem () {
        System.out.println("Mensagem de divulgacao");
    }

    public void descricao () {
        System.out.println("Insira descricao");
    }


    public Hoteis (String nome, String cnpj, String nomefantasia, String endereco, String anodecriacao, String horariocIn, String horariocOut, String tipoQuarto, float estrelasAux, boolean aceitaPetsAux, int nroQuartosAux) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.nomefantasia = nomefantasia;
        this.endereco = endereco;
        this.anodecriacao = anodecriacao;
        this.horariocIn = horariocIn;
        this.horariocOut = horariocOut;
        this.tipoQuarto = tipoQuarto;
        estrelas = estrelasAux;
        aceitaPets = aceitaPetsAux;
        nroQuartos = nroQuartosAux;
    }

    public String getNome (){
        return nome;
    }

    public String getCnpj () {
        return cnpj;
    }

    public String getNomefantasia () {
        return nomefantasia;
    }

    public String getEndereco () {
        return endereco;
    }
    public String getAnodecriacao () {
        return anodecriacao;
    }

    public String getHorariocIn () {
        return horariocIn;
    }

    public String getHorariocOut () {
        return horariocOut;
    }

    public String getTipoQuarto () {
        return tipoQuarto;
    }

    public void setEstrelas (int valor) {
        estrelas = valor;
    }

    public void AceitaPets () {
        aceitaPets = true;
    }

    public void setNroQuartos (int valor) {
        nroQuartos = valor;
    }

}


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
}






}

