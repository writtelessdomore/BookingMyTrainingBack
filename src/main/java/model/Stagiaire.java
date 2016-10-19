package model;

public class Stagiaire {

	private long id;
	private String nom;

	public Stagiaire(long id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}

	public long getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Stagiaire [getId()=" + getId() + ", getnom()=" + getNom() + "]";
	}

}
