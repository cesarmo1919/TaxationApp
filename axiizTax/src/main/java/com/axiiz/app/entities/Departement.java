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
@Table(name="axiiz_departements")
public class Departement implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idDepartement;
	private String nomDepartement;
	private String descriptionDepartement;
	@OneToMany(mappedBy="idDepartement")
	private Collection<Service> services;
	@ManyToOne
	@JoinColumn(name="idDirection")
	private Direction idDirection;
	
	
	public Long getIdDepartement() {
		return idDepartement;
	}
	public void setIdDepartement(Long idDepartement) {
		this.idDepartement = idDepartement;
	}
	public String getNomDepartement() {
		return nomDepartement;
	}
	public void setNomDepartement(String nomDepartement) {
		this.nomDepartement = nomDepartement;
	}
	public String getDescriptionDepartement() {
		return descriptionDepartement;
	}
	public void setDescriptionDepartement(String descriptionDepartement) {
		this.descriptionDepartement = descriptionDepartement;
	}
	public Collection<Service> getServices() {
		return services;
	}
	public void setServices(Collection<Service> services) {
		this.services = services;
	}
	public Direction getIdDirection() {
		return idDirection;
	}
	public void setIdDirection(Direction idDirection) {
		this.idDirection = idDirection;
	}
	public Departement(String nomDepartement, String descriptionDepartement) {
		super();
		this.nomDepartement = nomDepartement;
		this.descriptionDepartement = descriptionDepartement;
	}
	public Departement() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
