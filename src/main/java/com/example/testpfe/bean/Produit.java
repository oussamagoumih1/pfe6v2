package com.example.testpfe.bean;



import javax.persistence.*;

@Entity

public class Produit {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String ref;
	
	@ManyToOne
	private ProduitCategorie produitCategorie;

    public Produit() {
    }

    public Produit(Long id, String ref, ProduitCategorie produitCategorie) {
        this.id = id;
        this.ref = ref;
        this.produitCategorie = produitCategorie;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public ProduitCategorie getProduitCategorie() {
        return produitCategorie;
    }

    public void setProduitCategorie(ProduitCategorie produitCategorie) {
        this.produitCategorie = produitCategorie;
    }
}
