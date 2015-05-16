package com.axiiz.app.dao;

import com.axiiz.app.entities.Departement;
import com.axiiz.app.entities.Direction;
import com.axiiz.app.entities.Employe;
import com.axiiz.app.entities.Entreprise;
import com.axiiz.app.entities.Fonction;
import com.axiiz.app.entities.Gateway;
import com.axiiz.app.entities.IPBX;
import com.axiiz.app.entities.Ligne;
import com.axiiz.app.entities.Phone;
import com.axiiz.app.entities.Secteur;
import com.axiiz.app.entities.Service;
import com.axiiz.app.entities.Site;

public interface IAxiizDAO {

	public Entreprise addEntreprise(Entreprise entreprise);
	public Secteur addSecteur(Secteur secteur, Long idEntreprise);
	public Site addSite(Site site, Long idSecteur);
	public Direction addDirection(Direction direction, Long idSite);
	public Departement addDepartement(Departement departement, Long idDirection);
	public Service addService(Service service, Long idDepartement);
	public Employe addEmploye(Employe employe, Long idEmpSup, Long idService);
	public Phone addPhone(Phone phone, Long idEmploye, Long idIPBX, Long idGateway);
	public IPBX addIPBX(IPBX ipbx, Long idEntreprise);
	public Ligne addLigne(Ligne ligne, Long idPhone);
	public Gateway addGateway(Gateway gateway, Long idIPBX);
	public Fonction addFonction(Fonction fonction);
	public void treatFile();

}
