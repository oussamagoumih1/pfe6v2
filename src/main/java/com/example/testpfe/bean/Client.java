/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testpfe.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author macayoub
 */
@Entity
public class Client implements Serializable {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	private String nom;
	private String cin;
	private String tel;
	private String adresse;
	private String description;
	private BigDecimal creance;
	private boolean bloqued;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getCreance() {
        return creance;
    }

    public void setCreance(BigDecimal creance) {
        this.creance = creance;
    }

    public boolean isBloqued() {
        return bloqued;
    }

    public void setBloqued(boolean bloqued) {
        this.bloqued = bloqued;
    }

    @Override
    public String toString() {
        return "Client{" + "id=" + id + ", nom=" + nom + ", cin=" + cin + ", tel=" + tel + ", adresse=" + adresse + ", description=" + description + ", creance=" + creance + ", bloqued=" + bloqued + '}';
    }


}
