package Pessoa;
import Utilitarios.Utilitario;
public class Clientes extends Pessoa {
    private String data_cadastro, email;
    private boolean VIP;

    public Clientes(){
    }
    public Clientes(String nome, String CPF, Data_nv data_nasc, Endereco end, String data_cadastro, String email, boolean VIP)
    {
        super(nome, CPF, end,data_nasc);
        this.data_cadastro = data_cadastro;
        if(Utilitario.validaemail(email))
        {
            this.email = email
        }
        else
        {
            this.email = "";
        }
        this.data_cadastro = data_cadastro;
        this.VIP = VIP;
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
        if(Utilitario.validaemail(email))
        {
            this.email = email;
        }
        else
        {
            this.email = "";
        }
    }

    public void setVIP(boolean VIP) {
        this.VIP = VIP;
    }






}
