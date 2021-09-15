package com.example.testpfe.dao;

import com.example.testpfe.bean.Reception;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceptionDao extends JpaRepository<Reception, Long> {
    public Reception findByReference(String reference);

    public int deleteByReference(String reference);
}
