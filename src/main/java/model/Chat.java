package model;

import java.time.LocalDate;

public class Chat {

	protected Integer id;
	protected String nom;
	protected String race;
	protected boolean adopted;
	protected LocalDate date_veto;
	
	
	public Chat(Integer id, String nom, String race, boolean adopted, LocalDate date_veto) {
		this.id = id;
		this.nom = nom;
		this.race = race;
		this.adopted = adopted;
		this.date_veto = date_veto;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getRace() {
		return race;
	}


	public void setRace(String race) {
		this.race = race;
	}


	public boolean isAdopted() {
		return adopted;
	}


	public void setAdopted(boolean adopted) {
		this.adopted = adopted;
	}


	public LocalDate getDate_veto() {
		return date_veto;
	}


	public void setDate_veto(LocalDate date_veto) {
		this.date_veto = date_veto;
	}
	
	
		
	
}


/*
- id : Integer
- nom : String
- race : string
- sexe : String
- niveau_faim : int (0-100)
- niveau_soif : int (0-100)
- niveau_humeur : int (0-100)
- niveau_sommeil : int (0-100)
- niveau_hygiène : int (0-100)
- niveau_vaccin : double (0-100)
- adopte : bool 
- date_veto : locaDate
*/