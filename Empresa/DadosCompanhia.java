package Empresa;

import java.util.ArrayList;

public class DadosCompanhia {
    private static ArrayList<Companhia> vetComp = new ArrayList<Companhia>();

    public static void Cadastra(Companhia a)
    {
        vetComp.add(a);
    }
}
