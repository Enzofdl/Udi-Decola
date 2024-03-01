package Empresa;

public class Quartos {

  public boolean disponivel;
  public int capacidade;
  public Tempo checkIn;
  public Tempo checkOut;
  public boolean cancelamento;
  public float desconto;
  public float preco;
  public boolean luxo;

  public Quartos(boolean disponivel, int capacidade, boolean cancelamento, float preco, boolean luxo) {
    this.disponivel = disponivel;
    this.capacidade = capacidade;
    this.cancelamento = cancelamento;
    this.preco = preco;
    this.luxo = luxo;
  }

  public Quartos(boolean disponivel, int capacidade, boolean cancelamento, float preco, boolean luxo, Tempo checkIn,
      Tempo checkOut) {
    this(disponivel, capacidade, cancelamento, preco, luxo);
    this.checkIn = checkIn;
    this.checkOut = checkOut;
  }

  public boolean getDisponivel() {
    return disponivel;
  }

  public void setDisponivel(boolean disponivel) {
    this.disponivel = disponivel;
  }

  public int getCapacidade() {
    return capacidade;
  }

  public void setCapacidade(int capacidade) {
    this.capacidade = capacidade;
  }

  public Tempo getCheckOut() {
    return checkOut;
  }

  public void setCheckOut(Tempo checkOut) {
    if(checkOut.getHora() > checkIn.getHora() || (checkOut.getHora() == checkIn.getHora() && checkOut.getMin() > checkIn.getMin())) this.checkOut = checkOut; 
    //Não permite Check Out antes do Check In
  }

  public Tempo getCheckIn() {
    return checkIn;
  }

  public void setCheckIn(Tempo checkIn) {
    this.checkIn = checkIn;
  }

  public boolean getCancelamento() {
    return cancelamento;
  }

  public void setCancelamento(boolean cancelamento) {
    this.cancelamento = cancelamento;
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

}
