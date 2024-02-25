import java.util.ArrayList;
import Trecho.Trechos;

public class Aeroporto {
  private String nome;
  private String cidade;
  private Trechos novoTrecho;
  private int pos;

  ArrayList<Trechos> trechos = new ArrayList<Trechos>();

  public Aeroporto(String nome, String cidade, ArrayList<Trechos> trechos) {
    this.nome = nome;
    this.cidade = cidade;
    this.trechos = trechos;
  }
  
  public Aeroporto(String nome, String cidade, Aeroporto origem, Aeroporto destino, String nomeTrecho) {
    this(nome, cidade);
    this.trechos = new Trechos(origem, destino, nomeTrecho);
  }

  public Aeroporto(String nome, String cidade, ArrayList<Trechos> trechos, Trechos novoTrecho, int pos) {
    this(nome, cidade, trechos);
    this.novoTrecho = novoTrecho;
    this.pos = pos;
  }

  public String getNome() {
    return nome;
  }

  public String getCidade() {
    return cidade;
  }

  public Trechos getNovoTrecho() {
    return novoTrecho;
  }

  public int getpos() {
    return pos;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  public void setNovoTrecho(Trechos novoTrecho) {
    this.novoTrecho = novoTrecho;
  }

  public void setpos(int pos) {
    this.pos = pos;
  }

  public ArrayList<Trechos> registraTrecho(ArrayList<Trechos> trechos, Trechos novoTrecho) {
    trechos.add(novoTrecho);
    return trechos;
  }

  public ArrayList<Trechos> removeTrecho(ArrayList<Trechos> trechos, int pos) {
    trechos.remove(pos);
    return trechos;
  }

  public ArrayList<Trechos> alteraTrecho(ArrayList<Trechos> trechos, int pos, Trechos novoTrecho) {
    trechos.set(pos, novoTrecho);
    return trechos;
  }

  
  public void buscarTrecho(int pos) {
    if(trechos.contains(pos)) {
        Trechos buscado = trechos.get(pos);
        String buscadoEscrito = buscado.toString();
        System.out.println(buscadoEscrito);
      }
  }
   

  public void mostraTrechos() {
    if (!trechos.isEmpty()) {
      String trechoEscrito = trechos.toString();
      System.out.println(trechoEscrito);
    } else
      System.out.println("Nao ha trechos de voo neste aeroporto!");
  }

}