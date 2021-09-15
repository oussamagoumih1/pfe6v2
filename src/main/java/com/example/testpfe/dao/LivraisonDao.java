package com.example.testpfe.dao;

import com.example.testpfe.bean.Livraison;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivraisonDao extends JpaRepository<Livraison, Long> {
    public Livraison findByReference(String reference);

    public int deleteByReference(String reference);
}
