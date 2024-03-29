package Pesquisa;

import Pessoa.Data_nv;

import java.util.Calendar;

import java.util.Date;


public class Pesquisa {

	private String origem;    // CIDADE
	private String destino;  // CIDADE
	private Data_nv inicio;  // DATA
	private Data_nv volta;  // DATA
	private Data_nv dataehora; // MOMENTO DA PESQUISA
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
	public Data_nv getInicio() {
		return inicio;
	}
	public void setInicio(Data_nv inicio) {
		this.inicio = inicio;
	}
	public Data_nv getVolta() {
		return volta;
	}
	public void setVolta(Data_nv volta) {
		this.volta = volta;
	}
	public Data_nv getDataehora() {
		return dataehora;
	}
	
	
	public Pesquisa(String origem, String destino, Data_nv inicio, Data_nv volta, Data_nv momento) {
		super();
		this.origem = origem;
		this.destino = destino;
		this.inicio = inicio;
		this.volta = volta;
		dataehora = momento;
	}
}
