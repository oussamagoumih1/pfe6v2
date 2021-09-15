package com.example.testpfe.bean;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class ChefDepartment extends User implements Serializable {

    private String propritie;

    public String getPropritie() {
        return propritie;
    }

    public void setPropritie(String propritie) {
        this.propritie = propritie;
    }
}
