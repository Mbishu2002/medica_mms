/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.medic_ms.entities;
import java.io.Serializable;

/**
 *
 * @author PC
 */
public class Result implements Serializable {
    private String disease;
    private int date;
    private String description;
    private String prescription;  
    Result(){}
    Result(String disease, int date, String description, String prescription){
        this.date = date;
        this.disease = disease;
        this.description = description;
        this.prescription = prescription;
    }
    public int getDate(){
        return date;
    }
    public void setDate(int date){
        this.date = date;
    }
    public String getDisease(){
        return disease;
    }
    public void setDisease(String disease){
        this.disease = disease;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getPrescription(){
        return prescription;
    }
    public void setPrescription(String prescription){
        this.prescription = prescription;
    }
    
    
    
}
