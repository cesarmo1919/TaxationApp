package com.axiiz.app.services;

import java.util.List;

import com.axiiz.app.entities.Entreprise;

public interface IAxiizEntrepriseService {
	public Entreprise add(Entreprise entreprise);
	public List<Entreprise> getAll();
	public Entreprise getbyId(Long idEntreprise);
	public List<Entreprise> getByKeyWord(String keyword);
	public void delete(Long idEntreprise);
	public void update(Entreprise entreprise);
}
