package Pessoa;

public class Datanasc {
    private int dia, mes, ano;

    public Datanasc(int dia, int mes, int ano)
    {
        if(!(salva_data(dia, mes, ano))) salva_data(1,1,1);
    }

    public boolean salva_data(int dia, int mes, int ano)
    {
        if((dia <0) || (mes < 0) || (ano < 0)) return false;
        if((dia > 31) || (mes > 12) || (ano > 2024)) return false;

        if(((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11)) && dia == 31) return false;
        if(mes == 2)
        {
            if(((((ano % 4) == 0) && ((ano % 10) != 0)) || ((ano % 400) == 0)))
            {
                if(dia > 29) return false;
            }
            else if(dia > 28) return false;

        }

        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        return true;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }


    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getAno() {
        return ano;
    }
}
