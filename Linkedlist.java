import java.util.*;
public class Linkedlist {
    static class Node{
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    //To create linkedlist
    public static Node head;
    public static void printLL(Node head) {
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");    
    }

    // To insert the Element at first position
    public static void addFirst(int data){
       Node newNode = new Node(data);
       newNode.next=head;
       head = newNode;
    }

    // To count the nodes
    public static void countNodes(){
        Node temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        System.out.println(count);
    }  
   // To insert element at last position
   public static void addLast(int data){
    Node temp = head;
    while(temp.next != null){
        temp = temp.next;
    }
    Node newNode = new Node(data);
    temp.next = newNode;
   }

   // To delete the element at first
   public static void deleteFirst(){
    head = head.next;
    }

    // To delete the element at last
    public static void deleteLast() {
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;    
    }

    public static void main(String[] args) {
        head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(50);
        printLL(head);
        addFirst(100);
        printLL(head);
        countNodes();
        addLast(200);
        printLL(head);
        deleteFirst();
        deleteLast();
        printLL(head);
    
        }  

    }

    
    

