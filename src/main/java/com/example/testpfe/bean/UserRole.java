package com.example.testpfe.bean;
import javax.persistence.*;


@Entity
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private com.example.testpfe.bean.User user;
    @ManyToOne
    private com.example.testpfe.bean.Role role;

    public UserRole(User mySaved, Role role) {
        this.user = user;
        this.role = role;
    }

    public UserRole() {
        
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public com.example.testpfe.bean.User getUser() {
        return user;
    }

    public void setUser(com.example.testpfe.bean.User user) {
        this.user = user;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(com.example.testpfe.bean.Role role) {
        this.role = role;
    }
}

