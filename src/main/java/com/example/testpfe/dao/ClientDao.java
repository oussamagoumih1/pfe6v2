package com.example.testpfe.dao;

import com.example.testpfe.bean.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientDao extends JpaRepository<Client,Long> {
  Client findByCin(String cin);
  Client findByLogin(String login);

}
