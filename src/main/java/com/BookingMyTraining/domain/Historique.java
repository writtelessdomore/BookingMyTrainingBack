package com.BookingMyTraining.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Historique {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idHistorique;

	private String typeStage;
	private String dureeStage;
	private String LieuStage;
	private float noteStage;
	private Date datePublicationStage;
	private String descriptionStage;

	public Historique() {
		super();
	}

	public Historique(int idHistorique, String typeStage, String dureeStage, String lieuStage, float noteStage,
			Date datePublicationStage, String descriptionStage) {
		super();
		this.idHistorique = idHistorique;
		this.typeStage = typeStage;
		this.dureeStage = dureeStage;
		LieuStage = lieuStage;
		this.noteStage = noteStage;
		this.datePublicationStage = datePublicationStage;
		this.descriptionStage = descriptionStage;
	}

	public int getIdHistorique() {
		return idHistorique;
	}

	public void setIdHistorique(int idHistorique) {
		this.idHistorique = idHistorique;
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

	public String getDescriptionStage() {
		return descriptionStage;
	}

	public void setDescriptionStage(String descriptionStage) {
		this.descriptionStage = descriptionStage;
	}

	@Override
	public String toString() {
		return "Historique [getIdHistorique()=" + getIdHistorique() + ", getTypeStage()=" + getTypeStage()
				+ ", getDureeStage()=" + getDureeStage() + ", getLieuStage()=" + getLieuStage() + ", getNoteStage()="
				+ getNoteStage() + ", getDatePublicationStage()=" + getDatePublicationStage()
				+ ", getDescriptionStage()=" + getDescriptionStage() + "]";
	}

}
