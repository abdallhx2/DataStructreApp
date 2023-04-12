/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shahadproject;

/**
 *
 * @author abdal
 */
public class Donor {
     String name;
     int age;
     int wight;
     String bloodType;
    
    // Constructor
    public Donor(String name, int age,int wight, String bloodType) {
        this.name = name;
        this.age = age;
        this.wight = wight;
        this.bloodType = bloodType;
    }
    
    public String getName() {
        return name;
    }
  
    
    public int getAge() {
        return age;
 
    }   
  
     public int getwight() {
        return wight;
    }

    public String getBloodType() {
        return bloodType;
    }
  
}
