package Pessoa;

public class Endereco {
    private String pais, estado, cidade, bairro, rua, end_interno;
    private int num;

    private Pessoa morador;

    public Endereco(Pessoa morador,String pais, String estado, String cidade, String bairro,String rua, int num)
    {
        this.pais = pais;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.num = num;
        morador.setEnd(this);

    }

    public Endereco(Pessoa morador,String pais, String estado, String cidade, String bairro,String rua, int num, String end_interno)
    {
        this(morador,pais, estado, cidade, bairro, rua, num);
        this.end_interno = end_interno;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getPais() {
        return pais;
    }

    public String getRua() {
        return rua;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setPais(String pais) {
        this.pais = pais;
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
}
