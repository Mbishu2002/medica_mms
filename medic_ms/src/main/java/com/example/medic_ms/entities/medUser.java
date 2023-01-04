/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.medic_ms.entities;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 *
 * @author PC
 */
@Entity
@EntityScan
@Table(name = "medUser")
public class medUser implements Serializable{
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String first_name;
    private String last_name;
    private String e_mail;
    private String password;
    medUser(){}
    medUser(String first_name, String last_name, String e_mail, String password){
        this.first_name = first_name;
        this.last_name = last_name;
        this.e_mail = e_mail;
        this.password = password;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getFirst(){
        return first_name;
    }
    public void setFirst(String first_name){
        this.first_name = first_name;
    }    
    public String getLast(){
        return last_name;
    }
    public void setId(String last_name){
        this.last_name = last_name;
    }    
    public String getMail(){
        return e_mail;
    }
    public void setMail(String e_mail){
        this.e_mail = e_mail;
    }
    public String getPass(){
        return password;
    }
    public void setPass(String password){
        this.password = password;
    }
}
