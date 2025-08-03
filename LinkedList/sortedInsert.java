package LinkedList;

import java.util.ArrayList;

class Node{
    int data;
    Node next=null;

    Node(int x)
    {
        this.data=x;
        next=null;
    }
}
public class sortedInsert {

    private static Node sortInsert(Node head, int i) {
       Node temp=new Node(i);
       if (head==null) 
       return temp;

       if (i<head.data) 
      { temp.next=head;
       return temp;
      }
       Node curr=head;

       while (curr.next.data<i && curr.next!=null) 
       curr= curr.next;
       temp.next=curr.next;
       curr.next=temp;

       return head;
    }

     private static void printMiddle(Node head) {

        if (head==null)
        return;

        Node curr;
        int count=0;
        for( curr=head;curr!=null;curr=curr.next)
        count++;

        curr=head;
        for (int i = 0; i < count/2; i++) 
            curr=curr.next;
        
        System.out.println(curr.data);

    }

    
    private static void printKthfromEnd(Node head,int k) {

        if (head==null)
        return;

        Node curr;
        int count=0;
        for( curr=head;curr!=null;curr=curr.next)
        count++;

        curr=head;
        for (int i = 0; i < count-k; i++) 
            curr=curr.next;
        
        System.out.println(curr.data);
    }


    private static Node reverseLL(Node head) {
    
        ArrayList<Integer> arr=new ArrayList<>();

        for(Node curr=head;curr!=null;curr=curr.next)
        arr.add(curr.data);

        for(Node curr=head;curr!=null;curr=curr.next)
        curr.data=arr.remove(arr.size()-1);
        return head;
    }

    
    private static Node efficientReverseLL(Node head) {
        Node curr=head;
        Node prev=null;
        while(curr!=null)
        {
            Node next =curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        return prev;
    }

     private static void removeDup(Node head) {
       
        Node curr=head;
        while (curr!=null && curr.next!=null) {
            if (curr.data==curr.next.data)                 
            curr.next=curr.next.next;

            else
            curr=curr.next;
            
        }
    }

     private static Node reverseK(Node head, int k) {
        Node curr=head;
        Node next = null,prev=null;
        int count=0;
        while(curr!=null && count<k)
        {
            next =curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
        }
        if (next!=null) {
           Node rest_head = reverseK(next, k);
           head.next=rest_head;
        }

        return prev;
    }

     private static boolean detectLoop(Node head) {
      Node slow_p=head,fast_p=head;

      while (fast_p!=null && fast_p.next!=null) {
        slow_p=slow_p.next;
        fast_p=fast_p.next.next;

        if (slow_p==fast_p) {
            return true;
        }
      }
      return false;
    }

     private static void removeLoop(Node head) {
      Node slow_p=head,fast_p=head;

      while (fast_p!=null && fast_p.next!=null) {
        slow_p=slow_p.next;
        fast_p=fast_p.next.next;

        if (slow_p==fast_p) 
            break ;
        
      }

      if (slow_p!=fast_p)       
      return;

      slow_p=head;

      while (slow_p.next!=fast_p.next) {
        slow_p=slow_p.next;
        fast_p=fast_p.next;
      }
      fast_p.next=null;
    }


     private static Node segregateNodes(Node head) {
       Node es=null,ee=null,os=null,oe=null;

       Node curr=head;
       for(curr=head;curr!=null;curr=curr.next)
       {
       int x=curr.data;

       if (x%2==0) 
        {
            if (es==null)
            es=ee=curr;
            else
            {
                ee.next=curr;
                ee=ee.next;
            }
        }
        else
        {
            if (os==null) 
            os=oe=curr;
            else{
                oe.next=curr;
                oe=oe.next;
            }
        }
       }
       

       if (os==null|| es==null) 
       return head;

       ee.next=os;
       oe.next=null;

       return es;
    }



    public static void main(String[] args) {
        Node head=null;
        Node temp1=new Node(5);
        Node temp2=new Node(15);
        Node temp3=new Node(20);
        head=temp1;
        temp1.next=temp2;
        temp2.next=temp3;

        head=sortInsert(head,10);

        printMiddle(head);
        printKthfromEnd(head,2);
        head = reverseLL(head);
        head=efficientReverseLL(head);
        removeDup(head);
        head=reverseK(head,3);

        boolean flag=detectLoop(head);
        removeLoop(head);
        head= segregateNodes(head);

        
        
        }

   

   
   


    



   

    
}
