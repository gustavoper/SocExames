package org.soc.exames.domain;

import org.soc.exames.domain.*;


/**
 *
 * Entidade "Exame"
 *
 * @author Gustavo Pereira <gustavoper@gmail.com>
 *
 */
public class Exame {


    private int idExame;
    
	private Paciente paciente;

    private Medico Medico;

    private TipoExame TipoExame;

    private String emailPaciente;

    private String observacaoExame;

    private String idExternoExame;

    

	public int getIdExame() {
		return idExame;
	}

	public void setIdExame(int idExame) {
		this.idExame = idExame;
	}

	public Paciente getPaciente() {
		return this.paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Medico getMedico() {
		return this.Medico;
	}

	public void setMedico(Medico medico) {
		this.Medico = medico;
	}

	public TipoExame getTipoExame() {
		return this.TipoExame;
	}

	public void setTipoExame(TipoExame tipoExame) {
		this.TipoExame = tipoExame;
	}

	public String getEmailPaciente() {
		return emailPaciente;
	}

	public void setEmailPaciente(String emailPaciente) {
		this.emailPaciente = emailPaciente;
	}

	public String getObservacaoExame() {
		return observacaoExame;
	}

	public void setObservacaoExame(String observacaoExame) {
		this.observacaoExame = observacaoExame;
	}

	/**
	 * ID Externo do Exame (WS)
	 * 
	 * @return
	 */
	public String getIdExternoExame() {
		return idExternoExame;
	}

	/**
	 * ID Externo do Exame (WS)
	 * 
	 * @param idExternoExame
	 */
	public void setIdExternoExame(String idExternoExame) {
		this.idExternoExame = idExternoExame;
		
	}

}