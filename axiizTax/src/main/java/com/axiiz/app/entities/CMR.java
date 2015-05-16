package com.axiiz.app.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CMR")
public class CMR extends Fichier{

	private double jitter;
	private double latency;
	private double packetLost;
	private String numPhone;
	public double getJitter() {
		return jitter;
	}
	public void setJitter(double jitter) {
		this.jitter = jitter;
	}
	public double getLatency() {
		return latency;
	}
	public void setLatency(double latency) {
		this.latency = latency;
	}
	public double getPacketLost() {
		return packetLost;
	}
	public void setPacketLost(double packetLost) {
		this.packetLost = packetLost;
	}
	public String getNumPhone() {
		return numPhone;
	}
	public void setNumPhone(String numPhone) {
		this.numPhone = numPhone;
	}

	public CMR(String nomFichier, Date dateTransmission, double jitter,
			double latency, double packetLost, String numPhone) {
		super(nomFichier, dateTransmission);
		this.jitter = jitter;
		this.latency = latency;
		this.packetLost = packetLost;
		this.numPhone = numPhone;
	}
	public CMR() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
