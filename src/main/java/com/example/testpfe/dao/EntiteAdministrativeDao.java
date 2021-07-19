package com.example.testpfe.dao;

import com.example.testpfe.bean.EntiteAdministrative;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EntiteAdministrativeDao extends JpaRepository <EntiteAdministrative, Long> {

    EntiteAdministrative findByCode (String code);

    EntiteAdministrative findByLibelle (String libelle);

    EntiteAdministrative findByCodeAndLibelle (String code, String libelle);

    int deleteByLibelle (String libelle);

    int deleteByLibelle (List<EntiteAdministrative> entiteAdministratives);

}
