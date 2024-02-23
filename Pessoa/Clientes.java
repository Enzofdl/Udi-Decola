package Pessoa;

public class Clientes extends Pessoa {
    private String data_cadastro, email;

    public Clientes(String nome, String CPF, Data_nv data_nasc, Endereco end, String data_cadastro, String email)
    {
        super(nome, CPF, end,data_nasc);
        this.data_cadastro = data_cadastro;
        this.email = email;
    }




}
