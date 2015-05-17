package com.axiiz.app.services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.axiiz.app.dao.IAxiizDirectionDAO;
import com.axiiz.app.entities.Direction;

@Transactional
public class AxiizDirectionServiceImpl implements IAxiizDirectionService {

	private IAxiizDirectionDAO daoDirection;
	
	
	public void setDaoDirection(IAxiizDirectionDAO daoDirection) {
		this.daoDirection = daoDirection;
	}

	@Override
	public Direction add(Direction direction, Long idSite) {
		// TODO Auto-generated method stub
		return daoDirection.add(direction, idSite);
	}

	@Override
	public List<Direction> getAll() {
		// TODO Auto-generated method stub
		return daoDirection.getAll();
	}

	@Override
	public List<Direction> getByKeyWord(String keyword) {
		// TODO Auto-generated method stub
		return daoDirection.getByKeyWord(keyword);
	}

	@Override
	public Direction getById(Long idDirection) {
		// TODO Auto-generated method stub
		return daoDirection.getById(idDirection);
	}

	@Override
	public void delete(Long idDirection) {
		daoDirection.delete(idDirection);
	}

	@Override
	public void update(Direction direction) {
		daoDirection.update(direction);
	}

}
