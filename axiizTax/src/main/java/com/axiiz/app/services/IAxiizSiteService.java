package com.axiiz.app.services;

import java.util.List;

import com.axiiz.app.entities.Site;

public interface IAxiizSiteService {

	public Site add(Site site, Long idSecteur);
	public List<Site> getAll();
	public List<Site> getByKeyWord(String keyword);
	public Site getById(Long idSite);
	public void delete(Long idSite);
	public void update(Site site);
}
