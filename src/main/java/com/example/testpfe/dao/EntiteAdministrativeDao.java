package com.example.testpfe.dao;

<<<<<<< HEAD
public interface EntiteAdministrativeDao {
=======
import com.example.testpfe.bean.EntiteAdministrative;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EntiteAdministrativeDao extends JpaRepository <EntiteAdministrative, Long> {

    EntiteAdministrative findByCode (String code);

    EntiteAdministrative findByLibelle (String libelle);

    EntiteAdministrative findByCodeAndLibelle (String code, String libelle);

    int deleteByLibelle (String libelle);

    int deleteByLibelle (List<EntiteAdministrative> entiteAdministratives);

>>>>>>> branch 'master' of https://github.com/oussamagoumih1/pfe6v2/
}
