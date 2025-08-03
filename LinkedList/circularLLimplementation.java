package LinkedList;


class Node{
    int data;
    Node next;

    Node(int x){
        this.data=x;
        next=null;
    }
}
public class circularLLimplementation {

    private static void printList(Node head) {
      if (head==null) 
      return;

      System.out.print(head.data + " ");

      for(Node r=head.next;r!=head;r=r.next)
      System.out.print(r.data + " ");

      System.out.println();
    }

     private static Node insertFirst(Node head, int x) {

        Node temp=new Node(x);
        if (head==null) 
        temp.next=temp;

        else{
            Node curr=head;
            while (curr.next!=head) 
                curr=curr.next;
            
            curr.next=temp;
            temp.next=head;
        }

        return temp;
     }

      private static Node insertLast(Node head, int x) {

        Node temp=new Node(x);
        if (head==null) 
      {  temp.next=temp;
        return temp;
      }

        else{
             Node curr=head;
            while (curr.next!=head) 
            curr=curr.next;

            curr.next=temp;
            temp.next=head;

        }

         return head;
     }

      private static Node deleteFirst(Node head) {
       
        if (head==null || head.next==null)
        return null;
        Node curr=head;
        while (curr.next!=head) 
            curr=curr.next;
        
        curr.next=head.next;

        return curr.next;
    }

     private static Node deleteKth(Node head,int k) {
        if(head==null)
        return head;

        if(k==1)
        deleteFirst(head);

        Node curr=head;
        for (int i = 0; i < k-2; i++) 
        curr=curr.next;

        curr.next=curr.next.next;
        return head;
    }


    public static void main(String[] args) {
        Node head=new Node(1);
        Node temp1=new Node(2);
        Node temp2=new Node(3);
        Node temp3=new Node(4);

        head.next=temp1;
        temp1.next=temp2;
        temp2.next=temp3;
        temp3.next=head;

        printList(head);
        head=insertFirst(head,0);
        head=insertLast(head,5);
        printList(head);
        head=deleteFirst(head);
        head=deleteKth(head,3);
        printList(head);
    }

   
   

    
}
