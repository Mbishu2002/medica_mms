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
public class consultation implements Serializable{
    private int date;
    private int time;
    private String day;
    private String doctor;
    consultation(){}
    consultation(int date, int time, String day, String doctor){
        this.date = date;
        this.time = time;
        this.day = day;
        this.doctor = doctor;   
    }
    
    public int getDate(){
        return date;
    }
    public void setDate(int date){
        this.date = date;
    }
    public int getTime(){
        return time;
    }
    public void setTime(int time){
        this.time = time;
    }
    public String getDoctor(){
        return doctor;
    }
    public void setDoctor(String doctor){
        this.doctor = doctor;
    }
    public String getDay(){
        return day;
    }
    public void setDay(String day){
        this.day = day;
    }
    
}
