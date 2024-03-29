package Trecho;

import java.util.ArrayList;

public class DadosTrecho {
    private static ArrayList<Trechos> vetTrechos= new ArrayList<Trechos>();

    public static boolean Inserir(Trechos t)
    {
        if(Buscar(t.getNome())) return false;
        vetTrechos.add(t);
        return true;
    }

    public static boolean Buscar(String nome)
    {
        for(Trechos objeto: vetTrechos)
        {
            if(objeto.getNome().equals(nome))
            {
                return true;
            }
        }
        return false;
    }

    public static int Buscar_posicao(String nome)
    {
        int i = 0;
        for(Trechos objeto: vetTrechos)
        {
            if(objeto.getNome().equals(nome))
            {
                return i;
            }
            i++;
        }
        return (-1);
    }

    public static boolean Remove(String nome)
    {
        int i;
        i = Buscar_posicao(nome);
        if(i == (-1)) return false;
        vetTrechos.remove(i);
        return true;
    }
}
