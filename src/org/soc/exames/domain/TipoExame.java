package org.soc.exames.domain;

/**
 * Entidade Medico
 * 
 * @author gpereira
 *
 */
public class TipoExame {

	
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
