package com.example.testpfe.ws.provided;

import com.example.testpfe.Vo.TypePaiementVo;
import com.example.testpfe.bean.TypePaiement;
import com.example.testpfe.service.facade.TypePaiementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TypePaiementProvided {
    @Autowired
    private TypePaiementService typePaiementService;
@PostMapping("/")
    public TypePaiement save(@RequestBody TypePaiement typePaiement){
    return typePaiementService.save(typePaiement);
}
@PutMapping("/")
    public TypePaiement update(@RequestBody TypePaiement typePaiement){
    return typePaiementService.update(typePaiement);
}
@PostMapping("/search")
    public List<TypePaiement> search(@RequestBody TypePaiementVo typePaiementVo){
    return typePaiementService.search(typePaiementVo);
}
@GetMapping("/")
    public List<TypePaiement> findAll(){
    return typePaiementService.findAll();
}
@GetMapping("/ref/{ref}")
    public TypePaiement findByRef(@PathVariable String ref){
    return typePaiementService.findByRef(ref);
}
@GetMapping("/libelle/{libelle}")
    public TypePaiement findByLibelle(@PathVariable String libelle){
    return typePaiementService.findByLibelle(libelle);
}
@DeleteMapping("/ref/{ref}")
    public int deleteByRef(@PathVariable String ref){
    return typePaiementService.deleteByRef(ref);
}
@DeleteMapping("/libelle/{libelle}")
    public int deleteByLibelle(@PathVariable String libelle){
   return typePaiementService.deleteByLibelle(libelle);
}
}
