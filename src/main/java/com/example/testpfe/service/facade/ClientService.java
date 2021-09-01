package com.example.testpfe.service.facade;

import com.example.testpfe.bean.Client;
import com.example.testpfe.bean.Paiement;


import java.util.List;

public interface ClientService {

    Client findByNom(String nom);

    Client findByCin(String cin);

    Client findByTel(String tel);

    Client edit(Client client);

    Client save(Client client);

    List<Client> findAll();

    void deleteById(Long id);



}
