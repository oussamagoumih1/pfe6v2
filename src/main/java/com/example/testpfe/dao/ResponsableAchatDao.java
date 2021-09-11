package com.example.testpfe.dao;
import com.example.testpfe.bean.ResponsableAchat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ResponsableAchatDao extends JpaRepository<ResponsableAchat,Long> {
    int deleteByCode (String code);
    Optional<ResponsableAchat> findById(Long id);
    ResponsableAchat findByCode(String code);

}