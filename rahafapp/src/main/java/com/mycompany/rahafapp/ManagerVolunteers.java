package com.mycompany.rahafapp;

import java.util.Random;
import java.util.LinkedList;

class Volunteer {
    String name;
    String gender;
    String type;
    int age;
    int id;

    Volunteer(String name, String gender, String type, int age) {
        this.age = age;
        this.gender = gender;
        this.name = name;
        this.type = type;
        this.id = new Random().nextInt(9000) + 1000; // إضافة الرقم العشوائي المكوّن من 4 أرقام
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getType() {
        return type;
    }
     public int getID() {
        return id;
    }
}




public class ManagerVolunteers {
    private LinkedList<Volunteer> volunteerList;
     private static ManagerVolunteers info = null;

    public ManagerVolunteers() {
        volunteerList = new LinkedList<>();
        testData();
                
    }
  public static ManagerVolunteers getinfo() {
        if (info == null) {
            info = new ManagerVolunteers();
        }
        return info;
    }
    public void addVolunteer(Volunteer volunteer) {
        volunteerList.add(volunteer);
    }

    public boolean removeVolunteer(Volunteer volunteer) {
        return volunteerList.remove(volunteer);
    }


    public int getSize() {
        return volunteerList.size();
    }

    public LinkedList<Volunteer> getVolunteers() {
        return volunteerList;
    }
    public int getType(String type) {
    int count = 0;
    for (Volunteer volunteer : volunteerList) {
        if (volunteer.getType().equals(type)) {
            count++;
        }
      }
    return count;
  }
  
     private void testData() {
        volunteerList.add(new Volunteer("Eman", "Femele", "Social", 22));
        volunteerList.add(new Volunteer("Boshra","Femele","Relifaid" ,31));
        volunteerList.add(new Volunteer("Shahad","Femele","Educational" ,25));
        volunteerList.add(new Volunteer("Fatimah","Femele","Health", 18));
        volunteerList.add(new Volunteer("Ahmad", "Male", "Educational", 27));
        volunteerList.add(new Volunteer("Noura", "Female", "Environmental", 20));
        volunteerList.add(new Volunteer("Khalid", "Male", "Relief", 35));
        volunteerList.add(new Volunteer("Sara", "Female", "Educational", 29));
        volunteerList.add(new Volunteer("Abdullah", "Male", "Social", 24));
        volunteerList.add(new Volunteer("Hassan", "Male", "Educational", 19));
     }  

}