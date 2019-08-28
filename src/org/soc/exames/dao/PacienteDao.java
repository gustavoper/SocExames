package org.soc.exames.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.soc.exames.domain.Paciente;

public class PacienteDao {

	
	
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
