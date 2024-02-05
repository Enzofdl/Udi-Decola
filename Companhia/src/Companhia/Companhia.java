package Companhia;

public class Companhia {
    private final String cnpj;
    private final String nome;
    private String nomefantasia;


    private float faturamento;
    private float taxa;
    private final String datacriacao;
    private Trechos[] T;

    private Voo historico[] H;
    private float desconto;


    public Companhia(String cnpj, String nome, String nomefantasia, String datacriacao){
        this.cnpj = cnpj;
        this.nome = nome;
        this.nomefantasia = nomefantasia;
        this.datacriacao = datacriacao;
    }

    public boolean venda(Voo A, int quantidade){ // ADICIONAR VERIFICADOR
        faturamento += quantidade*A.getPreco();
        taxa += quantidade*UdiDecola.Taxa;
        AdicionarHistorico(A);
    }
    // public boolean NovoTrecho()
    // public boolean AlterarTrecho()
    // public boolean ApagarTrecho()
    // public Trecho BuscarTrecho()
    // public void MostrarTrechos()
    // public void AdicionarHistorico()
    // public void MostrarHistorico()
    public float consultafaturamento(){
        return getFaturamento();
    }
    public float consultataxa(){
        return getTaxa();
    }
    public boolean alteradesconto(float desconto){
        if(desconto > 0 && desconto <=1)this.desconto = desconto;
        else return false;
        return true;
    }

    public float consultadesconto(){
        return getDesconto();
    }









    public String getCnpj() {
        return cnpj;
    }

    public String getNome() {
        return nome;
    }

    public String getNomefantasia() {
        return nomefantasia;
    }

    public void setNomefantasia(String nomefantasia) {
        this.nomefantasia = nomefantasia;
    }

    public float getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(float faturamento) {
        this.faturamento = faturamento;
    }

    public float getTaxa() {
        return taxa;
    }

    public void setTaxa(float taxa) {
        this.taxa = taxa;
    }

    public String getDatacriacao() {
        return datacriacao;
    }

    public Trechos[] getT() {
        return T;
    }

    public void setT(Trechos[] t) {
        T = t;
    }

    public Voo[] getHistorico() {
        return historico;
    }

    public void setHistorico(Voo[] historico) {
        this.historico = historico;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

}
