public class Tipo_Quarto{
  private String tipo;
  private int quantidade = 0;
  private boolean luxo;

  public Tipo_Quarto(String tipo, int quantidade, boolean luxo) {
    this.tipo = tipo;
    this.quantidade = quantidade;
    this.luxo = luxo;
  }
  public String getTipo() {
    return tipo;
  }
  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public int getQuantidade(){
    return quantidade;
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }

  public boolean getLuxo(){
    return luxo;
  }
  public void setLuxo(boolean luxo){
    this.luxo = luxo;
  }

  
  
}
