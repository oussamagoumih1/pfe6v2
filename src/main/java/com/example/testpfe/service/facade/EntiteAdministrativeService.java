package com.example.testpfe.service.facade;

import com.example.testpfe.bean.BudgetDetail;
import com.example.testpfe.bean.EntiteAdministrative;
import com.example.testpfe.vo.EntiteAdministrativeVo;

import java.util.List;

public interface EntiteAdministrativeService {

    EntiteAdministrative findByCode (String code);

    EntiteAdministrative findByLibelle (String libelle);

    EntiteAdministrative findByCodeAndLibelle (String code, String libelle);

    EntiteAdministrative save (EntiteAdministrative entiteAdministrative);

    EntiteAdministrative update (EntiteAdministrative entiteAdministrative);

    int deleteByLibelle (String libelle);

    int deleteByLibelle (List<EntiteAdministrative> entiteAdministratives);

    List<EntiteAdministrative> search (EntiteAdministrativeVo entiteAdministrativeVo);

    List<EntiteAdministrative> findAll () ;

}
