package Voo;

import java.util.ArrayList;

public class DadosVoo {
    private static ArrayList<Voo> vetVoo = new ArrayList<Voo>();

    public static void Cadastra(Voo v)
    {
        vetVoo.add(v);
    }
}
