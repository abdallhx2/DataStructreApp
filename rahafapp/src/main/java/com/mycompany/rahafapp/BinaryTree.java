package com.mycompany.rahafapp;


 public class BinaryTree<Volutreens> {
    Node root;

    public class Node {
        Volutreens data;
        Node left, right;

        Node(Volutreens data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public Node search(Volutreens data) {
        return search(root, data);
    }

    private Node search(Node node, Volutreens data) {
        if (node == null || node.data.equals(data)) {
            return node;
        }

        if (node.data.hashCode() < data.hashCode()) {
            return search(node.right, data);
        } else {
            return search(node.left, data);
        }
    }

    public void insert(Volutreens data) {
        root = insert(root, data);
    }

    private Node insert(Node node, Volutreens data) {
        if (node == null) {
            return new Node(data);
        }

        if (node.data.hashCode() < data.hashCode()) {
            node.right = insert(node.right, data);
        } else {
            node.left = insert(node.left, data);
        }

        return node;
    }

    public void modify(Volutreens oldData, Volutreens newData) {
        Node node = search(oldData);
        if (node != null) {
            node.data = newData;
        }
    }
}



