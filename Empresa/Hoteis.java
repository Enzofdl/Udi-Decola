package Empresa;

import UdiDecola.UdiDecola;
import Utilitarios.Utilitario;
import Voo.Voo;

import java.util.ArrayList;

public class Hoteis extends Super_Empresa {
  private String endereco;
  private float avaliacao;
  private boolean pets;
  private int numeroquartos;
  ArrayList<Quartos> quartos = new ArrayList<Quartos>();
  private String descricao;
  private String mensagem;


  public Hoteis(String cnpj, String nome, String nomefantasia, String datacriacao, String endereco, float avaliacao,
      boolean pets) {
    super(cnpj, nome, nomefantasia, datacriacao);
    this.endereco = endereco;
    this.avaliacao = avaliacao;
    this.pets = pets;
    this.numeroquartos = 0;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public float getAvaliacao() {
    return avaliacao;
  }

  public void setAvaliacao(float avaliacao) {
    this.avaliacao = avaliacao;
  }

  public boolean getPets() {
    return pets;
  }

  public void setPets(boolean pets) {
    this.pets = pets;
  }

  public int numeroquartos() {
    return numeroquartos;
  }

  public void numeroquartos(int numeroquartos) {
    this.numeroquartos = numeroquartos;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public void novaDescricao(String descricao) {
    this.descricao = descricao;
  }

  public String getMensagem() {
    return mensagem;
  }

  public void setMensagem(String mensagem) {
    this.mensagem = mensagem;
  }

  public void novaMensagem(String mensagem) {
    this.mensagem = mensagem;
  }

  public void adicionarquarto (Quartos a){
    quartos.add(a);
  }
  public void removequarto(Quartos a){
    quartos.remove(a);
  }

  public boolean venda(Quartos A, int quantidade){
    // ADICIONAR VERIFICADOR
    if(A.getReservado()) return false;
    float faturamento = getFaturamento()+ (quantidade*A.getPreco());
    setFaturamento(faturamento);
    double taxa = getTaxa() + (quantidade*(UdiDecola.getTaxa()));
    setTaxa(taxa);
    return true;
  }


}










