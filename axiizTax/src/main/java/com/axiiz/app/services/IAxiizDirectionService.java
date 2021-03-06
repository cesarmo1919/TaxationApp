package com.axiiz.app.services;

import java.util.List;

import com.axiiz.app.entities.Direction;

public interface IAxiizDirectionService {

	public Direction add(Direction direction, Long idSite);
	public List<Direction> getAll();
	public List<Direction> getByKeyWord(String keyword);
	public Direction getById(Long idDirection);
	public void delete(Long idDirection);
	public void update(Direction direction);
}
