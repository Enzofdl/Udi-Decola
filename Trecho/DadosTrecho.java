package Trecho;

import java.util.ArrayList;

import Persist.Arquivo;

public class DadosTrecho {
    private static ArrayList<Trechos> vetTrechos;

    public static void Inicializar()
    {
        vetTrechos = (ArrayList<Trechos>) Arquivo.recuperar("trechos.dat");
        if(vetTrechos == null) vetTrechos = new ArrayList<Trechos>();
    }

    public static void Salvar()
    {
        Arquivo.gravar(vetTrechos, "trechos.dat");
    }

    public static ArrayList<Trechos> retornatrechos (){
        return vetTrechos;
    }
    public static boolean Inserir(Trechos t)
    {
        if(Existe(t.getNome())) return false;
        vetTrechos.add(t);
        Arquivo.gravar(vetTrechos, "trechos.dat");
        return true;
    }

    public static Trechos Buscar(String nome)
    {
        for(Trechos objeto: vetTrechos)
        {
            if(objeto.getNome().equals(nome))
            {
                return objeto;
            }
        }
        return null;
    }

    public static boolean Existe(String nome)
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
