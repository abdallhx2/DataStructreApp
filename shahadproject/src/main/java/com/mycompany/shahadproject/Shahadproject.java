/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.shahadproject;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author abdal
 */
public class Shahadproject {

    public static void main(String[] args) {
                homepage  Homepage = new homepage();
                Homepage.setVisible(true); 
    }
}


 class DonorsList {
    private LinkedList<Donor> donorsLinkedList;
    private Queue<Donor> donorsQueue;
    private static DonorsList instance = null;

    public DonorsList() {
        donorsLinkedList = new LinkedList<>();
        donorsQueue = new LinkedList<>();
       FakeData();
    }
     
     
    public static DonorsList getInstance() {
        if (instance == null) {
            instance = new DonorsList();
        }
        return instance;
    }
    
    // Add a new donor to the list
    public void addDonor(Donor donor) {
        donorsLinkedList.add(donor);
        donorsQueue.add(donor);
    }
    
      public boolean searchByQueue(Donor donor) {
    return donorsQueue.contains(donor);
  
}
  
    public void removeDonor(Donor donor) {
        donorsLinkedList.remove(donor);
        donorsQueue.remove(donor);
    }
    
     // Get the list
           public Queue<Donor> getQueue() {
          return donorsQueue;
    }
    // Get the number of donors in the list
    public int getsize() {
        return donorsQueue.size();
    }

    // Get the number of donors with a specific blood type
    public int getType(String type) {
        int count = 0;
        for (Donor donor : donorsQueue) {
            if (donor.getBloodType().equals(type)) {
                count++;
            }
        }
        return count;
    }
    

    
    
    
    
      private void FakeData() {
        donorsLinkedList.add(new Donor("Ahmed", 22, 70, "A"));
        donorsLinkedList.add(new Donor("Sara",34,77 ,"A"));
        donorsLinkedList.add(new Donor("Shahad",43,70 ,"AB"));
        donorsLinkedList.add(new Donor("Fatimah",27,70, "O"));
        donorsQueue.add(new Donor("Ahmed", 22, 70, "A"));
        donorsQueue.add(new Donor("Sara",34,77 ,"A"));
        donorsQueue.add(new Donor("Shahad",43,70 ,"AB"));
        donorsQueue.add(new Donor("Fatimah",27,70, "O"));
    }
}
