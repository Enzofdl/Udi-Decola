package Empresa;

import java.util.Calendar;

import java.util.Date;

public class Quartos {

  public boolean reservado;
  public int capacidade;
  public Tempo checkin;
  public float desconto;
  public float preco;
  public boolean luxo;

  public Quartos(boolean reservado, int capacidade, boolean cancelamento, float preco, boolean luxo) {
    this.reservado = reservado;
    this.capacidade = capacidade;
    this.preco = preco;
    this.luxo = luxo;
  }

  public boolean getReservado() {
    return reservado;
  }

  public int getCapacidade() {
    return capacidade;
  }

  public void setCapacidade(int capacidade) {
    this.capacidade = capacidade;
  }


  public void CheckOut() {
    reservado = false;
    checkin.setHora(0);
    checkin.setMin(0);
    //Não permite Check Out antes do Check In
  }

  public Tempo getCheckIn() {
    return checkin;
  }

  public void CheckIn(Tempo checkin) {
    this.checkin = checkin;
  }

  public float getPreco() {
    return preco;
  }

  public void setPreco(float preco) {
      this.preco = preco;
  }

  public boolean getLuxo() {
    return luxo;
  }

  public void setLuxo(boolean luxo) {
    this.luxo = luxo;
  }

  public float getDesconto() {
    return desconto;
  }

  public void setDesconto(float desconto) {
    this.desconto = desconto;
  }

  public float aplicaDesconto(float preco, float desconto) {
    return (preco - desconto);
  }

  public void reservar(){
    reservado = true;
  }

  public void cancelar(){
    reservado = false;
  }

}
