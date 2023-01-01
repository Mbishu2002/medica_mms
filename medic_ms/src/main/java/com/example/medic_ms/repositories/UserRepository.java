/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.medic_ms.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.medic_ms.entities.medUser;

/**
 *
 * @author PC
 */
@Repository("userRepository")
public interface UserRepository extends CrudRepository<medUser, Integer> {
    
    
}
