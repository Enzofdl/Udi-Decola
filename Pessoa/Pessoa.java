package Pessoa;
import Utilitarios.Utilitario;

public abstract class Pessoa {
    private String nome, CPF;
    //private Endereco endereco;
    private String end;
    private Data_nv data_nascimento;


    public Pessoa()
    {

    }
    public Pessoa(String nome, String CPF)
    {
        if(Utilitario.validacpf(CPF)) this.CPF = CPF;
        else this.CPF = "";
        this.nome = nome;
    }

    public Pessoa(String nome, String CPF, String end, Data_nv data_nascimento)
    {
        this(nome, CPF);
        this.end = end;
        this.data_nascimento = data_nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        if(Utilitario.validacpf(CPF)) this.CPF = CPF;
        else this.CPF = "";
    }

    public String getEndereco() {
        return end;
    }

    public void setEndereco(String endereco) {
        this.end = endereco;
    }

    public Data_nv getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Data_nv data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
}
