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
@Table(name="axiiz_directions")
public class Direction implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idDirection;
	private String nomDirection;
	private String descriptionDirection;
	@OneToMany(mappedBy="idDirection")
	private Collection<Departement> departements;
	@ManyToOne
	@JoinColumn(name="idSite")
	private Site idSite;
	
	
	public Long getIdDirection() {
		return idDirection;
	}
	public void setIdDirection(Long idDirection) {
		this.idDirection = idDirection;
	}
	public String getNomDirection() {
		return nomDirection;
	}
	public void setNomDirection(String nomDirection) {
		this.nomDirection = nomDirection;
	}
	public String getDescriptionDirection() {
		return descriptionDirection;
	}
	public void setDescriptionDirection(String descriptionDirection) {
		this.descriptionDirection = descriptionDirection;
	}
	public Collection<Departement> getDepartements() {
		return departements;
	}
	public void setDepartements(Collection<Departement> departements) {
		this.departements = departements;
	}
	public Site getIdSite() {
		return idSite;
	}
	public void setIdSite(Site idSite) {
		this.idSite = idSite;
	}
	public Direction(String nomDirection, String descriptionDirection) {
		super();
		this.nomDirection = nomDirection;
		this.descriptionDirection = descriptionDirection;
	}
	public Direction() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
