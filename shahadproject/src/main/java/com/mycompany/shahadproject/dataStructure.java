//
//import org.w3c.dom.Node;
//
//
//
////Linked List
//
//public class dataStructure{
//
//    
//    
//    
//}
//
//public class Node {
//  int data;
//  Node next;
//
//  public Node(int data) {
//    this.data = data;
//    this.next = null;
//  }
//}
//
//public class LinkedList<E> {
//
//    private int size;
//    private Node<E> first;
//    private Node<E> last;
//
//    public LinkedList() {
//        size = 0;
//        first = null;
//        last = null;
//    }
//
//    public void add(E element) {
//        Node<E> newNode = new Node<>(element);
//        if (size == 0) {
//            first = newNode;
//            last = newNode;
//        } else {
//            last.next = newNode;
//            last = newNode;
//        }
//        size++;
//    }
//
//    public void add(int index, E element) {
//        if (index < 0 || index > size) {
//            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
//        }
//        Node<E> newNode = new Node<>(element);
//        if (index == 0) {
//            newNode.next = first;
//            first = newNode;
//        } else if (index == size) {
//            last.next = newNode;
//            last = newNode;
//        } else {
//            Node<E> current = first;
//            for (int i = 0; i < index - 1; i++) {
//                current = current.next;
//            }
//            newNode.next = current.next;
//            current.next = newNode;
//        }
//        size++;
//    }
//
//    public E get(int index) {
//        if (index < 0 || index >= size) {
//            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
//        }
//        Node<E> current = first;
//        for (int i = 0; i < index; i++) {
//            current = current.next;
//        }
//        return current.data;
//    }
//
//    public E remove(int index) {
//        if (index < 0 || index >= size) {
//            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
//        }
//        Node<E> removedNode = null;
//        if (index == 0) {
//            removedNode = first;
//            first = first.next;
//            if (size == 1) {
//                last = null;
//            }
//        } else if (index == size - 1) {
//            Node<E> current = first;
//            for (int i = 0; i < index - 1; i++) {
//                current = current.next;
//            }
//            removedNode = last;
//            last = current;
//            last.next = null;
//        } else {
//            Node<E> current = first;
//            for (int i = 0; i < index - 1; i++) {
//                current = current.next;
//            }
//            removedNode = current.next;
//            current.next = removedNode.next;
//        }
//        size--;
//        return removedNode.data;
//    }
//
//    public boolean remove(Object o) {
//        if (o == null) {
//            for (Node<E> x = first; x != null; x = x.next) {
//                if (x.data == null) {
//                    unlink(x);
//                    return true;
//                }
//            }
//        } else {
//            for (Node<E> x = first; x != null; x = x.next) {
//                if (o.equals(x.data)) {
//                    unlink(x);
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//}
//
//  