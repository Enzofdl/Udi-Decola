package Pessoa;
import Utilitarios.Utilitario;

import java.util.ArrayList;

public class Clientes extends Pessoa {
    private String data_cadastro, email;
    private boolean VIP;
    private int numero_compras;
    private double valor_gasto;
    private ArrayList <Voo> voos_futuros;
    private ArrayList <Diarias> diarias_futuras;
    private ArrayList <Compras> historico_compras;


    public Clientes(){
    }
    public Clientes(String nome, String CPF, Data_nv data_nasc, Endereco end, String data_cadastro, String email, boolean VIP, int numero_compras, double valor_gasto)
    {
        super(nome, CPF, end,data_nasc);
        this.data_cadastro = data_cadastro;
        if(Utilitario.validaemail(email))
        {
            this.email = email;
        }
        else
        {
            this.email = "";
        }
        this.data_cadastro = data_cadastro;
        this.VIP = VIP;
        this.numero_compras = numero_compras;
        this.valor_gasto = valor_gasto;
        voos_futuros = new ArrayList<Voo>();
        diarias_futuras = new ArrayList<Diarias>();
        historico_compras = new ArrayList<Compras>();
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

    public int getNumero_compras() {
        return numero_compras;
    }

    public void setNumero_compras(int numero_compras) {
        this.numero_compras = numero_compras;
    }

    public double getValor_gasto() {
        return valor_gasto;
    }

    public void setValor_gasto(double valor_gasto) {
        this.valor_gasto = valor_gasto;
    }
}
