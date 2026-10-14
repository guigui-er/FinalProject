package model;

import java.time.LocalDateTime;

public class Commande {

	private Integer id;
	private LocalDateTime date;
	private boolean accepter_paiement;
	
	public Commande(Integer id, LocalDateTime date, boolean accepter_paiement) {
		this.id = id;
		this.date = date;
		this.accepter_paiement = accepter_paiement;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public boolean isAccepter_paiement() {
		return accepter_paiement;
	}

	public void setAccepter_paiement(boolean accepter_paiement) {
		this.accepter_paiement = accepter_paiement;
	}

	@Override
	public String toString() {
		return "Commande [id=" + id + ", date=" + date + ", accepter_paiement=" + accepter_paiement + "]";
	}
	
	
	
}
