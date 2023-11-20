/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.medic_ms.services;
import com.example.medic_ms.entities.medUser;
import java.util.Optional;

/**
 *
 * @author PC
 */
public interface UserService {
    Iterable<medUser> findAll();
    Iterable<medUser> addUser();
    Optional<medUser>findById(int id);
//    int deleteUser(int id);
//    int updateUser(int id, medUser user);
    
}
