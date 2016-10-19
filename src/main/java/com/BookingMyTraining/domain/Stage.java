package com.BookingMyTraining.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Stage {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idStage;

	private String typeStage;
	private String dureeStage;
	private String LieuStage;
	private float noteStage;
	private Date datePublicationStage;
	private boolean finiStage;
	private String descriptionStage;
	private boolean stagiaireTrouveStage;

	public Stage() {
		super();
	}

	public Stage(int idStage, String typeStage, String dureeStage, String lieuStage, float noteStage,
			Date datePublicationStage, boolean finiStage, String descriptionStage, boolean stagiaireTrouveStage) {
		super();
		this.idStage = idStage;
		this.typeStage = typeStage;
		this.dureeStage = dureeStage;
		LieuStage = lieuStage;
		this.noteStage = noteStage;
		this.datePublicationStage = datePublicationStage;
		this.finiStage = finiStage;
		this.descriptionStage = descriptionStage;
		this.stagiaireTrouveStage = stagiaireTrouveStage;
	}

	public int getIdStage() {
		return idStage;
	}

	public void setIdStage(int idStage) {
		this.idStage = idStage;
	}

	public String getTypeStage() {
		return typeStage;
	}

	public void setTypeStage(String typeStage) {
		this.typeStage = typeStage;
	}

	public String getDureeStage() {
		return dureeStage;
	}

	public void setDureeStage(String dureeStage) {
		this.dureeStage = dureeStage;
	}

	public String getLieuStage() {
		return LieuStage;
	}

	public void setLieuStage(String lieuStage) {
		LieuStage = lieuStage;
	}

	public float getNoteStage() {
		return noteStage;
	}

	public void setNoteStage(float noteStage) {
		this.noteStage = noteStage;
	}

	public Date getDatePublicationStage() {
		return datePublicationStage;
	}

	public void setDatePublicationStage(Date datePublicationStage) {
		this.datePublicationStage = datePublicationStage;
	}

	public boolean isFiniStage() {
		return finiStage;
	}

	public void setFiniStage(boolean finiStage) {
		this.finiStage = finiStage;
	}

	public String getDescriptionStage() {
		return descriptionStage;
	}

	public void setDescriptionStage(String descriptionStage) {
		this.descriptionStage = descriptionStage;
	}

	public boolean isStagiaireTrouveStage() {
		return stagiaireTrouveStage;
	}

	public void setStagiaireTrouveStage(boolean stagiaireTrouveStage) {
		this.stagiaireTrouveStage = stagiaireTrouveStage;
	}

	@Override
	public String toString() {
		return "Stage [getIdStage()=" + getIdStage() + ", getTypeStage()=" + getTypeStage() + ", getDureeStage()="
				+ getDureeStage() + ", getLieuStage()=" + getLieuStage() + ", getNoteStage()=" + getNoteStage()
				+ ", getDatePublicationStage()=" + getDatePublicationStage() + ", isFiniStage()=" + isFiniStage()
				+ ", getDescriptionStage()=" + getDescriptionStage() + ", isStagiaireTrouveStage()="
				+ isStagiaireTrouveStage() + "]";
	}

}
