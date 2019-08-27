package org.soc.exames.action;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.soc.exames.domain.Medico;

public class MedicoAction {

	
	
	public Medico getMedico(int idMedico)
	{
		try 
		{
			Medico medico = new Medico();
			String sqlSelect = " select * from medico where id = ?";
			PreparedStatement selectStmt = ConnDb.getConnection().prepareStatement(sqlSelect);
			selectStmt.setInt(1, idMedico);
			selectStmt.executeQuery();
			return medico;
		}catch (SQLException e)
		{
			e.getStackTrace();
			return null;
		}
	}
	
}
