package com.axiiz.app.dao;

import java.util.List;

import com.axiiz.app.entities.Departement;
import com.axiiz.app.entities.Direction;
import com.axiiz.app.entities.Employe;
import com.axiiz.app.entities.Entreprise;
import com.axiiz.app.entities.Fichier;
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
	
	public List<Entreprise> getAllEntreprise();
	public List<Secteur> getAllSecteur();
	public List<Site> getAllSite();
	public List<Direction> getAllDirection();
	public List<Departement> getAllDepartement();
	public List<Service> getAllService();
	public List<Employe> getAllEmploye();
	public List<IPBX> getAllIPBX();
	public List<Phone> getAllPhone();
	public List<Ligne> getAllLigne();
	public List<Gateway> getAllGetway();
	public List<Fonction> getAllFonction();
	public List<Fichier> getAllCDR();
	public List<Fichier> getAllCMR();
	public List<Fichier> getAllFichier();
	
	public List<Entreprise> getEntrepriseByMC(String mc);
	public List<Secteur> getSecteurByMC(String mc);
	public List<Site> getSiteByMC(String mc);
	public List<Direction> getDirectionByMC(String mc);
	public List<Departement> getDepartementByMC(String mc);
	public List<Service> getServiceByMC(String mc);
	public List<Employe> getEmployeByMC(String mc);
	public List<IPBX> getIPBXByMC(String mc);
	public List<Phone> getPhoneByMC(String mc);
	public List<Ligne> getLigneByMC(String mc);
	public List<Gateway> getGatewayByMC(String mc);
	public List<Fonction> getFonctionByMC(String mc);
	public List<Fichier> getFichierByMC(String mc);
	public List<Fichier> getCDRByMC(String mc);
	public List<Fichier> getCMRByMC(String mc);
	
	public Entreprise getEntrepriseById(Long idEntreprise);
	public Secteur getSecteurById(Long idSecteur);
	public Site getSiteById(Long idSite);
	public Direction getDirectionById(Long idDirection);
	public Departement getDepartementById(Long idDepartement);
	public Service getServiceById(Long idService);
	public Employe getEmployeById(Long idEmploye);
	public IPBX getIPBXById(Long idIPBX);
	public Phone getPhoneById(Long idPhone);
	public Ligne getLigneById(Long idLigne);
	public Gateway getGatewayById(Long idGateway);
	public Fonction getFonctionById(Long idFonction);
	public Fichier getFichierById(Long idFichier);
	
	public List<Secteur> getSecteurByEntrepriseId(Long idEntreprise);
	public List<Site> getSiteBySecteurId(Long idSecteur);
	public List<Direction> getDirectionBySiteId(Long idSite);
	public List<Departement> getDepartementByDirectionId(Long idDirection);
	public List<Service> getServiceByDepartementId(Long idDepartement);
	public List<Employe> getEmployeByServiceId(Long idService);
	public List<Phone> getPhoneByEmployeId(Long idEmploye);
	public List<Ligne> getLigneByPhoneId(Long idPhone);
	public List<Phone> getPhoneByIPBXId(Long idIPBX);
	public List<IPBX> getIPBXByEntrepriseId(Long idEntreprise);
	public List<Gateway> getGatewayByIPBXId(Long idIPBX);
	public List<Fichier> getFichierByIPBXId(Long idIPBX);
	public List<Ligne> getLigneByGatewayId(Long idGateway);
	

}
