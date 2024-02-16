package Pessoa;
import  Utilitarios.Utilitario;

public class Pessoa {
    private String nome;
    private String CPF;

    private Data_Nascimento nascimento;

    private Endereco end;

    public Pessoa()
    {

    }
    public Pessoa(String nome, String CPF, int dia, int mes, int ano){
        this.nome = nome;
        if(Utilitario.validacpf(CPF)) this.CPF = CPF;
        else this.CPF = "";
        Data_Nascimento nascimento = new Data_Nascimento(dia, mes, ano);
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

    public Data_Nascimento getNascimento() {
        return nascimento;
    }

    public void setNascimento(Data_Nascimento nascimento) {
        this.nascimento = nascimento;
    }

    public Endereco getEnd() {
        return end;
    }

    public void setEnd(Endereco end) {
        this.end = end;
    }
}
