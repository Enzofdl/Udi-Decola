package Pessoa;

public class Endereco {
    private String pais, estado, cidade, rua, end_interno;
    private int num_rua, num_interno;

    Endereco(String pais, String estado, String cidade, String rua, int num_rua)
    {
        this.pais = pais;
        this.estado = estado;
        this.cidade = cidade;
        this.rua = rua;
        this.num_rua = num_rua;
        end_interno = "";
        num_interno = 0;
    }
    Endereco(String pais, String estado, String cidade, String rua, int num_rua, String end_interno, int num_interno)
    {
        this(pais, estado, cidade, rua, num_rua);
        this.end_interno = end_interno;
        this.num_interno = num_interno;
    }

    public void mostra_endereco()
    {
        System.out.println("País: " + pais + " Estado: " + estado + " Cidade: " + cidade);
        System.out.printf("Rua: %s Numero: %d", rua, num_rua);
        if(end_interno.isEmpty()) System.out.println(" Endereco_interno: " + end_interno);
        if(num_interno != 0) System.out.printf(" Numero interno: %d", num_interno);
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getEnd_interno() {
        return end_interno;
    }

    public void setEnd_interno(String end_interno) {
        this.end_interno = end_interno;
    }

    public int getNum_rua() {
        return num_rua;
    }

    public void setNum_rua(int num_rua) {
        this.num_rua = num_rua;
    }

    public int getNum_interno() {
        return num_interno;
    }

    public void setNum_interno(int num_interno) {
        this.num_interno = num_interno;
    }
}
