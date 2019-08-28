package org.soc.exames.dao;

import org.soc.exames.domain.*;
import java.sql.SQLException;
import java.util.UUID;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ExameDao 
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
	
	
	public List<ExameReport> getAllExames() {
		List<ExameReport> listaExames = new ArrayList<ExameReport>();
		String sql = "select \n" + 
				"ex.id, \n" + 
				"md.nome as 'nome_medico',\n" + 
				"tp.nome as 'tipo_exame',\n" + 
				"p.nome as 'nome_paciente'\n" + 
				"from exame ex\n" + 
				"inner join medico md on md.id = ex.id_medico\n" + 
				"inner join tipoExame tp on tp.id = ex.id_tipo_exame\n" + 
				"inner join paciente p on p.id = ex.id_paciente ";
		
		try {
			PreparedStatement selectStmt = ConnDb.getConnection().prepareStatement(sql);
			ResultSet recordset = selectStmt.executeQuery();
			while (recordset.next()) {
				ExameReport report = new ExameReport();
			
				report.setIdExame(recordset.getInt("id"));
				report.setNomeMedico(recordset.getString("nome_medico"));
				report.setNomePaciente(recordset.getString("nome_paciente"));
				report.setNomeTipoExame(recordset.getString("tipo_exame"));
			
				listaExames.add(report);
			}
			selectStmt.close();
			recordset.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listaExames;

	}


}
