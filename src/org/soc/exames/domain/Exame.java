package org.soc.exames.domain;

/**
 * 
 * Entidade "Exame" 
 * 
 * @author Gustavo Pereira <gustavoper@gmail.com>
 *
 */
public class Exame {

	
	private int id;
	
	/**
	 * Nome do Paciente
	 */
	private String nomePaciente;
	
	
	/**
	 * Nome do Médico
	 */
	private String nomeMedico;
	
	/**
	 * E-mail do Paciente
	 */
	private String emailPaciente;
	
	/**
	 * UID do Exame (Para WS)
	 */
	private String uidExame;
	
	/**
	 * Observação - Exame
	 */
	private String observacaoExame;

	public int getId() {
		return id;
	}

	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNomePaciente()
	{
		return nomePaciente;
	}
	
	
	public void setNomePaciente(String nomePaciente)
	{
		this.nomePaciente = nomePaciente;
	}
	
	public String getNomeMedico()
	{
		return nomeMedico;
	}
	
	
	public void setNomeMedico(String nomeMedico)
	{
		this.nomeMedico = nomeMedico;
	}
	
	
	public String getEmailPaciente()
	{
		return emailPaciente;
	}
	
	public void setEmailPaciente(String emailPaciente)
	{
		this.emailPaciente = emailPaciente;
	}
	
	
	public String getUidExame() {
		return uidExame;
	}

	public void setUidExame(String uidExame) {
		this.uidExame = uidExame;
	}

	
	public String getObservacaoExame()
	{
		return observacaoExame;
	}
	
	public void setObservacaoExame(String observacaoExame)
	{
		this.observacaoExame = observacaoExame;
	}
	
	
	
	
}
