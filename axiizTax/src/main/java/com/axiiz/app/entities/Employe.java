package com.axiiz.app.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="axiiz_employes")
public class Employe implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idEmploye;
	private String nomEmploye;
	private String matriculeEmploye;
	private String numeroPortableEmploye;
	private String emailEmploye;
	@ManyToOne
	@JoinColumn(name="idEmpSup")
	private Employe idEmpSup;
	@OneToMany(mappedBy="idEmploye")
	private Collection<Phone> phones;
	@ManyToOne
	@JoinColumn(name="idService")
	private Service idService;
	@ManyToOne
	@JoinColumn(name="idFonction")
	private Fonction idFonction;
	
	
	public Long getIdEmploye() {
		return idEmploye;
	}
	public void setIdEmploye(Long idEmploye) {
		this.idEmploye = idEmploye;
	}
	public String getNomEmploye() {
		return nomEmploye;
	}
	public void setNomEmploye(String nomEmploye) {
		this.nomEmploye = nomEmploye;
	}
	public String getMatriculeEmploye() {
		return matriculeEmploye;
	}
	public void setMatriculeEmploye(String matriculeEmploye) {
		this.matriculeEmploye = matriculeEmploye;
	}
	public String getNumeroPortableEmploye() {
		return numeroPortableEmploye;
	}
	public void setNumeroPortableEmploye(String numeroPortableEmploye) {
		this.numeroPortableEmploye = numeroPortableEmploye;
	}
	public String getEmailEmploye() {
		return emailEmploye;
	}
	public void setEmailEmploye(String emailEmploye) {
		this.emailEmploye = emailEmploye;
	}
	public Employe getIdEmpSup() {
		return idEmpSup;
	}
	public void setIdEmpSup(Employe idEmpSup) {
		this.idEmpSup = idEmpSup;
	}
	public Collection<Phone> getPhones() {
		return phones;
	}
	public void setPhones(Collection<Phone> phones) {
		this.phones = phones;
	}
	public Service getIdService() {
		return idService;
	}
	public void setIdService(Service idService) {
		this.idService = idService;
	}
	public Fonction getIdFonction() {
		return idFonction;
	}
	public void setIdFonction(Fonction idFonction) {
		this.idFonction = idFonction;
	}
	public Employe(String nomEmploye, String matriculeEmploye,
			String numeroPortableEmploye, String emailEmploye) {
		super();
		this.nomEmploye = nomEmploye;
		this.matriculeEmploye = matriculeEmploye;
		this.numeroPortableEmploye = numeroPortableEmploye;
		this.emailEmploye = emailEmploye;
	}
	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
