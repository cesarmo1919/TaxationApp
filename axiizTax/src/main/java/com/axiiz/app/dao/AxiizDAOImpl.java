package com.axiiz.app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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

	@PersistenceContext
	private EntityManager em;
	@Override
	public Entreprise addEntreprise(Entreprise entreprise) {
		em.persist(entreprise);
		return entreprise;
	}

	@Override
	public Secteur addSecteur(Secteur secteur, Long idEntreprise) {
		Entreprise idEnt = em.find(Entreprise.class, idEntreprise);
		secteur.setIdEntreprise(idEnt);
		em.persist(secteur);
		return secteur;
	}

	@Override
	public Site addSite(Site site, Long idSecteur) {
		Secteur sec = em.find(Secteur.class, idSecteur);
		site.setIdSecteur(sec);
		em.persist(site);
		return site;
	}

	@Override
	public Direction addDirection(Direction direction, Long idSite) {
		Site st = em.find(Site.class, idSite);
		direction.setIdSite(st);
		em.persist(direction);
		return direction;
	}

	@Override
	public Departement addDepartement(Departement departement, Long idDirection) {
	    Direction dir = em.find(Direction.class, idDirection);
	    departement.setIdDirection(dir);
	    em.persist(departement);
		return departement;
	}

	@Override
	public Service addService(Service service, Long idDepartement) {
		Departement dep = em.find(Departement.class, idDepartement);
		service.setIdDepartement(dep);
		em.persist(service);
		return service;
	}

	@Override
	public Employe addEmploye(Employe employe, Long idEmpSup, Long idService) {
		if(idEmpSup != null){
			Employe empsup = em.find(Employe.class, idEmpSup);
			employe.setIdEmpSup(empsup);
		}
		Service sv = em.find(Service.class, idService);
		employe.setIdService(sv);
		em.persist(employe);
		return employe;
	}

	@Override
	public Phone addPhone(Phone phone, Long idEmploye, Long idIPBX,
			Long idGateway) {
		Employe idEmp = em.find(Employe.class, idEmploye);
		IPBX idIpbx = em.find(IPBX.class, idIPBX);
		Gateway idGt = em.find(Gateway.class, idGateway);
		
		phone.setIdEmploye(idEmp);
		phone.setIdIPBX(idIpbx);
		phone.setIdGateway(idGt);
		
		em.persist(phone);
		return phone;
	}

	@Override
	public IPBX addIPBX(IPBX ipbx, Long idEntreprise) {
		Entreprise idEnt = em.find(Entreprise.class, idEntreprise);
		ipbx.setIdEntreprise(idEnt);
		
		em.persist(ipbx);
		return ipbx;
	}

	@Override
	public Ligne addLigne(Ligne ligne, Long idPhone) {
		Phone ph = em.find(Phone.class, idPhone);
		ligne.setIdPhone(ph);
		em.persist(ligne);
		return ligne;
	}

	@Override
	public Gateway addGateway(Gateway gateway) {
        em.persist(gateway);
		return gateway;
	}

	@Override
	public Fonction addFonction(Fonction fonction) {
		em.persist(fonction);
		return fonction;
	}

	@Override
	public void treatFile() {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Entreprise> getAllEntreprise() {
		Query req = em.createQuery("select e from Entreprise e");
		return req.getResultList();
	}

	@Override
	public List<Secteur> getAllSecteur() {
		Query req = em.createQuery("select sec from Secteur sec");
		return req.getResultList();
	}

	@Override
	public List<Site> getAllSite() {
		Query req = em.createQuery("select st from Site st");
		return req.getResultList();
	}

	@Override
	public List<Direction> getAllDirection() {
		Query req = em.createQuery("select dir from Direction dir");
		return req.getResultList();
	}

	@Override
	public List<Departement> getAllDepartement() {
		Query req = em.createQuery("select dep from Departement dep");
		return req.getResultList();
	}

	@Override
	public List<Service> getAllService() {
		Query req = em.createQuery("select sv from Service sv");
		return req.getResultList();
	}

	@Override
	public List<Employe> getAllEmploye() {
		Query req = em.createQuery("select emp from Employe emp");
		return req.getResultList();
	}

	@Override
	public List<IPBX> getAllIPBX() {
		Query req = em.createQuery("select p from IPBX p");
		return req.getResultList();
	}

	@Override
	public List<Phone> getAllPhone() {
		Query req = em.createQuery("select ph from Phone ph");
		return req.getResultList();
	}

	@Override
	public List<Ligne> getAllLigne() {
		Query req = em.createQuery("select l from Ligne l");
		return req.getResultList();
	}

	@Override
	public List<Gateway> getAllGetway() {
		Query req = em.createQuery("select g from Gateway g");
		return req.getResultList();
	}

	@Override
	public List<Fonction> getAllFonction() {
		Query req = em.createQuery("select f from Fonction f");
		return req.getResultList();
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
		Query req = em.createQuery("select fi From Fichier fi");
		return req.getResultList();
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
		if(idEntreprise != null){
			Entreprise entreprise = em.find(Entreprise.class, idEntreprise);
			em.remove(entreprise);
		}
	}

	@Override
	public void deleteSecteur(Long idSecteur) {
		if(idSecteur != null){
			Secteur secteur = em.find(Secteur.class, idSecteur);
			em.remove(secteur);
		}

	}

	@Override
	public void deleteDirection(Long idDirection) {
		if(idDirection != null){
			Direction direction = em.find(Direction.class, idDirection);
			em.remove(direction);
		}

	}

	@Override
	public void deleteDepartement(Long idDepartement) {
		if(idDepartement != null){
			Departement departement = em.find(Departement.class, idDepartement);
			em.remove(departement);
		}

	}

	@Override
	public void deleteService(Long idService) {
		if(idService != null){
			Service service = em.find(Service.class, idService);
			em.remove(service);
		}

	}

	@Override
	public void deleteEmploye(Long idEmploye) {
		if(idEmploye != null){
			Employe employe = em.find(Employe.class, idEmploye);
			em.remove(employe);
		}

	}

	@Override
	public void deletePhone(Long idPhone) {
		if(idPhone != null){
			Phone phone = em.find(Phone.class, idPhone);
			em.remove(phone);
		}

	}

	@Override
	public void deleteLigne(Long idLigne) {
		if(idLigne != null){
			Ligne ligne = em.find(Ligne.class, idLigne);
			em.remove(ligne);
		}

	}

	@Override
	public void deleteIPBX(Long idIPBX) {
		if(idIPBX != null){
			IPBX ipbx = em.find(IPBX.class, idIPBX);
			em.remove(ipbx);
		}

	}

	@Override
	public void deleteGateway(Long idGateway) {
		if(idGateway != null){
			Gateway gateway = em.find(Gateway.class, idGateway);
			em.remove(gateway);
		}

	}

	@Override
	public void deleteFichier(Long idFichier) {
		if(idFichier != null){
			Fichier fichier = em.find(Fichier.class, idFichier);
			em.remove(fichier);
		}

	}

	@Override
	public void deleteFonction(Long idFonction) {
		if(idFonction != null){
			Fonction fonction = em.find(Fonction.class, idFonction);
			em.remove(fonction);
		}

	}

	@Override
	public void updateEntreprise(Entreprise entreprise) {
		em.merge(entreprise);

	}

	@Override
	public void updateSecteur(Secteur secteur) {
		em.merge(secteur);

	}

	@Override
	public void updateSite(Site site) {
		em.merge(site);

	}

	@Override
	public void updateDirection(Direction direction) {
		em.merge(direction);

	}

	@Override
	public void updateDepartement(Departement departement) {
		em.merge(departement);

	}

	@Override
	public void updateService(Service service) {
		em.merge(service);

	}

	@Override
	public void updateEmploye(Employe employe) {
		em.merge(employe);

	}

	@Override
	public void updatePhone(Phone phone) {
		em.merge(phone);

	}

	@Override
	public void updateIPBX(IPBX ipbx) {
		em.merge(ipbx);

	}

	@Override
	public void updateLigne(Ligne ligne) {
		em.merge(ligne);

	}

	@Override
	public void updateGateway(Gateway gateway) {
		em.merge(gateway);

	}

	@Override
	public void updateFonction(Fonction fonction) {
		em.merge(fonction);

	}

	@Override
	public void deleteSite(Long idSite) {
		// TODO Auto-generated method stub
		if(idSite != null){
			Site site = em.find(Site.class, idSite);
			em.remove(site);
		}
	}

}
