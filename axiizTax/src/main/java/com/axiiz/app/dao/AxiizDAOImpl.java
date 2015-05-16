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

public class AxiizDAOImpl implements IAxiizDAO {

	@Override
	public Entreprise addEntreprise(Entreprise entreprise) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Secteur addSecteur(Secteur secteur, Long idEntreprise) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Site addSite(Site site, Long idSecteur) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Direction addDirection(Direction direction, Long idSite) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Departement addDepartement(Departement departement, Long idDirection) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Service addService(Service service, Long idDepartement) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employe addEmploye(Employe employe, Long idEmpSup, Long idService) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Phone addPhone(Phone phone, Long idEmploye, Long idIPBX,
			Long idGateway) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IPBX addIPBX(IPBX ipbx, Long idEntreprise) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ligne addLigne(Ligne ligne, Long idPhone) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Gateway addGateway(Gateway gateway, Long idIPBX) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Fonction addFonction(Fonction fonction) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void treatFile() {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Entreprise> getAllEntreprise() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Secteur> getAllSecteur() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Site> getAllSite() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Direction> getAllDirection() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Departement> getAllDepartement() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Service> getAllService() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employe> getAllEmploye() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IPBX> getAllIPBX() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Phone> getAllPhone() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ligne> getAllLigne() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Gateway> getAllGetway() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Fonction> getAllFonction() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Fichier> getAllCDR() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Fichier> getAllCMR() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Fichier> getAllFichier() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Entreprise> getEntrepriseByMC(String mc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Secteur> getSecteurByMC(String mc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Site> getSiteByMC(String mc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Direction> getDirectionByMC(String mc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Departement> getDepartementByMC(String mc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Service> getServiceByMC(String mc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employe> getEmployeByMC(String mc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IPBX> getIPBXByMC(String mc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Phone> getPhoneByMC(String mc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ligne> getLigneByMC(String mc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Gateway> getGatewayByMC(String mc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Fonction> getFonctionByMC(String mc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Fichier> getFichierByMC(String mc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Fichier> getCDRByMC(String mc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Fichier> getCMRByMC(String mc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Entreprise getEntrepriseById(Long idEntreprise) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Secteur getSecteurById(Long idSecteur) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Site getSiteById(Long idSite) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Direction getDirectionById(Long idDirection) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Departement getDepartementById(Long idDepartement) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Service getServiceById(Long idService) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employe getEmployeById(Long idEmploye) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IPBX getIPBXById(Long idIPBX) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Phone getPhoneById(Long idPhone) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ligne getLigneById(Long idLigne) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Gateway getGatewayById(Long idGateway) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Fonction getFonctionById(Long idFonction) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Fichier getFichierById(Long idFichier) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Secteur> getSecteurByEntrepriseId(Long idEntreprise) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Site> getSiteBySecteurId(Long idSecteur) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Direction> getDirectionBySiteId(Long idSite) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Departement> getDepartementByDirectionId(Long idDirection) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Service> getServiceByDepartementId(Long idDepartement) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employe> getEmployeByServiceId(Long idService) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Phone> getPhoneByEmployeId(Long idEmploye) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ligne> getLigneByPhoneId(Long idPhone) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Phone> getPhoneByIPBXId(Long idIPBX) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IPBX> getIPBXByEntrepriseId(Long idEntreprise) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Gateway> getGatewayByIPBXId(Long idIPBX) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Fichier> getFichierByIPBXId(Long idIPBX) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ligne> getLigneByGatewayId(Long idGateway) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEntreprise(Long idEntreprise) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteSecteur(Long idSecteur) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteDirection(Long idDirection) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteDepartement(Long idDepartement) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteService(Long idService) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteEmploye(Long idEmploye) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePhone(Long idPhone) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteLigne(Long idLigne) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteIPBX(Long idIPBX) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteGateway(Long idGateway) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteFichier(Long idFichier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteFonction(Long idFonction) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateEntreprise(Entreprise entreprise) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateSecteur(Secteur secteur) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateSite(Site site) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateDirection(Direction direction) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateDepartement(Departement departement) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateService(Service service) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateEmploye(Employe employe) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updatePhone(Phone phone) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateIPBX(IPBX ipbx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateLigne(Ligne ligne) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateGateway(Gateway gateway) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateFonction(Fonction fonction) {
		// TODO Auto-generated method stub

	}

}
