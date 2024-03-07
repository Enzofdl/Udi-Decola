package Empresa;

public class Tempo {
  private int hora;
  private int min;

  private boolean verificador;

  public Tempo(int hora, int min) {
    this.hora = hora;
    this.min = min;
  }

  public int getHora(){
    return hora;
  }
  public void setHora(int hora) {
    if (hora >= 0 && hora <= 23) this.hora = hora;
    else this.hora = 0;
  }

  public int getMin(){
    return min;
  }

  public void setMin(int min) {
    if(min >= 0 && min <= 59) this.min = min;
    else this.min = 0;
  }
}
