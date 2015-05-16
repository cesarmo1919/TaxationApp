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
@Table(name="axiiz_ipbx")
public class IPBX implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idIPBX;
	private String nomIPBX;
	private String abbrIPBX;
	private String versionIPBX;
	@OneToMany(mappedBy="idIPBX")
	private Collection<Phone> phones;
	@ManyToOne
	@JoinColumn(name="idEntreprise")
	private Entreprise idEntreprise;
	@OneToMany(mappedBy="idIPBX")
	private Collection<Fichier> fichiers;
	
	
	public Long getIdIPBX() {
		return idIPBX;
	}
	public void setIdIPBX(Long idIPBX) {
		this.idIPBX = idIPBX;
	}
	public String getNomIPBX() {
		return nomIPBX;
	}
	public void setNomIPBX(String nomIPBX) {
		this.nomIPBX = nomIPBX;
	}
	public String getAbbrIPBX() {
		return abbrIPBX;
	}
	public void setAbbrIPBX(String abbrIPBX) {
		this.abbrIPBX = abbrIPBX;
	}
	public String getVersionIPBX() {
		return versionIPBX;
	}
	public void setVersionIPBX(String versionIPBX) {
		this.versionIPBX = versionIPBX;
	}
	public Collection<Phone> getPhones() {
		return phones;
	}
	public void setPhones(Collection<Phone> phones) {
		this.phones = phones;
	}
	public Entreprise getIdEntreprise() {
		return idEntreprise;
	}
	public void setIdEntreprise(Entreprise idEntreprise) {
		this.idEntreprise = idEntreprise;
	}
	public Collection<Fichier> getFichiers() {
		return fichiers;
	}
	public void setFichiers(Collection<Fichier> fichiers) {
		this.fichiers = fichiers;
	}
	public IPBX(String nomIPBX, String abbrIPBX, String versionIPBX) {
		super();
		this.nomIPBX = nomIPBX;
		this.abbrIPBX = abbrIPBX;
		this.versionIPBX = versionIPBX;
	}
	public IPBX() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
