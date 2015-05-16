package com.axiiz.app.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="axiiz_entreprises")
public class Entreprise implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idEntreprise;
	private String nomEntreprise;
	private String adresseEntreprise;
	private String emailEntreprise;
	private String telephoneEntreprise;
	private String faxEntreprise;
	private String siteWebEntreprise;
	@OneToMany(mappedBy="idEntreprise")
	private Collection<Secteur> secteurs;
	
	
	public Long getIdEntreprise() {
		return idEntreprise;
	}
	public void setIdEntreprise(Long idEntreprise) {
		this.idEntreprise = idEntreprise;
	}
	public String getNomEntreprise() {
		return nomEntreprise;
	}
	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}
	public String getAdresseEntreprise() {
		return adresseEntreprise;
	}
	public void setAdresseEntreprise(String adresseEntreprise) {
		this.adresseEntreprise = adresseEntreprise;
	}
	public String getEmailEntreprise() {
		return emailEntreprise;
	}
	public void setEmailEntreprise(String emailEntreprise) {
		this.emailEntreprise = emailEntreprise;
	}
	public String getTelephoneEntreprise() {
		return telephoneEntreprise;
	}
	public void setTelephoneEntreprise(String telephoneEntreprise) {
		this.telephoneEntreprise = telephoneEntreprise;
	}
	public String getFaxEntreprise() {
		return faxEntreprise;
	}
	public void setFaxEntreprise(String faxEntreprise) {
		this.faxEntreprise = faxEntreprise;
	}
	public String getSiteWebEntreprise() {
		return siteWebEntreprise;
	}
	public void setSiteWebEntreprise(String siteWebEntreprise) {
		this.siteWebEntreprise = siteWebEntreprise;
	}
	public Collection<Secteur> getSecteurs() {
		return secteurs;
	}
	public void setSecteurs(Collection<Secteur> secteurs) {
		this.secteurs = secteurs;
	}
	public Entreprise() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Entreprise(String nomEntreprise, String adresseEntreprise,
			String emailEntreprise, String telephoneEntreprise,
			String faxEntreprise, String siteWebEntreprise) {
		super();
		this.nomEntreprise = nomEntreprise;
		this.adresseEntreprise = adresseEntreprise;
		this.emailEntreprise = emailEntreprise;
		this.telephoneEntreprise = telephoneEntreprise;
		this.faxEntreprise = faxEntreprise;
		this.siteWebEntreprise = siteWebEntreprise;
	}
	
	
	
}
