package com.axiiz.app.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.axiiz.app.dao.IAxiizDAO;
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

@Transactional
public class AxiizServiceImpl implements IAxiizService{

	private IAxiizDAO dao;
	
	public void setDao(IAxiizDAO dao) {
		this.dao = dao;
	}

	@Override
	public Entreprise addEntreprise(Entreprise entreprise) {
		// TODO Auto-generated method stub
		return dao.addEntreprise(entreprise);
	}

	@Override
	public Secteur addSecteur(Secteur secteur, Long idEntreprise) {
		// TODO Auto-generated method stub
		return dao.addSecteur(secteur, idEntreprise);
	}

	@Override
	public Site addSite(Site site, Long idSecteur) {
		// TODO Auto-generated method stub
		return dao.addSite(site, idSecteur);
	}

	@Override
	public Direction addDirection(Direction direction, Long idSite) {
		// TODO Auto-generated method stub
		return dao.addDirection(direction, idSite);
	}

	@Override
	public Departement addDepartement(Departement departement, Long idDirection) {
		// TODO Auto-generated method stub
		return dao.addDepartement(departement, idDirection);
	}

	@Override
	public Service addService(Service service, Long idDepartement) {
		// TODO Auto-generated method stub
		return dao.addService(service, idDepartement);
	}

	@Override
	public Employe addEmploye(Employe employe, Long idEmpSup, Long idService) {
		// TODO Auto-generated method stub
		return dao.addEmploye(employe, idEmpSup, idService);
	}

	@Override
	public Phone addPhone(Phone phone, Long idEmploye, Long idIPBX,
			Long idGateway) {
		// TODO Auto-generated method stub
		return dao.addPhone(phone, idEmploye, idIPBX, idGateway);
	}

	@Override
	public IPBX addIPBX(IPBX ipbx, Long idEntreprise) {
		// TODO Auto-generated method stub
		return dao.addIPBX(ipbx, idEntreprise);
	}

	@Override
	public Ligne addLigne(Ligne ligne, Long idPhone) {
		// TODO Auto-generated method stub
		return dao.addLigne(ligne, idPhone);
	}

	@Override
	public Gateway addGateway(Gateway gateway) {
		// TODO Auto-generated method stub
		return dao.addGateway(gateway);
	}

	@Override
	public Fonction addFonction(Fonction fonction) {
		// TODO Auto-generated method stub
		return dao.addFonction(fonction);
	}

	@Override
	public void treatFile() {
		// TODO Auto-generated method stub
		dao.treatFile();
	}

	@Override
	public List<Entreprise> getAllEntreprise() {
		// TODO Auto-generated method stub
		return dao.getAllEntreprise();
	}

	@Override
	public List<Secteur> getAllSecteur() {
		// TODO Auto-generated method stub
		return dao.getAllSecteur();
	}

	@Override
	public List<Site> getAllSite() {
		// TODO Auto-generated method stub
		return dao.getAllSite();
	}

	@Override
	public List<Direction> getAllDirection() {
		// TODO Auto-generated method stub
		return dao.getAllDirection();
	}

	@Override
	public List<Departement> getAllDepartement() {
		// TODO Auto-generated method stub
		return dao.getAllDepartement();
	}

	@Override
	public List<Service> getAllService() {
		// TODO Auto-generated method stub
		return dao.getAllService();
	}

	@Override
	public List<Employe> getAllEmploye() {
		// TODO Auto-generated method stub
		return dao.getAllEmploye();
	}

	@Override
	public List<IPBX> getAllIPBX() {
		// TODO Auto-generated method stub
		return dao.getAllIPBX();
	}

	@Override
	public List<Phone> getAllPhone() {
		// TODO Auto-generated method stub
		return dao.getAllPhone();
	}

	@Override
	public List<Ligne> getAllLigne() {
		// TODO Auto-generated method stub
		return dao.getAllLigne();
	}

	@Override
	public List<Gateway> getAllGetway() {
		// TODO Auto-generated method stub
		return dao.getAllGetway();
	}

	@Override
	public List<Fonction> getAllFonction() {
		// TODO Auto-generated method stub
		return dao.getAllFonction();
	}

	@Override
	public List<Fichier> getAllCDR() {
		// TODO Auto-generated method stub
		return dao.getAllCDR();
	}

	@Override
	public List<Fichier> getAllCMR() {
		// TODO Auto-generated method stub
		return dao.getAllCMR();
	}

	@Override
	public List<Fichier> getAllFichier() {
		// TODO Auto-generated method stub
		return dao.getAllFichier();
	}

	@Override
	public List<Entreprise> getEntrepriseByMC(String mc) {
		// TODO Auto-generated method stub
		return dao.getEntrepriseByMC(mc);
	}

	@Override
	public List<Secteur> getSecteurByMC(String mc) {
		// TODO Auto-generated method stub
		return dao.getSecteurByMC(mc);
	}

	@Override
	public List<Site> getSiteByMC(String mc) {
		// TODO Auto-generated method stub
		return dao.getSiteByMC(mc);
	}

