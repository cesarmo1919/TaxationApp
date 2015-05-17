package com.axiiz.app.services;

import java.util.List;

import com.axiiz.app.dao.IAxiizSiteDAO;
import com.axiiz.app.entities.Site;

public class AxiizSiteServiceImpl implements IAxiizSiteService {

	private IAxiizSiteDAO daoSite;
	
	
	public void setDaoSite(IAxiizSiteDAO daoSite) {
		this.daoSite = daoSite;
	}

	@Override
	public Site add(Site site, Long idSecteur) {
		// TODO Auto-generated method stub
		return daoSite.add(site, idSecteur);
	}

	@Override
	public List<Site> getAll() {
		// TODO Auto-generated method stub
		return daoSite.getAll();
	}

	@Override
	public List<Site> getByKeyWord(String keyword) {
		// TODO Auto-generated method stub
		return daoSite.getByKeyWord(keyword);
	}

	@Override
	public Site getById(Long idSite) {
		// TODO Auto-generated method stub
		return daoSite.getById(idSite);
	}

	@Override
	public void delete(Long idSite) {
		daoSite.delete(idSite);

	}

	@Override
	public void update(Site site) {
		daoSite.update(site);

	}

}
