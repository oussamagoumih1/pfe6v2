package com.example.testpfe.dao;

import com.example.testpfe.bean.LivraisonItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LivraisonItemDao extends JpaRepository<LivraisonItem, Long> {
    public LivraisonItem findByReference(String reference);

    public int deleteByReference(String reference);

    public int deleteByLivraisonReference(String reference);

    public List<LivraisonItem> findByLivraisonReference(String reference);

    public int deleteByProduitReference(String reference);

    public List<LivraisonItem> findByProduitReference(String reference);
}
