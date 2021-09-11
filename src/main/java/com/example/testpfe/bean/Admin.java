/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testpfe.bean;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@DiscriminatorValue("admin")
public class Admin extends User implements Serializable {
    private String propritie;

    public String getPropritie() {
        return propritie;
    }

    public void setPropritie(String propritie) {
        this.propritie = propritie;
    }
}
