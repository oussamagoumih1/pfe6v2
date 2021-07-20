package com.example.testpfe.bean;



import javax.persistence.*;

@Entity

public class Produit {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	private ProduitCategorie produitCategorie;

	public Produit() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ProduitCategorie getProduitCategorie() {
		return produitCategorie;
	}

	public void setProduitCategorie(ProduitCategorie produitCategorie) {
		this.produitCategorie = produitCategorie;
	}
}
