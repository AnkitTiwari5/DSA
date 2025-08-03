package LinkedList;

class Node{
    int data;
    Node next,prev=null;

    Node(int x)
    {
        this.data=x;
        next=null;
        prev=null;
    }
}

public class circularDoublyLLimplementation {

       private static Node insertFirst(Node head, int i) {
    
        Node temp=new Node(i);
        if (head==null) {
            temp.next=temp;
            temp.prev=temp;
            return temp;
        }

        temp.prev=head.prev;
        temp.next=head;
        head.prev.next=temp;
        head.prev=temp;
        return temp;
    }

    public static void main(String[] args) {
        Node head=new Node(5);
        Node temp1=new Node(10);
        Node temp2=new Node(15);

        head.next=temp1;
        head.prev=temp2;
        temp1.next=temp2;
        temp1.prev=head;
        temp2.prev=temp1;
        temp2.next=head;

        head=insertFirst(head,0);
    }

 
}
