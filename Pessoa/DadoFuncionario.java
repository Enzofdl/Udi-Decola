package Pessoa;

import java.util.ArrayList;

public class DadoFuncionario {
    private static ArrayList<Funcionarios> vetFunc = new ArrayList<Funcionarios>();

    public static void Cadastrar(Funcionarios f)
    {
        vetFunc.add(f);
    }

    public static boolean Buscar(String cpf)
    {
        for(Funcionarios objeto : vetFunc)
        {
            if(cpf.equals(objeto.getCPF())) {
                return true;
            }
        }
        return false;
    }
}
