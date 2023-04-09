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

    public Volunteer searchVolunteer(String name) {
        for (Volunteer volunteer : volunteerList) {
            if (volunteer.getName().equals(name)) {
                return volunteer;
            }
        }
        return null;
    }

    public int getVolunteersSize() {
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
    public void modifyVolunteer(Volunteer oldData, Volunteer newData) {
        BinaryTree<Volunteer> volunteerTree = new BinaryTree<>();
        for (Volunteer volunteer : volunteerList) {
            volunteerTree.insert(volunteer);
        }
        volunteerTree.modify(oldData, newData);
        volunteerList = new LinkedList<>();
        Node node = inorderTraversal(volunteerTree.root);
        while (node != null) {
            volunteerList.add(node.data);
            node = node.next;
        }
    }

    private Node inorderTraversal(BinaryTree.Node node) {
        if (node == null) {
            return null;
        }

        Node left = inorderTraversal(node.left);
        Node current = new Node((Volunteer) node.data);
        Node right = inorderTraversal(node.right);

        if (left != null) {
            left.next = current;
        }
        current.next = right;

        return left != null ? left : current;
    }

    int removeVolunteers(String type, Object Vnumber) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static class Node {
        Volunteer data;
        Node next;

        Node(Volunteer data) {
            this.data = data;
        }
    }
}
