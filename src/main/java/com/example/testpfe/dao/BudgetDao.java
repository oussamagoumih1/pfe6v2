package com.example.testpfe.dao;

import com.example.testpfe.bean.Budget;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BudgetDao extends JpaRepository <Budget ,Long> {

    Budget findByAnnee (Integer annee);

    Budget findByDescription(String description);


}
