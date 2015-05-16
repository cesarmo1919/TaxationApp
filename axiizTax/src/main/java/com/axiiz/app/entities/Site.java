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
@Table(name="axiiz_sites")
public class Site implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idSite;
	private String nomSite;
	private String descriptionSite;
	@OneToMany(mappedBy="idSite")
	private Collection<Direction> directions;
	@ManyToOne
	@JoinColumn(name="idSecteur")
	private Secteur idSecteur;
	
	public Long getIdSite() {
		return idSite;
	}
	public void setIdSite(Long idSite) {
		this.idSite = idSite;
	}
	public String getNomSite() {
		return nomSite;
	}
	public void setNomSite(String nomSite) {
		this.nomSite = nomSite;
	}
	public String getDescriptionSite() {
		return descriptionSite;
	}
	public void setDescriptionSite(String descriptionSite) {
		this.descriptionSite = descriptionSite;
	}
	public Collection<Direction> getDirections() {
		return directions;
	}
	public void setDirections(Collection<Direction> directions) {
		this.directions = directions;
	}
	public Secteur getIdSecteur() {
		return idSecteur;
	}
	public void setIdSecteur(Secteur idSecteur) {
		this.idSecteur = idSecteur;
	}
	public Site(String nomSite, String descriptionSite) {
		super();
		this.nomSite = nomSite;
		this.descriptionSite = descriptionSite;
	}
	public Site() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
