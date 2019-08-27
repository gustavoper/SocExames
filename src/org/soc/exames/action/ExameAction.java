package org.soc.exames.action;

import org.soc.exames.domain.*;
import java.sql.SQLException;
import java.util.UUID;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ExameAction 
{

	
	public boolean insert(Exame exame) throws Exception
	{
		try {
			//@TODO: acertar aqui
			String sqlInsert = " insert into paciente () values (?,?,?,?,?,?)";
			PreparedStatement insertStmt = ConnDb.getConnection().prepareStatement(sqlInsert);
			String uuidExame = UUID.randomUUID().toString();
			insertStmt.setInt(1, exame.getPaciente().getId());
			insertStmt.setInt(2, exame.getMedico().getId());
			insertStmt.setInt(3, exame.getTipoExame().getId());
			insertStmt.setString(4, exame.getEmailPaciente());
			insertStmt.setString(5, exame.getObservacaoExame());
			insertStmt.setString(6, uuidExame);
			insertStmt.execute();
			insertStmt.close();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean update(Exame exame) throws Exception
	{
		try
		{
			String sqlInsert = " update exame set (...)";
			PreparedStatement insertStmt = ConnDb.getConnection().prepareStatement(sqlInsert);
			insertStmt.setInt(1, exame.getPaciente().getId());
			insertStmt.setInt(2, exame.getMedico().getId());
			insertStmt.setInt(3, exame.getTipoExame().getId());
			insertStmt.setString(4, exame.getEmailPaciente());
			insertStmt.setString(5, exame.getObservacaoExame());
			insertStmt.execute();
			insertStmt.close();
			return true;	
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	public boolean delete(Exame exame)
	{
		try
		{
			String sqlInsert = " update exame set (...)";
			PreparedStatement insertStmt = ConnDb.getConnection().prepareStatement(sqlInsert);
			insertStmt.setInt(1, exame.getIdExame());
			insertStmt.execute();
			insertStmt.close();
			return true;	
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}		
	}
	
	
	public List<Exame> select() {
		List<Exame> listaExames = new ArrayList<Exame>();
		String sql = "SELECT * FROM paciente";

		try {
			PreparedStatement selectStmt = ConnDb.getConnection().prepareStatement(sql);
			ResultSet recordset = selectStmt.executeQuery();
			while (recordset.next()) {
				Exame exame = new Exame();
				exame.setIdExame(recordset.getInt("id"));
				//paciente.setNome(rs.getString("nome"));
				//paciente.setEmail(rs.getString("email"));
				//paciente.setTelefone(rs.getString("telefone"));

				listaExames.add(exame);
			}
			selectStmt.close();
			recordset.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaExames;

	}


}
