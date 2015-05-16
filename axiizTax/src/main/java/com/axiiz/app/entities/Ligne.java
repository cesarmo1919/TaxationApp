package com.axiiz.app.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="axiiz_lignes")
public class Ligne implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idLigne;
	private String directoryNumber;
	private String translationPattern;
	@ManyToOne
	@JoinColumn(name="idPhone")
	private Phone idPhone;
	
	
	public Long getIdLigne() {
		return idLigne;
	}
	public void setIdLigne(Long idLigne) {
		this.idLigne = idLigne;
	}
	public String getDirectoryNumber() {
		return directoryNumber;
	}
	public void setDirectoryNumber(String directoryNumber) {
		this.directoryNumber = directoryNumber;
	}
	public String getTranslationPattern() {
		return translationPattern;
	}
	public void setTranslationPattern(String translationPattern) {
		this.translationPattern = translationPattern;
	}
	public Phone getIdPhone() {
		return idPhone;
	}
	public void setIdPhone(Phone idPhone) {
		this.idPhone = idPhone;
	}
	public Ligne(String directoryNumber, String translationPattern) {
		super();
		this.directoryNumber = directoryNumber;
		this.translationPattern = translationPattern;
	}
	public Ligne() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
