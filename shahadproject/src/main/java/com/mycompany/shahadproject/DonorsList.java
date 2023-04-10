/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shahadproject;

/**
 *
 * @author abdal
 */
import java.util.LinkedList;
import java.util.Queue;

public class DonorsList {
    private LinkedList<Donor> donorsLinkedList;
    private Queue<Donor> donorsQueue;
    
    // Constructor
    public DonorsList() {
        donorsLinkedList = new LinkedList<>();
        donorsQueue = new LinkedList<>();
    }
    
    // Add a new donor to the list
    public void addDonor(Donor donor) {
        donorsLinkedList.add(donor);
        donorsQueue.add(donor);
    }
    
    // Remove a donor from the list
    public void removeDonor(Donor donor) {
        donorsLinkedList.remove(donor);
    }
    
    // Get the list of donors as linkedlist
    public LinkedList<Donor> getDonorsLinkedList() {
        return donorsLinkedList;
    }
    
    // Get the list of donors as queue
    public Queue<Donor> getDonorsQueue() {
        return donorsQueue;
    }
}