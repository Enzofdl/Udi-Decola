package Diarias;
import Pessoa.Data_nv;

import Empresa.Quartos;

public class Diarias
{
    private Data_nv dia;
    private Quartos quartos;

    public Diarias(Data_nv dia, Quartos quartos)
    {
        this.dia = dia;
        this.quartos = quartos;
    }

    public Data_nv getDia() {
        return dia;
    }

    public Quartos getQuartos() {
        return quartos;
    }

    public void setDia(Data_nv dia) {
        this.dia = dia;
    }

    public void setQuartos(Quartos quartos) {
        this.quartos = quartos;
    }
}
