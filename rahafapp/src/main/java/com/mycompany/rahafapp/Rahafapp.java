/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rahafapp;


import java.util.LinkedList;
import javax.swing.JFrame;

/**
 *
 * @author abdal
 */

public class Rahafapp {

    public static void main(String[] args) {

        ManagerVolunteers manager = new ManagerVolunteers();
       // LinkedList list = new LinkedList();
       welcomepage Welcomepage = new welcomepage();
       Welcomepage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       Welcomepage.setVisible(true);
       
    }
}
