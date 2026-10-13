package model;

public abstract class Employe extends Compte{
	
	private double salaire;



	public Employe(Integer id, String login, String password, String nom, String prenom, model.genre genre,
			double salaire) {
		super(id, login, password, nom, prenom, genre);
		this.salaire = salaire;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	@Override
	public String toString() {
		return "Employe [salaire=" + salaire + ", id=" + id + ", login=" + login + ", password=" + password + ", nom="
				+ nom + ", prenom=" + prenom + ", genre=" + genre + "]";
	}
	


	

}
