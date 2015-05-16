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
@Table(name="axiiz_services")
public class Service implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idService;
	private String nomService;
	private String descriptionService;
	@OneToMany(mappedBy="idService")
	private Collection<Employe> employes;
	@ManyToOne
	@JoinColumn(name="idDepartement")
	private Departement idDepartement;
	
	
	public Long getIdService() {
		return idService;
	}
	public void setIdService(Long idService) {
		this.idService = idService;
	}
	public String getNomService() {
		return nomService;
	}
	public void setNomService(String nomService) {
		this.nomService = nomService;
	}
	public String getDescriptionService() {
		return descriptionService;
	}
	public void setDescriptionService(String descriptionService) {
		this.descriptionService = descriptionService;
	}
	public Collection<Employe> getEmployes() {
		return employes;
	}
	public void setEmployes(Collection<Employe> employes) {
		this.employes = employes;
	}
	public Departement getIdDepartement() {
		return idDepartement;
	}
	public void setIdDepartement(Departement idDepartement) {
		this.idDepartement = idDepartement;
	}
	public Service(String nomService, String descriptionService) {
		super();
		this.nomService = nomService;
		this.descriptionService = descriptionService;
	}
	public Service() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
