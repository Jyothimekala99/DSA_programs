import java.util.*;
public class DoubleLinkedList {
    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int d) {
            data = d;
            next = null;
            prev = null;
        }
    }
    public static Node head;
    public static void printDLL(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.print("null");
    }

    //To reverse 
    public static Node reverseDLL(Node head){
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            prev=curr.prev;
            curr.prev=curr.next;
            curr.next=prev;
            curr=curr.prev;
        }
        return prev.prev;
    }
    
    //palindrome
    public static boolean palindrome(){
        Node right = head;
        Node left = head;
        while(right.next!=null){
            right=right.next;
        }
        while(left!=right && left.prev!=right){
            if(left.data!=right.data) return false;
            left = left.next;
            right = right.prev;
        }
        return true;
    }

    //remove Duplicates
    public static Node removeDuplicates(Node head){
        if(head==null || head.next==null) return head;
        Node left = head;
        Node right = head.next;
        while(right!=null){
            if(left.data!=right.data){
                left.next=right;
                right.prev=left;
                left=left.next;
            }
            right=right.next;
        }
        if(left.next!=null) left.next.prev=null;
        left.next=null;
        return head;
    }
    public static void main(String[] args) {
        // head=new Node(1);
        // head.next=new Node(2);
        // head.next.next=new Node(1);
        // head.next.next.next=new Node(4);
        // head.next.next.next.next=new Node(1);
        // head.next.prev=head;
        // head.next.next.prev=head.next;
        // head.next.next.next.prev=head.next.next;
        // head.next.next.next.next.prev=head.next.next.next;
        head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(2);
        head.next.next.next=new Node(3);
        head.next.next.next.next=new Node(3);
        head.next.next.next.next.next=new Node(4);
        head.next.next.next.next.next.next=new Node(5);
        head.next.prev=head;
        head.next.next.prev=head.next;
        head.next.next.next.prev=head.next.next;
        head.next.next.next.next.prev=head.next.next.next;
        head.next.next.next.next.next.prev=head.next.next.next.next;
        head.next.next.next.next.next.next.prev=head.next.next.next.next.next;
        //head.next.next.next.next.next.next.next.prev=head.next.next.next.next.next.next;
        //printDLL();
        // head=reverseDLL(head);
        // printDLL();
        //System.out.println(palindrome());
        //printDLL();
        head=removeDuplicates(head);
        printDLL();

    }
}
        