package com.axiiz.app.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CDR")
public class CDR extends Fichier{

	private String numAppelant;
	private String numAppele;
	private String dateAppel;
	private String tempsDebutAppel;
	private String tempsFinAppel;
	private String identification;
	private String gateway;
	private String dureeAppel;
	public String getNumAppelant() {
		return numAppelant;
	}
	public void setNumAppelant(String numAppelant) {
		this.numAppelant = numAppelant;
	}
	public String getNumAppele() {
		return numAppele;
	}
	public void setNumAppele(String numAppele) {
		this.numAppele = numAppele;
	}
	public String getDateAppel() {
		return dateAppel;
	}
	public void setDateAppel(String dateAppel) {
		this.dateAppel = dateAppel;
	}
	public String getTempsDebutAppel() {
		return tempsDebutAppel;
	}
	public void setTempsDebutAppel(String tempsDebutAppel) {
		this.tempsDebutAppel = tempsDebutAppel;
	}
	public String getTempsFinAppel() {
		return tempsFinAppel;
	}
	public void setTempsFinAppel(String tempsFinAppel) {
		this.tempsFinAppel = tempsFinAppel;
	}
	public String getIdentification() {
		return identification;
	}
	public void setIdentification(String identification) {
		this.identification = identification;
	}
	public String getGateway() {
		return gateway;
	}
	public void setGateway(String gateway) {
		this.gateway = gateway;
	}
	public String getDureeAppel() {
		return dureeAppel;
	}
	public void setDureeAppel(String dureeAppel) {
		this.dureeAppel = dureeAppel;
	}
	
	public CDR() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CDR(String nomFichier, Date dateTransmission, String numAppelant,
			String numAppele, String dateAppel, String tempsDebutAppel,
			String tempsFinAppel, String identification, String gateway,
			String dureeAppel) {
		super(nomFichier, dateTransmission);
		this.numAppelant = numAppelant;
		this.numAppele = numAppele;
		this.dateAppel = dateAppel;
		this.tempsDebutAppel = tempsDebutAppel;
		this.tempsFinAppel = tempsFinAppel;
		this.identification = identification;
		this.gateway = gateway;
		this.dureeAppel = dureeAppel;
	}

	
	
	
}
