package Compras;
import UdiDecola.UdiDecola;
import Voo.Voo;
import Pessoa.Clientes;
import java.util.Date;
import Diarias.Diarias;

import java.util.ArrayList;

public class Compras
{
    private ArrayList <Voo> voo;
    private ArrayList <Diarias> diarias;
    private double valor_pago;
    private int valor_hotel, valor_aplicativo;
    private String metodo_pagamento;
    private boolean VIP;
    private Date horario_compra;
    private int valor_companhia;
    

    private Clientes a;

    public Compras() {
    }


    public Compras(ArrayList<Voo> voo, ArrayList<Diarias> diarias, Date horario, Clientes a, double valor_pago, int valor_hotel, int valor_aplicativo, String metodo_pagamento, boolean VIP, int valor_companhia)
    {
        horario_compra = horario;
        this.voo = voo;
        this.diarias = diarias;
        this.valor_hotel = valor_hotel;
        this.valor_aplicativo = valor_aplicativo;
        this.metodo_pagamento = metodo_pagamento;
        this.VIP = VIP;
        this.valor_companhia = valor_companhia;
        this.a = a;
        double aux = UdiDecola.getFaturamento();
        UdiDecola.setTaxa(aux);
    }


    public double getValor_pago() {
        return valor_pago;
    }

    public void setValor_pago(double valor_pago) {
        this.valor_pago = valor_pago;
    }

    public int getValor_hotel() {
        return valor_hotel;
    }

    public void setValor_hotel(int valor_hotel) {
        this.valor_hotel = valor_hotel;
    }

    public int getValor_aplicativo() {return valor_aplicativo;}

    public void setValor_aplicativo(int valor_aplicativo) {
        this.valor_aplicativo = valor_aplicativo;
    }

    public String getMetodo_pagamento() {
        return metodo_pagamento;
    }

    public void setMetodo_pagamento(String metodo_pagamento) {
        this.metodo_pagamento = metodo_pagamento;
    }

    public boolean isVIP() {
        return VIP;
    }

    public void setVIP(boolean VIP) {
        this.VIP = VIP;
    }

    public Date getHorario_compra() {
        return horario_compra;
    }

    public void setHorario_compra(Date horario_compra) {
        this.horario_compra = horario_compra;
    }

    public ArrayList<Voo> getVoo() {
        return voo;
    }

    public ArrayList<Diarias> getDiarias() {
        return diarias;
    }

    public int getValor_companhia() {
        return valor_companhia;
    }

    public Clientes getA() {
        return a;
    }
}

