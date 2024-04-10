package Aeroporto;

import java.io.Serializable;
import java.util.ArrayList;
import Trecho.Trechos;

public class Aeroporto implements Serializable {
  private String nome;
  private final String cidade;

  ArrayList<Trechos> trechos = new ArrayList<Trechos>();

  public Aeroporto(String nome, String cidade, ArrayList<Trechos> trechos) {
    this.nome = nome;
    this.cidade = cidade;

  }

  public String getNome() {
    return nome;
  }

  public String getCidade() {
    return cidade;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void registraTrecho(Trechos a) {
    trechos.add(a);
  }

  public void removeTrecho(Trechos a) {
    trechos.remove(a);
  }

  public void alteraTrecho(Trechos antigoTrecho, Trechos novoTrecho) {
    trechos.remove(antigoTrecho);
    trechos.add(novoTrecho);
  }

  
  public boolean BuscarTrecho(Trechos a){
            return trechos.contains(a);
        }
  public Trechos BuscarTrecho(int a){
            return trechos.get(a);
        }
   

  public ArrayList <Trechos> mostraTrechos() {
    return trechos;
  }

}
