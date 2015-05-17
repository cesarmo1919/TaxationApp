package com.axiiz.app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.axiiz.app.entities.Entreprise;

public class AxiizEntrepriseDAOImpl implements IAxiizEntrepriseDAO {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Entreprise add(Entreprise entreprise) {
		em.persist(entreprise);
		return entreprise;
	}

	@Override
	public List<Entreprise> getAll() {
		Query req = em.createQuery("select e from Entreprise e");
		return req.getResultList();
	}

	@Override
	public Entreprise getbyId(Long idEntreprise) {
		Entreprise entreprise = em.find(Entreprise.class, idEntreprise);
		return entreprise;
	}

	@Override
	public List<Entreprise> getByKeyWord(String keyword) {
		Query req = em.createQuery("select e from Entreprise e where e.Entreprise.nomEntreprise like :x");
		req.setParameter("x", "%" + keyword + "%");
		return req.getResultList();
	}

	@Override
	public void delete(Long idEntreprise) {
		if(idEntreprise != null){
			Entreprise entreprise = em.find(Entreprise.class, idEntreprise);
			em.remove(entreprise);
		}

	}

	@Override
	public void update(Entreprise entreprise) {
		em.merge(entreprise);

	}

}
