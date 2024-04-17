package com.dsa.linkedlist;

public class LinkedList {
    Node head;


    public void  add (int value ,int position){
        Node node = new Node(value ,null);
        if(position == 0){
            node.next = head;
            head =node;
            return;
        }
        Node prev =head;
        for(int i=0 ;i <position -1; i++){
            prev = prev.next;
        }
        node.next =prev.next;
        prev.next = node;

    }
    public void  add (int value){
        Node node = new Node(value ,null);
        if(null == head){
            head = node;
            return;
        }
        Node prev = head;
        while(prev.next !=null){
            prev =prev.next;
        }
        prev.next =node;
    }

    public void  delete(int position){

        if(position == 0){
            head = head.next;
            return;
        }
        Node dNode = head;
        for(int i=0;i <position-1;i++){
            dNode = dNode.next;
        }

        dNode.next =dNode.next.next;
    }

    public void printLinkedList(){
        Node curr = head;
        while(curr !=null){
            System.out.println(curr.value);
            curr = curr.next;
        }
    }

}
