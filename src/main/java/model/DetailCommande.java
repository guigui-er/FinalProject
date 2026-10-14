package model;

public class DetailCommande {

	private Integer id;
	private int qte;
	private double prix;
	
	public DetailCommande(Integer id, int qte, double prix) {
		this.id = id;
		this.qte = qte;
		this.prix = prix;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getQte() {
		return qte;
	}

	public void setQte(int qte) {
		this.qte = qte;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "DetailCommande [id=" + id + ", qte=" + qte + ", prix=" + prix + "]";
	}
	
	
}

