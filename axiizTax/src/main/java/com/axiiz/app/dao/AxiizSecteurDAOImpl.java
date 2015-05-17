package com.axiiz.app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.axiiz.app.entities.Entreprise;
import com.axiiz.app.entities.Secteur;

public class AxiizSecteurDAOImpl implements IAxiizSecteurDAO {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Secteur add(Secteur secteur, Long idEntreprise) {
		Entreprise entreprise = em.find(Entreprise.class, idEntreprise);
		secteur.setIdEntreprise(entreprise);
		em.persist(secteur);
		return secteur;
	}

	@Override
	public List<Secteur> getAll() {
		Query req = em.createQuery("select s from Secteur s");
		return req.getResultList();
	}

	@Override
	public List<Secteur> getByKeyWord(String keyword) {
		Query req = em.createQuery("select s from Secteur s where s.Secteur.nomSecteur like :x");
		req.setParameter("x", "%" + keyword + "%");
		return req.getResultList();
	}

	@Override
	public Secteur getById(Long idSecteur) {
		Secteur secteur = em.find(Secteur.class, idSecteur);
		return secteur;
	}

	@Override
	public void delete(Long idSecteur) {
		if(idSecteur != null){
			Secteur secteur = em.find(Secteur.class, idSecteur);
			em.remove(secteur);
		}

	}

	@Override
	public void update(Secteur secteur) {
		em.merge(secteur);

	}

}
