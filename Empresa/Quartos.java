package Empresa;

import java.util.Calendar;

import java.util.Date;

public class Quartos {

  public boolean reservado;
  public int capacidade;
  public Date checkIn;
  public Date checkOut;
  public float desconto;
  public float preco;
  public boolean luxo;

  public Quartos(boolean reservado, int capacidade, boolean cancelamento, float preco, boolean luxo) {
    this.reservado = reservado;
    this.capacidade = capacidade;
    this.cancelamento = cancelamento;
    this.preco = preco;
    this.luxo = luxo;
  }

  public Quartos(boolean disponivel, int capacidade, boolean cancelamento, float preco, boolean luxo, Date checkIn,
      Date checkOut) {
    this(disponivel, capacidade, cancelamento, preco, luxo);
    this.checkIn = checkIn;
    this.checkOut = checkOut;
  } /////////////////////////////////////////////////

  public boolean getReservado() {
    return reservado;
  }

  public int getCapacidade() {
    return capacidade;
  }

  public void setCapacidade(int capacidade) {
    this.capacidade = capacidade;
  }

  public Date getCheckOut() {
    return checkOut;
  }

  public void setCheckOut(Date checkOut) {
    if(checkOut.getHora() > checkIn.getHora() || (checkOut.getHora() == checkIn.getHora() && checkOut.getMin() > checkIn.getMin())) this.checkOut = checkOut; 
    //Não permite Check Out antes do Check In
  }

  public Date getCheckIn() {
    return checkIn;
  }

  public void setCheckIn(Date checkIn) {
    this.checkIn = checkIn;
  }

  public float getPreco() {
    return preco;
  }

  public void setPreco(float preco) {
    if (isVip)
      this.preco = aplicaDesconto(preco, desconto);
    else
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
