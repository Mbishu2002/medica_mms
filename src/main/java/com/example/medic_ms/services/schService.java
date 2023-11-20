/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.medic_ms.services;

import com.example.medic_ms.entities.schedules;
import java.util.Optional;

/**
 *
 * @author PC
 */
public interface schService {
    Iterable<schedules> addSch();
    Iterable<schedules> findAll();
    Optional<schedules> findById(int id);   
}
