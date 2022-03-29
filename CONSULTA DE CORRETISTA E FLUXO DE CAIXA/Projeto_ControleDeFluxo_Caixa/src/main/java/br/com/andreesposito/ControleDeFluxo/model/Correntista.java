package br.com.andreesposito.ControleDeFluxo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "correntista")
public class Correntista {

	@Id
	
	@Column(name = "nome", length = 50)
	private String nome;
	
	@Column(name = "email", length = 80)
	private String email;
	
	@Column(name = "telefone", length = 15)
	private String telefone;
	
	@Column(name = "saldo")
	private double saldo;

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	} 
}
