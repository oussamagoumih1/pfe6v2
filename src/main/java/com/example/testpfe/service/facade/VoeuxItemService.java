package com.example.testpfe.service.facade;

import com.example.testpfe.Vo.VoeuxItemVo;
import com.example.testpfe.bean.Produit;
import com.example.testpfe.bean.VoeuxItem;

import java.math.BigDecimal;
import java.util.List;

public interface VoeuxItemService {
    VoeuxItem save(VoeuxItem voeuxItem);

    VoeuxItem update(VoeuxItem voeuxItem);

    List<VoeuxItem> findByProduit(Produit produit);

    VoeuxItem findByQteDemande(BigDecimal qteDemande);

    VoeuxItem findByQteAccorde(BigDecimal qteAccorde);

    VoeuxItem findByQteCommande(BigDecimal qteCommande);

    VoeuxItem findByQteReceptionne(BigDecimal qteReceptionne);

    VoeuxItem findByQteLivre(BigDecimal qteLivre);

    List<VoeuxItem> findByVoeuxReference(String reference);

    int deleteByQteCommande(BigDecimal qteCommande);

    int deleteByQteLivre(BigDecimal qteLivre);

    List<VoeuxItem> search(VoeuxItemVo voeuxItemVo);

    List<VoeuxItem> findAll();

    int qteExpd(BigDecimal qteCommande, BigDecimal qteLivre);

}
