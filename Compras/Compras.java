import Voo.Voo;
import java.util.Calendar;
import java.util.Date;
public class Compras
{
    private Voo voo;
    private double valor_pago;
    private int quantidade_diarias, quantidade_voos, valor_hotel, valor_aplicativo;
    private String metodo_pagamento;
    private boolean VIP;
    private Date horario_compra;
    private int valor_companhia;

    public Compras() {
    }

    public Compras(Voo voo, double valor_pago, int quantidade_diarias, int quantidade_voos, int valor_hotel, int valor_aplicativo, String metodo_pagamento, boolean VIP, Date horario_compra, int valor_companhia)
    {
        this.voo = voo;
        this.quantidade_diarias = quantidade_diarias;
        this.quantidade_voos = quantidade_voos;
        this.valor_hotel = valor_hotel;
        this.valor_aplicativo = valor_aplicativo;
        this.metodo_pagamento = metodo_pagamento;
        this.VIP = VIP;
        this.horario_compra = horario_compra;
        this.valor_companhia = valor_companhia;
    }

    public Compras(Voo voo, double valor_pago, int quantidade_diarias, int quantidade_voos, int valor_hotel, int valor_aplicativo, String metodo_pagamento, boolean VIP, Date horario_compra)
    {
        this.voo = voo;
        this.quantidade_diarias = quantidade_diarias;
        this.quantidade_voos = quantidade_voos;
        this.valor_hotel = valor_hotel;
        this.valor_aplicativo = valor_aplicativo;
        this.metodo_pagamento = metodo_pagamento;
        this.VIP = VIP;
        this.horario_compra = horario_compra;
    }

    public double getValor_pago() {
        return valor_pago;
    }

    public void setValor_pago(double valor_pago) {
        this.valor_pago = valor_pago;
    }

    public int getQuantidade_diarias() {
        return quantidade_diarias;
    }

    public void setQuantidade_diarias(int quantidade_diarias) {
        this.quantidade_diarias = quantidade_diarias;
    }

    public int getQuantidade_voos() {
        return quantidade_voos;
    }

    public void setQuantidade_voos(int quantidade_voos) {
        this.quantidade_voos = quantidade_voos;
    }

    public int getValor_hotel() {
        return valor_hotel;
    }

    public void setValor_hotel(int valor_hotel) {
        this.valor_hotel = valor_hotel;
    }

    public int getValor_aplicativo() {
        return valor_aplicativo;
    }

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
}
