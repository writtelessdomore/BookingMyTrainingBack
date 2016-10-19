package com.BookingMyTraining.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Entreprise {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idEntreprise;

	private String nomEntreprise;
	private String adresseEntreprise;
	private int nbSalariesEntreprise;
	private boolean primeEntreprise;
	private boolean managementSocialEntreprise;
	private String telEntreprise;
	private float noteEntreprise;
	private String webEntreprise;

	public Entreprise() {
		super();
	}

	public Entreprise(int idEntreprise, String nomEntreprise, String adresseEntreprise, int nbSalariesEntreprise,
			boolean primeEntreprise, boolean managementSocialEntreprise, String telEntreprise, float noteEntreprise,
			String webEntreprise) {
		super();
		this.idEntreprise = idEntreprise;
		this.nomEntreprise = nomEntreprise;
		this.adresseEntreprise = adresseEntreprise;
		this.nbSalariesEntreprise = nbSalariesEntreprise;
		this.primeEntreprise = primeEntreprise;
		this.managementSocialEntreprise = managementSocialEntreprise;
		this.telEntreprise = telEntreprise;
		this.noteEntreprise = noteEntreprise;
		this.webEntreprise = webEntreprise;
	}

	public int getIdEntreprise() {
		return idEntreprise;
	}

	public void setIdEntreprise(int idEntreprise) {
		this.idEntreprise = idEntreprise;
	}

	public String getNomEntreprise() {
		return nomEntreprise;
	}

	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}

	public String getAdresseEntreprise() {
		return adresseEntreprise;
	}

	public void setAdresseEntreprise(String adresseEntreprise) {
		this.adresseEntreprise = adresseEntreprise;
	}

	public int getNbSalariesEntreprise() {
		return nbSalariesEntreprise;
	}

	public void setNbSalariesEntreprise(int nbSalariesEntreprise) {
		this.nbSalariesEntreprise = nbSalariesEntreprise;
	}

	public boolean isPrimeEntreprise() {
		return primeEntreprise;
	}

	public void setPrimeEntreprise(boolean primeEntreprise) {
		this.primeEntreprise = primeEntreprise;
	}

	public boolean isManagementSocialEntreprise() {
		return managementSocialEntreprise;
	}

	public void setManagementSocialEntreprise(boolean managementSocialEntreprise) {
		this.managementSocialEntreprise = managementSocialEntreprise;
	}

	public String getTelEntreprise() {
		return telEntreprise;
	}

	public void setTelEntreprise(String telEntreprise) {
		this.telEntreprise = telEntreprise;
	}

	public float getNoteEntreprise() {
		return noteEntreprise;
	}

	public void setNoteEntreprise(float noteEntreprise) {
		this.noteEntreprise = noteEntreprise;
	}

	public String getWebEntreprise() {
		return webEntreprise;
	}

	public void setWebEntreprise(String webEntreprise) {
		this.webEntreprise = webEntreprise;
	}

	@Override
	public String toString() {
		return "Entreprise [getIdEntreprise()=" + getIdEntreprise() + ", getNomEntreprise()=" + getNomEntreprise()
				+ ", getAdresseEntreprise()=" + getAdresseEntreprise() + ", getNbSalariesEntreprise()="
				+ getNbSalariesEntreprise() + ", isPrimeEntreprise()=" + isPrimeEntreprise()
				+ ", isManagementSocialEntreprise()=" + isManagementSocialEntreprise() + ", getTelEntreprise()="
				+ getTelEntreprise() + ", getNoteEntreprise()=" + getNoteEntreprise() + ", getWebEntreprise()="
				+ getWebEntreprise() + "]";
	}

}
