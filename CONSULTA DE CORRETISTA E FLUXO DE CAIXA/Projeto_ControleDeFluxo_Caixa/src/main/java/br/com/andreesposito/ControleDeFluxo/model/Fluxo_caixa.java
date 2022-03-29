package br.com.andreesposito.ControleDeFluxo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "fluxo_caixa")
public class Fluxo_caixa {

	@Id
	
	@Column(name = "entrada")
	private double entrada;
	
	@Column(name = "saida")
	private double saida;

	
	public double getEntrada() {
		return entrada;
	}

	public void setEntrada(double entrada) {
		this.entrada = entrada;
	}

	public double getSaida() {
		return saida;
	}

	public void setSaida(double saida) {
		this.saida = saida;
	} 
}
