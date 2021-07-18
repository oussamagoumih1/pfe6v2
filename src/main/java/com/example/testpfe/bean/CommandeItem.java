package com.example.testpfe.bean;



import javax.persistence.*;
import java.math.BigDecimal;

@Entity

public class CommandeItem {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ManyToOne
	private Produit produit;
	private BigDecimal qteCommandee;
	private BigDecimal qteLivree;
	@ManyToOne
	private Commande commande;

	public CommandeItem() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public BigDecimal getQteCommandee() {
		return qteCommandee;
	}

	public void setQteCommandee(BigDecimal qteCommandee) {
		this.qteCommandee = qteCommandee;
	}

	public BigDecimal getQteLivree() {
		return qteLivree;
	}

	public void setQteLivree(BigDecimal qteLivree) {
		this.qteLivree = qteLivree;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}
}
