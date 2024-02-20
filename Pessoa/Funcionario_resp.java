package Pessoa;
import java.util.ArrayList;
import Empresa.Hoteis;

public class Funcionario_resp extends Funcionarios{
    private ArrayList<Hoteis> cadastrados = new ArrayList<Hoteis>(); //referencia a quantidad de hoteis cadastrados pelo funcionario
    private static double comissao = 0.1; //Quanto ele ganha por hotel cadastrado (0.1 eh a comissao base, pode ser mudado depois)

    public Funcionario_resp(String nome, String CPF, Data_nv data_nasc, Endereco end, String numero_carteira, double salario)
    {
        super(nome, CPF, data_nasc, end, numero_carteira, salario);
    }

    public boolean Adiciona_hotel(Hoteis hot)
    {
        if(cadastrados.contains(hot)) return false;
        cadastrados.add(hot);
        return true;
    }

    public Hoteis Busca_hotel(int indice)
    {
        return cadastrados.get(indice);//retorna o hotel em um dado indice, pensar em como verificar o indice

    }

    public double calcula_salario()
    {
        return (getSalario() + (comissao * cadastrados.size()));
    }

    public ArrayList<Hoteis> getCadastrados() {
        return cadastrados;
    }

    public void setCadastrados(ArrayList<Hoteis> cadastrados) {
        this.cadastrados = cadastrados;
    }

    public static double getComissao() {
        return comissao;
    }

    public static void setComissao(double comissao) {
        if((comissao > 0) && (comissao < 1)) Funcionario_resp.comissao = comissao;
    }
}
