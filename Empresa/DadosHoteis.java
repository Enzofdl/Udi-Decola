package Empresa;

import java.util.ArrayList;

public class DadosHoteis {
    private static ArrayList<Hoteis> vetHoteis = new ArrayList<Hoteis>();

    public static void Cadastrar(Hoteis h)
    {
        vetHoteis.add(h);
    }

}
