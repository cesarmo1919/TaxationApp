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
@Table(name="axiiz_gatway")
public class Gateway implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idGatway;
	private String ipGatway;
	@OneToMany(mappedBy="idGateway")
	private Collection<Phone> phones;
	
	
	public Long getIdGatway() {
		return idGatway;
	}
	public void setIdGatway(Long idGatway) {
		this.idGatway = idGatway;
	}
	public String getIpGatway() {
		return ipGatway;
	}
	public void setIpGatway(String ipGatway) {
		this.ipGatway = ipGatway;
	}
	public Collection<Phone> getPhones() {
		return phones;
	}
	public void setPhones(Collection<Phone> phones) {
		this.phones = phones;
	}
	public Gateway(String ipGatway) {
		super();
		this.ipGatway = ipGatway;
	}
	public Gateway() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
