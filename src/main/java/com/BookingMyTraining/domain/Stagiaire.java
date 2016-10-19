package com.BookingMyTraining.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Stagiaire {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String nomStagiaire;
	private String prenomStagiaire;
	private int ageStagiaire;
	private String niveauEtudeStagiaire;
	private String emailStagiaire;
	private String telStagiaire;

	public Stagiaire() {
		super();
	}

	public Stagiaire(int id, String nomStagiaire, String prenomStagiaire, int ageStagiaire, String niveauEtudeStagiaire,
			String emailStagiaire, String telStagiaire) {
		super();
		this.id = id;
		this.nomStagiaire = nomStagiaire;
		this.prenomStagiaire = prenomStagiaire;
		this.ageStagiaire = ageStagiaire;
		this.niveauEtudeStagiaire = niveauEtudeStagiaire;
		this.emailStagiaire = emailStagiaire;
		this.telStagiaire = telStagiaire;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomStagiaire() {
		return nomStagiaire;
	}

	public void setNomStagiaire(String nomStagiaire) {
		this.nomStagiaire = nomStagiaire;
	}

	public String getPrenomStagiaire() {
		return prenomStagiaire;
	}

	public void setPrenomStagiaire(String prenomStagiaire) {
		this.prenomStagiaire = prenomStagiaire;
	}

	public int getAgeStagiaire() {
		return ageStagiaire;
	}

	public void setAgeStagiaire(int ageStagiaire) {
		this.ageStagiaire = ageStagiaire;
	}

	public String getNiveauEtudeStagiaire() {
		return niveauEtudeStagiaire;
	}

	public void setNiveauEtudeStagiaire(String niveauEtudeStagiaire) {
		this.niveauEtudeStagiaire = niveauEtudeStagiaire;
	}

	public String getEmailStagiaire() {
		return emailStagiaire;
	}

	public void setEmailStagiaire(String emailStagiaire) {
		this.emailStagiaire = emailStagiaire;
	}

	public String getTelStagiaire() {
		return telStagiaire;
	}

	public void setTelStagiaire(String telStagiaire) {
		this.telStagiaire = telStagiaire;
	}

	@Override
	public String toString() {
		return "Stagiaire [getId()=" + getId() + ", getNomStagiaire()=" + getNomStagiaire() + ", getPrenomStagiaire()="
				+ getPrenomStagiaire() + ", getAgeStagiaire()=" + getAgeStagiaire() + ", getNiveauEtudeStagiaire()="
				+ getNiveauEtudeStagiaire() + ", getEmailStagiaire()=" + getEmailStagiaire() + ", getTelStagiaire()="
				+ getTelStagiaire() + "]";
	}

}
