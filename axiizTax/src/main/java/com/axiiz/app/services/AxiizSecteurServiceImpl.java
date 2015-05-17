package com.axiiz.app.services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.axiiz.app.dao.IAxiizSecteurDAO;
import com.axiiz.app.entities.Secteur;

@Transactional
public class AxiizSecteurServiceImpl implements IAxiizSecteurService {

	private IAxiizSecteurDAO daoSecteur;
	
	
	public void setDaoSecteur(IAxiizSecteurDAO daoSecteur) {
		this.daoSecteur = daoSecteur;
	}

	@Override
	public Secteur add(Secteur secteur, Long idEntreprise) {
		// TODO Auto-generated method stub
		return daoSecteur.add(secteur, idEntreprise);
	}

	@Override
	public List<Secteur> getAll() {
		// TODO Auto-generated method stub
		return daoSecteur.getAll();
	}

	@Override
	public List<Secteur> getByKeyWord(String keyword) {
		// TODO Auto-generated method stub
		return daoSecteur.getByKeyWord(keyword);
	}

	@Override
	public Secteur getById(Long idSecteur) {
		// TODO Auto-generated method stub
		return daoSecteur.getById(idSecteur);
	}

	@Override
	public void delete(Long idSecteur) {
		// TODO Auto-generated method stub
        daoSecteur.delete(idSecteur);
	}

	@Override
	public void update(Secteur secteur) {
		// TODO Auto-generated method stub
        daoSecteur.update(secteur);
	}

}
