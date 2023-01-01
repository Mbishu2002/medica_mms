/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.medic_ms.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;
import com.example.medic_ms.entities.medUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.MimeTypeUtils;
import com.example.medic_ms.services.UserService;
//import org.springframework.http.HttpStatus;
import java.util.Optional;
/**
 *
 * @author PC
 */
@RestController
@RequestMapping("api/v1.0/user")
public class UserController {
    @Autowired
    private  UserService userService;
    @RequestMapping(value = "findAll", 
            method = RequestMethod.GET,
            produces = {MimeTypeUtils.APPLICATION_JSON_VALUE},
            headers = "Accept= application/json")
    public Iterable<medUser>findAll(){
          return userService.findAll();  
        }
    @PostMapping("/create")
    public int addUser(medUser user){
       return userService.addUser(user);
    }
//    @PutMapping("/update")
//    public int updateUser(int id, user user){
//        return userService.updateUser(id, user);
//    }
    @GetMapping("/find/{id}")
    public Optional<medUser>findById(int id){
        return userService.findById(id);
    }  
}
