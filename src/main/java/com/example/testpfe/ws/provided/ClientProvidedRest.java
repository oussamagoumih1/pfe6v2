package com.example.testpfe.ws.provided;

import com.example.testpfe.bean.Client;
import com.example.testpfe.service.facade.ClientService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:4200")
@Api("Client ............")
@RestController
@RequestMapping("/pfe/client")
public class ClientProvidedRest {

    @Autowired
    private ClientService clientService;

    @ApiOperation("Cette methode permet de save Client")
    @PostMapping("/")
    public Client save(@RequestBody Client client) {
        return clientService.save(client);
    }

    @ApiOperation("Cette methode permet de modifier le Client")
    @PutMapping("/")
    public Client edit(@RequestBody Client client) {
        System.out.println("upd client Reste " + client);

        return clientService.edit(client);
    }

    @ApiOperation("Cette methode permet de find ClientByNom")
    @GetMapping("/")
    public List<Client> findAll() {
        return clientService.findAll();
    }

    @ApiOperation("Cette methode permet de find ClientByNom")
    @GetMapping("/nom/{nom}")
    public Client findByNom(@PathVariable String nom) {
        return clientService.findByNom(nom);
    }

    @ApiOperation("Cette methode permet de find ClientByCin")
    @GetMapping("/cin/{cin}")
    public Client findByCin(@PathVariable String cin) {
        return clientService.findByCin(cin);
    }

    @ApiOperation("Cette methode permet de find ClientByTel")
    @GetMapping("/tel/{tel}")
    public Client findByTel(@PathVariable String tel) {
        return clientService.findByTel(tel);
    }

    @ApiOperation("Cette methode permet de delete un Client")
    @DeleteMapping("/id/{id}")
    public void deleteById(@PathVariable Long id) {
        clientService.deleteById(id);
    }



}
