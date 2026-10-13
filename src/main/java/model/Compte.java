package model;

public abstract class Compte {
	
	protected Integer id;
	protected String login;
	protected String password;
	protected String nom;
	protected String prenom;
	protected genre genre;
	

	public Compte(Integer id, String login, String password, String nom, String prenom, model.genre genre) {
		this.id = id;
		this.login = login;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
		this.genre = genre;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public genre getGenre() {
		return genre;
	}


	public void setGenre(genre genre) {
		this.genre = genre;
	}


	@Override
	public String toString() {
		return "Compte [id=" + id + ", login=" + login + ", password=" + password + ", nom=" + nom + ", prenom="
				+ prenom + ", genre=" + genre + "]";
	}

	
	
	
	
}

