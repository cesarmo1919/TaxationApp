package com.axiiz.app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.axiiz.app.entities.Direction;
import com.axiiz.app.entities.Site;

public class AxiizDirectionDAOImpl implements IAxiizDirectionDAO {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Direction add(Direction direction, Long idSite) {
		Site site = em.find(Site.class, idSite);
		direction.setIdSite(site);
		em.persist(direction);
		return direction;
	}

	@Override
	public List<Direction> getAll() {
		Query req = em.createQuery("select d from Direction d");
		return req.getResultList();
	}

	@Override
	public List<Direction> getByKeyWord(String keyword) {
		Query req = em.createQuery("select d from Direction d where d.Direction.nomDirection like :x");
		req.setParameter("x", "%" + keyword + "%");
		return req.getResultList();
	}

	@Override
	public Direction getById(Long idDirection) {
		Direction direction = em.find(Direction.class, idDirection);
		return direction;
	}

	@Override
	public void delete(Long idDirection) {
		if(idDirection != null){
			Direction direction = em.find(Direction.class, idDirection);
			em.remove(direction);
		}

	}

	@Override
	public void update(Direction direction) {
		em.merge(direction);

	}

}
