/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.medic_ms.services;

import com.example.medic_ms.entities.schedules;
import com.example.medic_ms.repositories.schRespository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC
 */
@Service
public class schServiceImpl implements schService {
    @Autowired
    private schRepository schRepository;
    @Override
    public Iterable<schedules>findAll(){
        //find user from dbmgt
        return schRepository.findAll();
    }
    schedules data;
    @Override
    public Iterable<schedules>addSch(){
        //add user function from databasemgt
        return schRepository.saveAll(data);
    }
    @Override
    public  Optional<schedules>findById(int id){
        return schRepository.findById(id);
    }
    
}
