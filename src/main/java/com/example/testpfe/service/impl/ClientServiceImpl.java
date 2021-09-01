package com.example.testpfe.service.impl;

import com.example.testpfe.bean.Client;
import com.example.testpfe.dao.ClientDao;
import com.example.testpfe.service.facade.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;


@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientDao clientDao;


    @Override
    public Client save(Client client) {
        client.setCreance(new BigDecimal(0));
        return clientDao.save(client);
    }


    @Override
    public Client edit(Client client) {
        Optional<Client> clientLoaded = clientDao.findById(client.getId());
        System.out.println("upd client " + client);
        System.out.println("upd clientLoaded " + clientLoaded);
        clientLoaded.get().setNom(client.getNom());
        clientLoaded.get().setAdresse(client.getAdresse());
        clientLoaded.get().setCin(client.getCin());
        clientLoaded.get().setTel(client.getTel());
        clientLoaded.get().setDescription(client.getDescription());

        System.out.println("upd 2 clientLoaded " + clientLoaded);
        return clientDao.save(clientLoaded.get());
    }

    @Override
    public Client findByNom(String nom) {
        return clientDao.findByNom(nom);
    }

    @Override
    public Client findByCin(String cin) {
        return clientDao.findByCin(cin);
    }

    @Override
    public Client findByTel(String tel) {
        return clientDao.findByTel(tel);
    }


    @Override
    public List<Client> findAll() {
        return clientDao.findAll();
    }

    public void deleteById(Long id) {
        clientDao.deleteById(id);
    }




    

    }


