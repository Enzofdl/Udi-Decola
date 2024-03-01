package Empresa;

import java.util.ArrayList;

public class Hoteis extends Super_Empresa {
  private String endereco;
  private float avaliacao;
  private boolean pets;
  private int numeroquartos;
  ArrayList<Quartos> locacao = new ArrayList<Quartos>();
  private String descricao;
  private String mensagem;
  ArrayList<Tipo_Quarto> tiposQuartos = new ArrayList<Tipo_Quarto>();

  public Hoteis(String cnpj, String nome, String nomefantasia, String datacriacao, String endereco, float avaliacao,
      boolean pets, int numeroquartos) {
    super(cnpj, nome, nomefantasia, datacriacao);
    this.endereco = endereco;
    this.avaliacao = avaliacao;
    this.pets = pets;
    this.numeroquartos = numeroquartos;
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

}










