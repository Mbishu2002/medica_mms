/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.medic_ms.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.medic_ms.entities.schedules;
import java.util.Optional;


/**
 *
 * @author PC
 */
@Repository("schRepository")
public interface schRespository extends CrudRepository<schedules, Integer> {
    public Iterable<schedules> saveAll(schedules data);
//    @Override
//    public Iterable<schedules> findAll();
//    public Optional<schedules> findById(int id);
    
}
