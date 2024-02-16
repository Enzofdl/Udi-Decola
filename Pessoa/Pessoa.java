package Pessoa;
import  Utilitarios.Utilitario;

public class Pessoa {
    private String nome;
    private String CPF;

    private Datanasc nascimento;

    private Endereco end;

    public Pessoa()
    {

    }
    public Pessoa(String nome, String CPF, int dia, int mes, int ano){
        this.nome = nome;
        if(Utilitario.validacpf(CPF)) this.CPF = CPF;
        else this.CPF = "";
        Datanasc nascimento = new Datanasc(dia, mes, ano);
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

    public Datanasc getNascimento() {
        return nascimento;
    }

    public void setNascimento(Datanasc nascimento) {
        this.nascimento = nascimento;
    }

    public Endereco getEnd() {
        return end;
    }

    public void setEnd(Endereco end) {
        this.end = end;
    }
}
