package com.mycompany.rahafapp;

// LinkedList.java

 public class LinkedList<Volutreens> {
    private Node head;
    private int size;

    private class Node {
        Volutreens data;
        Node next;

        Node(Volutreens data) {
            this.data = data;
            next = null;
        }
    }

    public void add(Volutreens data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public void remove(Volutreens data) {
        if (head == null) {
            return;
        }

        if (head.data.equals(data)) {
            head = head.next;
            size--;
            return;
        }

        Node current = head;
        while (current.next != null && !current.next.data.equals(data)) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
            size--;
        }
    }

    public int getSize() {
        return size;
    }
}

