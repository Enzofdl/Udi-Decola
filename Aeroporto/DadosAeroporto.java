package Aeroporto;

import java.util.ArrayList;
public class DadosAeroporto {
    private static ArrayList<Aeroporto> vetaero = new ArrayList<Aeroporto>();

    public static void cadastrar(Aeroporto a)
    {
        vetaero.add(a);
    }
}
