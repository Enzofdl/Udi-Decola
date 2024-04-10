package Pessoa;
import Utilitarios.Utilitario;
import Voo.Voo;
import Compras.Compras;

import java.util.ArrayList;

public class Clientes extends Pessoa {
    private String email;
    private Data_nv data_cadastro;
    private boolean VIP;
    private int numero_compras;
    private static int numero_compras_ativa_Vip;
    private double valor_gasto;
    private ArrayList <Voo> voos_futuros;
    private ArrayList <Compras> historico_compras;


    public Clientes()
    {

    }
    public Clientes(String nome, String CPF)
    {
        super(nome, CPF);
    }
    public Clientes(String nome, String CPF, Data_nv data_nasc, String end, Data_nv data_cadastro, String email)
    {
        super(nome, CPF, end,data_nasc);
        this.data_cadastro = data_cadastro;
        this.email = email;
        this.data_cadastro = data_cadastro;
        this.VIP = false;
        this.numero_compras = 0;
        this.valor_gasto = 0;
        voos_futuros = new ArrayList<Voo>();
        historico_compras = new ArrayList<Compras>();
    }
    public Clientes(String nome, String CPF, Data_nv data_nasc, String end, String email)
    {
        super(nome, CPF, end,data_nasc);
        this.email = email;
        this.VIP = false;
        this.numero_compras = 0;
        this.valor_gasto = 0;
        voos_futuros = new ArrayList<Voo>();
        historico_compras = new ArrayList<Compras>();
    }

    public String getEmail() {
        return email;
    }

    public boolean isVIP() {
        return VIP;
    }

    public Data_nv getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(Data_nv data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    public void setEmail(String email) {
            this.email = email;
    }

    public void setVIP(boolean VIP) {
        this.VIP = VIP;
    }

    public int getNumero_compras() {
        return numero_compras;
    }

    public void compraFeita(Compras a)
    {
        historico_compras.add(a);
        valor_gasto += a.getValor_pago();
        numero_compras++;

        if(historico_compras.size() == numero_compras_ativa_Vip)
        {
            VIP = true;
        }
    }

    public double getValor_gasto() {
        return valor_gasto;
    }

    public void setValor_gasto(double valor_gasto) {
        this.valor_gasto = valor_gasto;
    }
}
