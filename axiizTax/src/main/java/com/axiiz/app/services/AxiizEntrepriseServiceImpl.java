package com.axiiz.app.services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.axiiz.app.dao.IAxiizEntrepriseDAO;
import com.axiiz.app.entities.Entreprise;

@Transactional
public class AxiizEntrepriseServiceImpl implements IAxiizEntrepriseService {

	private IAxiizEntrepriseDAO daoEntreprise;
	
	@Override
	public Entreprise add(Entreprise entreprise) {
		// TODO Auto-generated method stub
		return daoEntreprise.add(entreprise);
	}

	@Override
	public List<Entreprise> getAll() {
		// TODO Auto-generated method stub
		return daoEntreprise.getAll();
	}

	@Override
	public Entreprise getbyId(Long idEntreprise) {
		// TODO Auto-generated method stub
		return daoEntreprise.getbyId(idEntreprise);
	}

	@Override
	public List<Entreprise> getByKeyWord(String keyword) {
		// TODO Auto-generated method stub
		return daoEntreprise.getByKeyWord(keyword);
	}

	@Override
	public void delete(Long idEntreprise) {
		// TODO Auto-generated method stub
        daoEntreprise.delete(idEntreprise);
	}

	@Override
	public void update(Entreprise entreprise) {
		// TODO Auto-generated method stub
        daoEntreprise.update(entreprise);
	}

}
