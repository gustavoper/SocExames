package org.soc.exames.action;


import com.opensymphony.xwork2.ActionSupport;
import org.soc.exames.dao.ExameDao;
import org.soc.exames.domain.*;

import java.util.List;


public class ExameAction extends ActionSupport
{
	private static final long serialVersionUID = 6329394260276112660L;

	private ExameDao exameDao;

	private List<ExameReport> listExames;
	
	public ExameAction()
	{
		ExameDao exameDao = new ExameDao();
	}
	
	public String getAll() throws Exception
	{
		listExames = exameDao.getAllExames();
		return "relatorio";
	}
	
	
	public List<ExameReport> getListExames()
	{
		return listExames;
	}
	
	public void setListExames(List<ExameReport> exameReport)
	{
		listExames = exameReport;
	}
	
}
