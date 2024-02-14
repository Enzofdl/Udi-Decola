package Empresa;

public class Super_Empresa {
    private final String cnpj;
    private final String nome;
    private String nomefantasia;
    private float faturamento;
    private float taxa;
    private final String datacriacao;

    public Super_Empresa(String cnpj, String nome, String nomefantasia, String datacriacao){
        this.cnpj = cnpj;
        this.nome = nome;
        this.nomefantasia = nomefantasia;
        this.datacriacao = datacriacao;
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



}
