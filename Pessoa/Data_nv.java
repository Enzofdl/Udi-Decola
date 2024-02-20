package Pessoa;

public class Data_nv {
    private int dia, mes, ano;

    public Data_nv(int dia, int mes,int ano)
    {
        if(verifica_data(dia, mes, ano))
        {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
        else
        {
            this.ano = 0;
            this.dia = 0;
            this.mes = 0;
        }
    }



    private boolean ano_bissexto(int ano)
    {
        return(((ano % 400) == 0) || (((ano % 4) == 0) && ((ano % 100) != 0)));
    }

    private boolean verifica_dia(int dia, int mes, int ano)
    {
        if(dia < 0 || dia > 31) return false;
        if((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11))
        {
            if(dia > 30) return false;
        }
        if(mes == 2)
        {
            if(dia > 29) return false;
            if(!(ano_bissexto(ano)) && dia > 28) return false;
        }
        return true;
    }

    private boolean verifica_data(int dia, int mes,int ano)
    {
        if((dia <= 0) || (mes <= 0) || (ano <= 0)) return false;
        if((dia > 31) || (mes > 12) || (ano > 2024)) return false;
        return verifica_dia(dia, mes, ano);
    }

    public void mostra_data()
    {
        if((ano != 0) && (mes != 0) && (dia != 0))
        {
            if(dia < 10) System.out.print("0");
            System.out.printf("%d/", dia);

            if(mes < 10) System.out.print("0");
            System.out.printf("%d/", mes);

            if(ano < 10) System.out.print("0");
            if(ano < 100) System.out.print("0");
            if(ano < 1000) System.out.print("0");
            System.out.printf("%d\n", ano);
        }
        else System.out.println("Data nao cadastrada");
    }
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if((dia > 31) || (dia < 0)) this.dia = 0;
        else this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if((mes > 31) || (mes < 0)) this.mes = 0;
        else this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if(ano < 0) this.ano = 0;
        else this.ano = ano;
    }
}
