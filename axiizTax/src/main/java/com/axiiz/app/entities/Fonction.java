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
@Table(name="axiiz_fonctions")
public class Fonction implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idFonction;
	private String nomFonction;
	private String descriptionFonction;
	@OneToMany(mappedBy="idFonction")
	private Collection<Employe> employes;
	
	
	public Long getIdFonction() {
		return idFonction;
	}
	public void setIdFonction(Long idFonction) {
		this.idFonction = idFonction;
	}
	public String getNomFonction() {
		return nomFonction;
	}
	public void setNomFonction(String nomFonction) {
		this.nomFonction = nomFonction;
	}
	public String getDescriptionFonction() {
		return descriptionFonction;
	}
	public void setDescriptionFonction(String descriptionFonction) {
		this.descriptionFonction = descriptionFonction;
	}
	public Collection<Employe> getEmployes() {
		return employes;
	}
	public void setEmployes(Collection<Employe> employes) {
		this.employes = employes;
	}
	public Fonction(String nomFonction, String descriptionFonction) {
		super();
		this.nomFonction = nomFonction;
		this.descriptionFonction = descriptionFonction;
	}
	public Fonction() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
