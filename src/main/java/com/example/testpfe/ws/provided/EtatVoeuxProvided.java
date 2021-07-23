package com.example.testpfe.ws.provided;

import com.example.testpfe.Vo.EtatVoeuxVo;
import com.example.testpfe.bean.EtatVoeux;
import com.example.testpfe.service.facade.EtatVoeuxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EtatVoeuxProvided {
    @Autowired
    private EtatVoeuxService etatVoeuxService;

@PostMapping("/")
    public EtatVoeux save(@RequestBody EtatVoeux etatVoeux){
    return etatVoeuxService.save(etatVoeux);
}
@PutMapping("/")
    public EtatVoeux update(@RequestBody EtatVoeux etatVoeux){
    return etatVoeuxService.update(etatVoeux);
}
@GetMapping("/libelle/{libelle}")
    public EtatVoeux findByLibelle(@PathVariable String libelle){
    return  etatVoeuxService.findByLibelle(libelle);
}
@GetMapping("/code/{code}")
    public EtatVoeux findByCode(@PathVariable String code){
    return etatVoeuxService.findByCode(code);
}
@DeleteMapping("/code/{code}")
    public int deleteByCode(@PathVariable String code){
    return etatVoeuxService.deleteByCode(code);
}
@PostMapping("/search")
    public List<EtatVoeux> search(@RequestBody EtatVoeuxVo etatVoeuxVo){
    return etatVoeuxService.search(etatVoeuxVo);
}
@GetMapping("/")
    public List<EtatVoeux> findAll(){
    return etatVoeuxService.findAll();
}
}
