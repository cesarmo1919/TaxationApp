package com.axiiz.app.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="axiiz_fichier")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "typeFichier")
public class Fichier implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idFichier;
	private String nomFichier;
	private Date dateTransmission;
	@ManyToOne
	@JoinColumn(name="idIPBX")
	private IPBX idIPBX;
	
	
	public Long getIdFichier() {
		return idFichier;
	}
	public void setIdFichier(Long idFichier) {
		this.idFichier = idFichier;
	}
	public String getNomFichier() {
		return nomFichier;
	}
	public void setNomFichier(String nomFichier) {
		this.nomFichier = nomFichier;
	}
	public Date getDateTransmission() {
		return dateTransmission;
	}
	public void setDateTransmission(Date dateTransmission) {
		this.dateTransmission = dateTransmission;
	}
	public IPBX getIdIPBX() {
		return idIPBX;
	}
	public void setIdIPBX(IPBX idIPBX) {
		this.idIPBX = idIPBX;
	}
	public Fichier(String nomFichier, Date dateTransmission) {
		super();
		this.nomFichier = nomFichier;
		this.dateTransmission = dateTransmission;
	}
	public Fichier() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
