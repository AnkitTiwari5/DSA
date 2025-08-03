package LinkedList;

class Node{
    int data;
    Node prev;
    Node next;

    Node(int i){
        this.data=i;
        next=null;
        prev=null;

    }
}

public class doublyLLimplementation {

     private static Node insertBegin(Node head, int i) {
       Node temp=new Node(i);
       temp.next=head;
       if (head!=null) 
        head.prev=temp;
       
        return temp;
    }

     private static Node insertEnd(Node head, int i) {
       Node temp=new Node(i);
       if (head==null) 
        return temp;

        Node curr=head;
        while (curr.next!=null) 
            curr=curr.next;

        curr.next=temp;
        temp.prev=curr;
        return head;
    }
    
     private static Node reverse(Node head) {
        if(head ==null || head.next==null)
        return head;

        Node curr=head,prev=null;

        while (curr!=null) {
            prev=curr.prev;
            curr.prev=curr.next;
            curr.next=prev;
            curr=curr.prev;
        }
        return prev.prev;
     }

       private static Node deleteFirst(Node head) {
       if(head ==null || head.next==null)
        return null;

        else
        {
            head=head.next;
            head.prev=null;
        }
        return head;
    }

     private static Node deleteLast(Node head) {
        Node curr=head;

       if(head ==null || head.next==null)
        return null;

    while (curr.next!=null) 
        curr=curr.next;
    
    curr.prev.next=null;
    return head;
    }
    public static void main(String[] args) {
        Node head=new Node(5);
        Node temp1=new Node(10);
        Node temp2=new Node(15);

        head.next=temp1;
        temp1.next=temp2;
        temp1.prev=head;
        temp2.prev=temp1;


        head=insertBegin(head,1);
        head=insertEnd(head,20);
        head=reverse(head);
        head=deleteFirst(head);
        head=deleteLast(head);

    }

  

   
}
