package Pessoa;

import java.util.ArrayList;

public class DadosClientes {
    private static ArrayList<Clientes> vetClien= new ArrayList<Clientes>();

    public static void InsereCliente(Clientes c)
    {
        vetClien.add(c);
    }

    public static boolean buscar(String cpf)
    {
        for(Clientes objeto: vetClien)
        {
            if(cpf.equals(objeto.getCPF()))
            {
                return true;
            }
        }
        return false;
    }
}
