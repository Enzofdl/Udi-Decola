package Pesquisa;

import java.util.Calendar;

import java.util.Date;


public class Pesquisa {

	private String origem;    // CIDADE
	private String destino;  // CIDADE
	private Date inicio;  // DATA
	private Date volta;  // DATA
	private Date dataehora; // MOMENTO DA PESQUISA
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public Date getInicio() {
		return inicio;
	}
	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}
	public Date getVolta() {
		return volta;
	}
	public void setVolta(Date volta) {
		this.volta = volta;
	}
	public Date getDataehora() {
		return dataehora;
	}
	
	
	public Pesquisa(String origem, String destino, Date inicio, Date volta) {
		super();
		this.origem = origem;
		this.destino = destino;
		this.inicio = inicio;
		this.volta = volta;
		Calendar a = Calendar.getInstance();
		dataehora = a.getTime();
	}
	
	
	
	
	
}