	@Override
	public List<Direction> getDirectionByMC(String mc) {
		// TODO Auto-generated method stub
		return dao.getDirectionByMC(mc);
	}

	@Override
	public List<Departement> getDepartementByMC(String mc) {
		// TODO Auto-generated method stub
		return dao.getDepartementByMC(mc);
	}

	@Override
	public List<Service> getServiceByMC(String mc) {
		// TODO Auto-generated method stub
		return dao.getServiceByMC(mc);
	}

	@Override
	public List<Employe> getEmployeByMC(String mc) {
		// TODO Auto-generated method stub
		return dao.getEmployeByMC(mc);
	}

	@Override
	public List<IPBX> getIPBXByMC(String mc) {
		// TODO Auto-generated method stub
		return dao.getIPBXByMC(mc);
	}

	@Override
	public List<Phone> getPhoneByMC(String mc) {
		// TODO Auto-generated method stub
		return dao.getPhoneByMC(mc);
	}

	@Override
	public List<Ligne> getLigneByMC(String mc) {
		// TODO Auto-generated method stub
		return dao.getLigneByMC(mc);
	}

	@Override
	public List<Gateway> getGatewayByMC(String mc) {
		// TODO Auto-generated method stub
		return dao.getGatewayByMC(mc);
	}

	@Override
	public List<Fonction> getFonctionByMC(String mc) {
		// TODO Auto-generated method stub
		return dao.getFonctionByMC(mc);
	}

	@Override
	public List<Fichier> getFichierByMC(String mc) {
		// TODO Auto-generated method stub
		return dao.getFichierByMC(mc);
	}

	@Override
	public List<Fichier> getCDRByMC(String mc) {
		// TODO Auto-generated method stub
		return dao.getCDRByMC(mc);
	}

	@Override
	public List<Fichier> getCMRByMC(String mc) {
		// TODO Auto-generated method stub
		return dao.getCMRByMC(mc);
	}

	@Override
	public Entreprise getEntrepriseById(Long idEntreprise) {
		// TODO Auto-generated method stub
		return dao.getEntrepriseById(idEntreprise);
	}

	@Override
	public Secteur getSecteurById(Long idSecteur) {
		// TODO Auto-generated method stub
		return dao.getSecteurById(idSecteur);
	}

	@Override
	public Site getSiteById(Long idSite) {
		// TODO Auto-generated method stub
		return dao.getSiteById(idSite);
	}

	@Override
	public Direction getDirectionById(Long idDirection) {
		// TODO Auto-generated method stub
		return dao.getDirectionById(idDirection);
	}

	@Override
	public Departement getDepartementById(Long idDepartement) {
		// TODO Auto-generated method stub
		return dao.getDepartementById(idDepartement);
	}

	@Override
	public Service getServiceById(Long idService) {
		// TODO Auto-generated method stub
		return dao.getServiceById(idService);
	}

	@Override
	public Employe getEmployeById(Long idEmploye) {
		// TODO Auto-generated method stub
		return dao.getEmployeById(idEmploye);
	}

	@Override
	public IPBX getIPBXById(Long idIPBX) {
		// TODO Auto-generated method stub
		return dao.getIPBXById(idIPBX);
	}

	@Override
	public Phone getPhoneById(Long idPhone) {
		// TODO Auto-generated method stub
		return dao.getPhoneById(idPhone);
	}

	@Override
	public Ligne getLigneById(Long idLigne) {
		// TODO Auto-generated method stub
		return dao.getLigneById(idLigne);
	}

	@Override
	public Gateway getGatewayById(Long idGateway) {
		// TODO Auto-generated method stub
		return dao.getGatewayById(idGateway);
	}

	@Override
	public Fonction getFonctionById(Long idFonction) {
		// TODO Auto-generated method stub
		return dao.getFonctionById(idFonction);
	}

	@Override
	public Fichier getFichierById(Long idFichier) {
		// TODO Auto-generated method stub
		return dao.getFichierById(idFichier);
	}

	@Override
	public List<Secteur> getSecteurByEntrepriseId(Long idEntreprise) {
		// TODO Auto-generated method stub
		return dao.getSecteurByEntrepriseId(idEntreprise);
	}

	@Override
	public List<Site> getSiteBySecteurId(Long idSecteur) {
		// TODO Auto-generated method stub
		return dao.getSiteBySecteurId(idSecteur);
	}

	@Override
	public List<Direction> getDirectionBySiteId(Long idSite) {
		// TODO Auto-generated method stub
		return dao.getDirectionBySiteId(idSite);
	}

	@Override
	public List<Departement> getDepartementByDirectionId(Long idDirection) {
		// TODO Auto-generated method stub
		return dao.getDepartementByDirectionId(idDirection);
	}

	@Override
	public List<Service> getServiceByDepartementId(Long idDepartement) {
		// TODO Auto-generated method stub
		return dao.getServiceByDepartementId(idDepartement);
	}

	@Override
	public List<Employe> getEmployeByServiceId(Long idService) {
		// TODO Auto-generated method stub
		return dao.getEmployeByServiceId(idService);
	}

