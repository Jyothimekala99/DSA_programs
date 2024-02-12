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

    //To insert element at middle position
    public static Node addMiddle(int data, Node head) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node slow = head;
            Node fast = head;
            while (fast.next != null && fast.next.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }
            Node newNode = new Node(data);
            newNode.next = slow.next;
            slow.next = newNode;
        }
        return head;
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

    //To delete the element at middle
    public static Node deleteMiddle(Node head) {
        Node temp = head;
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }

    // To delete the element at last
    public static void deleteLast() {
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;    
    }

    //To insert at given position
    public static Node addAtGivenPosition(int data, int pos, Node head) {
        Node temp = head;
        if (head == null) {
            head = new Node(data);
        } else {

            int count = 1;
            while (count != pos - 1) {
                count = count + 1;
                temp = temp.next;
            }
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    //Delete at certain position
    public static Node deleteAtGivenPosition(Node head, int pos) {
        Node temp = head;
        int count = 1;
        while (count != pos - 1) {
            count = count + 1;
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }



    //Delete K From last
    public static Node deleteKFromLast(Node head, int K) {
        Node fast = head;
        while (K != 0 && fast != null) {
            fast = fast.next;
            K--;
        }
        if (K != 0) {
            return head;
        }
        if (fast == null) {
            head = head.next;
            return head;
        }
        Node slow = head;
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    //Reverse of linkedlist
    public static Node reverseLinkedList(Node head) {
        Node prev = null;
        Node curr = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    //To sort colors
    public static Node sortColors(){
        Node zeroHead = new Node(-1);
        Node oneHead = new Node(-1);
        Node twoHead = new Node(-1);
        Node zero = zeroHead;
        Node one = oneHead;
        Node two=twoHead;
        Node temp = head;
        while(temp != null){
            if(temp.data == 0){
                zero.next = temp;
                zero = zero.next;
            }
            else if(temp.data == 1){
                one.next = temp;
                one = one.next;
            }
            else{
                two.next = temp;
                two = two.next;
            }
            temp = temp.next;
        }
        two.next = null;
        if(oneHead.next == null){
            zero.next = twoHead.next;
        }
        else{
            zero.next = oneHead.next;
        }
        one.next = twoHead.next;
        return zeroHead.next;
    }

    //To seggregate even odd
    public static Node evenOddSegregate() {
        Node evenHead = new Node(-1);
        Node oddHead = new Node(-1);
        Node even = evenHead;
        Node odd = oddHead;
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (index % 2 == 0) {
                even.next = temp;
                even = even.next;
            } else {
                odd.next = temp;
                odd = odd.next;
            }
            index++;
            temp = temp.next;
        }
        even.next = oddHead.next;
        return evenHead.next;
    }

    //Palindrom
    public static boolean palindrom(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node prev=null;
        Node curr=slow;
        Node next;
        //palindrom();
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node temp=head;
        while(temp!=null&& prev!=null){
            if(temp.data != prev.data) return false;
            temp=temp.next;
            prev=prev.next;;
        }
        return true;
    }


    public static void main(String[] args) {
        head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
         head.next.next.next=new Node(20);
        head.next.next.next.next=new Node(10);
        //head.next.next.next.next.next=new Node(10);
        // head=new Node(1);
        // head.next=new Node(0);
        // head.next.next=new Node(2);
        // head.next.next.next=new Node(0);
        // head.next.next.next.next=new Node(0);
        // head.next.next.next.next.next=new Node(1);
        // printLL(head);
        // addFirst(100);
        // printLL(head);
        // countNodes();
        // addMiddle(50,head);
        // printLL(head);
        // addLast(200);
        // printLL(head);
        // deleteFirst();
        // deleteMiddle(head);
        // deleteLast();
        // printLL(head);
        // addAtGivenPosition(400,5,head);
        // printLL(head);
        //  deleteAtGivenPosition(head,3);
        // printLL(head);
        // int K=1;
        // deleteKFromLast(head, K);
        // printLL(head);
        // head = reverseLinkedList(head);
        // printLL(head);
        // System.out.println("sorting the colors:");
        // head=sortColors();
        // printLL(head);
        // evenOddSegregate();
        // System.out.println("even odd segregate:");
        // printLL(head);
        //palindrom();
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
        System.out.println(palindrom());



    }  
        }