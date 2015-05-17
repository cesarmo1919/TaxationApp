package com.axiiz.app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.axiiz.app.entities.Secteur;
import com.axiiz.app.entities.Site;

public class AxiizSiteDAOImpl implements IAxiizSiteDAO {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Site add(Site site, Long idSecteur) {
		Secteur secteur = em.find(Secteur.class, idSecteur);
		site.setIdSecteur(secteur);
		em.persist(site);
		return site;
	}

	@Override
	public List<Site> getAll() {
		Query req = em.createQuery("select s from Site s");
		return req.getResultList();
	}

	@Override
	public List<Site> getByKeyWord(String keyword) {
		Query req = em.createQuery("select s from Site s where s.Site.nomSite like :x");
		req.setParameter("x", "%" + keyword + "%");
		return req.getResultList();
	}

	@Override
	public Site getById(Long idSite) {
		Site site = em.find(Site.class, idSite);
		return site;
	}

	@Override
	public void delete(Long idSite) {
		if(idSite != null){
			Site site = em.find(Site.class, idSite);
			em.remove(site);
		}

	}

	@Override
	public void update(Site site) {
		em.merge(site);

	}

}
