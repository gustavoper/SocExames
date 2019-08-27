package org.soc.exames.action;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.soc.exames.domain.TipoExame;

public class TipoExameAction {

	
	
	public TipoExame getTipoExame(int idMedico)
	{
		try 
		{
			TipoExame tipoexame = new TipoExame();
			String sqlSelect = " select * from medico where id = ?";
			PreparedStatement selectStmt = ConnDb.getConnection().prepareStatement(sqlSelect);
			selectStmt.setInt(1, idMedico);
			selectStmt.executeQuery();
			return tipoexame;
		}catch (SQLException e)
		{
			e.getStackTrace();
			return null;
		}
	}
	
}
