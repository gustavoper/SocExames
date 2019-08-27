package org.soc.exames.action;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.soc.exames.domain.Paciente;

public class PacienteAction {

	
	
	public Paciente getPaciente(int idPaciente)
	{
		try 
		{
			Paciente paciente = new Paciente();
			String sqlSelect = " select * from paciente where id = ?";
			PreparedStatement selectStmt = ConnDb.getConnection().prepareStatement(sqlSelect);
			selectStmt.setInt(1, idPaciente);
			selectStmt.executeQuery();
			return paciente;
		}catch (SQLException e)
		{
			e.getStackTrace();
			return null;
		}
	}
	
}
