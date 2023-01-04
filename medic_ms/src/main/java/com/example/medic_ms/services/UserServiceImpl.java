/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.medic_ms.services;
import org.springframework.stereotype.Service;
import com.example.medic_ms.entities.medUser;
import com.example.medic_ms.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Optional;

/**
 *
 * @author PC
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;
    @Override
    public Iterable<medUser>findAll(){
        //find user from dbmgt
        return userRepository.findAll();
    }
    medUser user;
    @Override
    public Iterable<medUser>addUser(){
        //add user function from databasemgt
        return userRepository.saveAll(user);
    }
    @Override
    public  Optional<medUser>findById(int id){
        return userRepository.findById(id);
    }
//    public int updateUser(int id, medUser user){
//        return userRepository.save;
//    }
//    public int deleteUser(int id){
//        //delete function from backend
//        return userRepository.delete(entity);
//    }
    
}
