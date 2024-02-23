package Pessoa;

public class Clientes extends Pessoa {
    private String data_cadastro, email;
    private boolean VIP;
    public Clientes(String nome, String CPF, Data_nv data_nasc, Endereco end, String data_cadastro, String email)
    {
        super(nome, CPF, end,data_nasc);
        this.data_cadastro = data_cadastro;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public boolean isVIP() {
        return VIP;
    }

    public String getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(String data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setVIP(boolean VIP) {
        this.VIP = VIP;
    }
}
