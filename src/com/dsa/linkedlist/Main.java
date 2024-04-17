package com.dsa.linkedlist;

import java.util.List;

public class Main {

    public static void main(String[] args) {

    LinkedList  ll = new LinkedList();
    ll.add(10);
    ll.add(20);
    ll.add(300);
    ll.add(300);
    ll.printLinkedList();
    System.out.println("After Delete a Node");
    ll.printLinkedList();

    }
}
