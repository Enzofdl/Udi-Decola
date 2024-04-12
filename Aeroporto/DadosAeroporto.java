package Aeroporto;

import java.util.ArrayList;
import Trecho.*;
public class DadosAeroporto {
    private static ArrayList<Aeroporto> vetaero = new ArrayList<Aeroporto>();


    public static ArrayList<Aeroporto> retornaaero(){
        return vetaero;
    }

    public static void Inicializar()
    {
        ArrayList<Trechos> t = DadosTrecho.retornatrechos();
        for(Trechos x : t)
        {
            if(!(Existe(x.getOrigem().getNome())))
            {
                vetaero.add( x.getOrigem());
            }
            if(!(Existe(x.getDestino().getNome())))
            {
                vetaero.add(x.getDestino());
            }
        }
    }

    public static boolean cadastrar(Aeroporto a)
    {
        if(Existe(a.getNome())) return false;
        vetaero.add(a);
        return true;
    }

    public static Aeroporto Buscar(String nome)
    {
        for(Aeroporto x : vetaero)
        {
            if(nome.equals(x.getNome()))
            {
                return x;
            }
        }
        return null;
    }


    public static boolean Existe(String nome)
    {
        for(Aeroporto x : vetaero)
        {
            if(nome.equals(x.getNome()))
            {
                return true;
            }
        }
        return false;
    }

    public static boolean Remove(String nome)
    {
        for(Aeroporto x : vetaero)
        {
            if(nome.equals(x.getNome()))
            {
                vetaero.remove(x);
                return true;
            }
        }
        return false;
    }

}
