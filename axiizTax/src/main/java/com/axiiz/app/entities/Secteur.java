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
@Table(name="axiiz_secteurs")
public class Secteur implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idSecteur;
	private String nomSecteur;
	private String descriptionSecteur;
	@OneToMany(mappedBy="idSecteur")
	private Collection<Site> sites;
	@ManyToOne
	@JoinColumn(name="idEntreprise")
	private Entreprise idEntreprise;
	
	public Entreprise getIdEntreprise() {
		return idEntreprise;
	}
	public void setIdEntreprise(Entreprise idEntreprise) {
		this.idEntreprise = idEntreprise;
	}
	public Long getIdSecteur() {
		return idSecteur;
	}
	public void setIdSecteur(Long idSecteur) {
		this.idSecteur = idSecteur;
	}
	public String getNomSecteur() {
		return nomSecteur;
	}
	public void setNomSecteur(String nomSecteur) {
		this.nomSecteur = nomSecteur;
	}
	public String getDescriptionSecteur() {
		return descriptionSecteur;
	}
	public void setDescriptionSecteur(String descriptionSecteur) {
		this.descriptionSecteur = descriptionSecteur;
	}
	public Collection<Site> getSites() {
		return sites;
	}
	public void setSites(Collection<Site> sites) {
		this.sites = sites;
	}
	public Secteur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Secteur(String nomSecteur, String descriptionSecteur) {
		super();
		this.nomSecteur = nomSecteur;
		this.descriptionSecteur = descriptionSecteur;
	}
	
	
}
