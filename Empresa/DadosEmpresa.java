package Empresa;

import java.util.ArrayList;
public class DadosEmpresa {
    private static ArrayList<Super_Empresa> vetEmp = new ArrayList<Super_Empresa>();

    public static void Cadastra(Super_Empresa s)
    {
        vetEmp.add(s);
    }
}
