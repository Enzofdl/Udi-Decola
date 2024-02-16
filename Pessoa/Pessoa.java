package Pessoa;
import  Utilitarios.Utilitario;

public class Pessoa {
    private String nome;
    private String CPF;

    public Pessoa()
    {

    }
    public Pessoa(String nome, String CPF){
        this.nome = nome;
        if(Utilitario.validacpf(CPF)) this.CPF = CPF;
        else this.CPF = "";
    }
    public String getCPF() {
        return CPF;
    }

    public boolean setCPF(String CPF) {
        return Utilitario.validacpf(CPF);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
