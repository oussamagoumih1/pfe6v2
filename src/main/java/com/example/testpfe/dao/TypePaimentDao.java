package com.example.testpfe.dao;

import com.example.testpfe.bean.TypePaiement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypePaimentDao extends JpaRepository<TypePaiement, Long> {
    TypePaiement findByRef(String ref);

    TypePaiement findByLibelle(String libelle);

    int deleteByRef(String ref);

    int deleteByLibelle(String libelle);
}
