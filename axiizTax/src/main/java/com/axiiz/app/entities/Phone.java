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
@Table(name="axiiz_phones")
public class Phone implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idPhone;
	private String macPhone;
	private String adresseIP;
	private String typePhone;
	private String modelePhone;
	@ManyToOne
	@JoinColumn(name="idEmploye")
	private Employe idEmploye;
	@ManyToOne
	@JoinColumn(name="idIPBX")
	private IPBX idIPBX;
	@OneToMany(mappedBy="idPhone")
	private Collection<Ligne> lignes;
	@ManyToOne
	@JoinColumn(name="idGateway")
	private Gateway idGateway;
	public Long getIdPhone() {
		return idPhone;
	}
	public void setIdPhone(Long idPhone) {
		this.idPhone = idPhone;
	}
	public String getMacPhone() {
		return macPhone;
	}
	public void setMacPhone(String macPhone) {
		this.macPhone = macPhone;
	}
	public String getAdresseIP() {
		return adresseIP;
	}
	public void setAdresseIP(String adresseIP) {
		this.adresseIP = adresseIP;
	}
	public String getTypePhone() {
		return typePhone;
	}
	public void setTypePhone(String typePhone) {
		this.typePhone = typePhone;
	}
	public String getModelePhone() {
		return modelePhone;
	}
	public void setModelePhone(String modelePhone) {
		this.modelePhone = modelePhone;
	}
	public Employe getIdEmploye() {
		return idEmploye;
	}
	public void setIdEmploye(Employe idEmploye) {
		this.idEmploye = idEmploye;
	}
	public IPBX getIdIPBX() {
		return idIPBX;
	}
	public void setIdIPBX(IPBX idIPBX) {
		this.idIPBX = idIPBX;
	}
	public Collection<Ligne> getLignes() {
		return lignes;
	}
	public void setLignes(Collection<Ligne> lignes) {
		this.lignes = lignes;
	}
	public Gateway getIdGateway() {
		return idGateway;
	}
	public void setIdGateway(Gateway idGateway) {
		this.idGateway = idGateway;
	}
	public Phone(String macPhone, String adresseIP, String typePhone,
			String modelePhone) {
		super();
		this.macPhone = macPhone;
		this.adresseIP = adresseIP;
		this.typePhone = typePhone;
		this.modelePhone = modelePhone;
	}
	
	
}
