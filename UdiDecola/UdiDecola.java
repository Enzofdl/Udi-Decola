package UdiDecola;

import Pessoa.Funcionarios;
import Pessoa.*;

import java.util.ArrayList;

public class UdiDecola {

  private static final String cnpj = "50.573.639/0001-34";
  private static ArrayList <Pessoa> funcionarios = new ArrayList<Pessoa>();
  private static double Faturamento = 0;
  private static ArrayList <Pessoa> socios =  new ArrayList<Pessoa>();

  private static double taxa =  0.2;

  // private static double FaturamentoMensal; // CONSIDERAR IMPLEMENTAÇÃO

  public static void contratafuncionario(Pessoa a){
    funcionarios.add(a);
  }
  public static void demitefuncionario(Pessoa a){
    funcionarios.remove(a);
  }
  public static ArrayList<Pessoa> getFuncionarios(){
    return funcionarios;
  }
  public static void CobraTaxa(double taxa){
    Faturamento += taxa;
  }
  public static double getFaturamento(){
    return Faturamento;
  }

  public static void setFaturamento(double faturamento) {
    Faturamento = faturamento;
  }

  public static ArrayList <Pessoa> getSocios(){
    return socios;
  }
  public static void adicionasocio(Pessoa a){
    socios.add(a);
  }
  public static void removesocio(Pessoa a){
    socios.remove(a);
  }
  public static String getCnpj(){
    return cnpj;
  }
  public static double getTaxa(){
    return taxa;
  }
  public static void setTaxa(double t){
    taxa = t;
  }

}
