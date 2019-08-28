package org.soc.exames.domain;

public class ExameReport 
{

	private String nomeTipoExame, nomeMedico, nomePaciente;
	
	private int idExame;

	public String getNomeTipoExame() {
		return nomeTipoExame;
	}

	public void setNomeTipoExame(String nomeTipoExame) {
		this.nomeTipoExame = nomeTipoExame;
	}

	public String getNomeMedico() {
		return nomeMedico;
	}

	public void setNomeMedico(String nomeMedico) {
		this.nomeMedico = nomeMedico;
	}

	public String getNomePaciente() {
		return nomePaciente;
	}

	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}

	public int getIdExame() {
		return idExame;
	}

	public void setIdExame(int idExame) {
		this.idExame = idExame;
	}
	
	
	

}