	@Override
	public List<Phone> getPhoneByEmployeId(Long idEmploye) {
		// TODO Auto-generated method stub
		return dao.getPhoneByEmployeId(idEmploye);
	}

	@Override
	public List<Ligne> getLigneByPhoneId(Long idPhone) {
		// TODO Auto-generated method stub
		return dao.getLigneByPhoneId(idPhone);
	}

	@Override
	public List<Phone> getPhoneByIPBXId(Long idIPBX) {
		// TODO Auto-generated method stub
		return dao.getPhoneByIPBXId(idIPBX);
	}

	@Override
	public List<IPBX> getIPBXByEntrepriseId(Long idEntreprise) {
		// TODO Auto-generated method stub
		return dao.getIPBXByEntrepriseId(idEntreprise);
	}

	@Override
	public List<Gateway> getGatewayByIPBXId(Long idIPBX) {
		// TODO Auto-generated method stub
		return dao.getGatewayByIPBXId(idIPBX);
	}

	@Override
	public List<Fichier> getFichierByIPBXId(Long idIPBX) {
		// TODO Auto-generated method stub
		return dao.getFichierByIPBXId(idIPBX);
	}

	@Override
	public List<Ligne> getLigneByGatewayId(Long idGateway) {
		// TODO Auto-generated method stub
		return dao.getLigneByGatewayId(idGateway);
	}

	@Override
	public void deleteEntreprise(Long idEntreprise) {
		// TODO Auto-generated method stub
		dao.deleteEntreprise(idEntreprise);
	}

	@Override
	public void deleteSecteur(Long idSecteur) {
		// TODO Auto-generated method stub
		dao.deleteSecteur(idSecteur);
	}

	@Override
	public void deleteDirection(Long idDirection) {
		// TODO Auto-generated method stub
		dao.deleteDirection(idDirection);
	}

	@Override
	public void deleteDepartement(Long idDepartement) {
		// TODO Auto-generated method stub
		dao.deleteDepartement(idDepartement);
	}

	@Override
	public void deleteService(Long idService) {
		// TODO Auto-generated method stub
		dao.deleteService(idService);
	}

	@Override
	public void deleteEmploye(Long idEmploye) {
		// TODO Auto-generated method stub
		dao.deleteEmploye(idEmploye);
	}

	@Override
	public void deletePhone(Long idPhone) {
		// TODO Auto-generated method stub
		dao.deletePhone(idPhone);
	}

	@Override
	public void deleteLigne(Long idLigne) {
		// TODO Auto-generated method stub
		dao.deleteLigne(idLigne);
	}

	@Override
	public void deleteIPBX(Long idIPBX) {
		// TODO Auto-generated method stub
		dao.deleteIPBX(idIPBX);
	}

	@Override
	public void deleteGateway(Long idGateway) {
		// TODO Auto-generated method stub
		dao.deleteGateway(idGateway);
	}

	@Override
	public void deleteFichier(Long idFichier) {
		// TODO Auto-generated method stub
		dao.deleteFichier(idFichier);
	}

	@Override
	public void deleteFonction(Long idFonction) {
		// TODO Auto-generated method stub
		dao.deleteFonction(idFonction);
	}

	@Override
	public void updateEntreprise(Entreprise entreprise) {
		// TODO Auto-generated method stub
		dao.updateEntreprise(entreprise);
	}

	@Override
	public void updateSecteur(Secteur secteur) {
		// TODO Auto-generated method stub
		dao.updateSecteur(secteur);
	}

	@Override
	public void updateSite(Site site) {
		// TODO Auto-generated method stub
		dao.updateSite(site);
	}

	@Override
	public void updateDirection(Direction direction) {
		// TODO Auto-generated method stub
		dao.updateDirection(direction);
	}

	@Override
	public void updateDepartement(Departement departement) {
		// TODO Auto-generated method stub
		dao.updateDepartement(departement);
	}

	@Override
	public void updateService(Service service) {
		// TODO Auto-generated method stub
		dao.updateService(service);
	}

	@Override
	public void updateEmploye(Employe employe) {
		// TODO Auto-generated method stub
		dao.updateEmploye(employe);
	}

	@Override
	public void updatePhone(Phone phone) {
		// TODO Auto-generated method stub
		dao.updatePhone(phone);
	}

	@Override
	public void updateIPBX(IPBX ipbx) {
		// TODO Auto-generated method stub
		dao.updateIPBX(ipbx);
	}

	@Override
	public void updateLigne(Ligne ligne) {
		// TODO Auto-generated method stub
		dao.updateLigne(ligne);
	}

	@Override
	public void updateGateway(Gateway gateway) {
		// TODO Auto-generated method stub
		dao.updateGateway(gateway);
	}

	@Override
	public void updateFonction(Fonction fonction) {
		// TODO Auto-generated method stub
		dao.updateFonction(fonction);
	}

	@Override
	public void deleteSite(Long idSite) {
		// TODO Auto-generated method stub
		dao.deleteSite(idSite);
	}

}
