package Pessoa;

public class Funcionarios extends Pessoa{
    private String numero_carteira;
    private double salario;

    public Funcionarios()
    {

    }
    public Funcionarios(String nome, String CPF, Data_nv data_nasc, Endereco end, String numero_carteira, double salario)
    {
        super(nome, CPF, end,data_nasc);
        this.numero_carteira = numero_carteira;
        if(salario < 1412) this.salario = 1412;
        else this.salario = salario;
    }

    public String getNumero_carteira() {
        return numero_carteira;
    }

    public void setNumero_carteira(String numero_carteira) {
        this.numero_carteira = numero_carteira;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if(salario < 1412) this.salario = 1412;
        else this.salario = salario;
    }
}
