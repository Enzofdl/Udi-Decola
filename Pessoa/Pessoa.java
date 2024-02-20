package Pessoa;
import Utilitarios.Utilitario;
import jdk.jshell.execution.Util;

public class Pessoa {
    private String nome, CPF;
    private Endereco endereco;
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

    public Pessoa(String nome, String CPF, Endereco endereco, Data_nv data_nascimento)
    {
        this(nome, CPF);
        this.endereco = endereco;
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Data_nv getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Data_nv data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
}
