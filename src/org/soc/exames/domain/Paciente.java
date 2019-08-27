package org.soc.exames.domain;

/**
 * Entidade Paciente
 * 
 * @author gpereira
 *
 */
public class Paciente {

	
	private int id;
	
	private String nome;
	
	private int ativo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAtivo() {
		return ativo;
	}

	public void setAtivo(int ativo) {
		this.ativo = ativo;
	}
	
	
	
	
}
