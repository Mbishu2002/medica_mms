/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.medic_ms.repositories;

import com.example.medic_ms.entities.consultation;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


/**
 *
 * @author PC
 */
@Repository("conRepository")
public interface conRepository extends CrudRepository<consultation, Integer>{
    public Iterable<consultation> addCon(consultation data);
    @Override
    public Iterable<consultation> findAll();
    public Optional<consultation> findById(int id);
    
}
