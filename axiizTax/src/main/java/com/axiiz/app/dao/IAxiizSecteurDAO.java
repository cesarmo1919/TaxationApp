package com.axiiz.app.dao;

import java.util.List;

import com.axiiz.app.entities.Secteur;

public interface IAxiizSecteurDAO {

	public Secteur add(Secteur secteur, Long idEntreprise);
	public List<Secteur> getAll();
	public List<Secteur> getByKeyWord(String keyword);
	public Secteur getById(Long idSecteur);
	public void delete(Long idSecteur);
	public void update(Secteur secteur);
}
