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
    private String name;
    private int age;
    private String bloodType;
    
    // Constructor
    public Donor(String name, int age, String bloodType) {
        this.name = name;
        this.age = age;
        this.bloodType = bloodType;
    }
    
    // Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getBloodType() {
        return bloodType;
    }
    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }
}
