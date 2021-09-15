package com.example.testpfe.dao;

import com.example.testpfe.bean.ReceptionItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReceptionItemDao extends JpaRepository<ReceptionItem, Long> {
    public ReceptionItem findByReference(String reference);

    public int deleteByReference(String reference);

    public int deleteByReceptionReference(String reference);

    public List<ReceptionItem> findByReceptionReference(String reference);

    public int deleteByProduitReference(String reference);

    public List<ReceptionItem> findByProduitReference(String reference);
}
