package LinkedList;
class Node{
    int data;
    Node next;

    Node(int x)
    {
        this.data=x;
        next=null;
    }
}

public class simpleLLimplementation{

    private static void printList(Node head) {
        Node curr =head;
        while (curr!=null) {
            System.out.print(curr.data + " ");
            curr=curr.next;
        }
        System.out.println();
    }

     private static void recprintList(Node head) {
    
        if (head==null) 
        return;
        System.out.print(head.data + " ");
        recprintList(head.next);
         System.out.println();
        
    }

      private static Node insertBegin(Node head, int i) {
       Node temp =new Node(i);
       temp.next=head;
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
        return head;
        
    }

     private static Node insertPos(Node head, int data, int pos) {
       Node temp=new Node(data);

       if (pos==1) {
        temp.next=head;
        return temp;
       }
       Node curr=head;
       for (int i = 1; i <= pos-2 && curr!=null; i++) 
        curr=curr.next;
       
        if (curr==null) 
            return head;
        
    temp.next=curr.next;
    curr.next=temp;
    return head;
    }

     private static Node deleteFirst(Node head) {
      if (head==null) 
      return null;

      else
        return head.next;
    }

      private static Node deleteLast(Node head) {
        if (head==null) 
        return null;

        if (head.next==null) 
        return null;

        
        Node curr=head;
        while (curr.next.next!=null) 
            curr=curr.next;

        curr.next=null;
        return head;
    }


      private static void search(Node head, int i) {
        boolean flag=false;
        int pos=1;
        Node curr=head;
        while (curr!=null) {
            if (curr.data==i) 
            {    System.out.println("found at " + pos );
            flag=true;
                 break;
        }

        
        else
        {
            curr=curr.next;
            pos++;
        }
        }
        if (!flag) 
        System.out.println("Not found");
    }

    public static void main(String[] args) {
        Node head=null;
        Node temp1=new Node(10);
        Node temp2=new Node(55);
        Node temp3=new Node(44);
        head=temp1;
        temp1.next=temp2;
        temp2.next=temp3;

        head=insertBegin(head,5);
        head=insertEnd(head,100);
        head=insertPos(head,11,2);
        head=deleteFirst(head);
        head=deleteLast(head);

        printList(head);
        recprintList(head);

        search(head,44);
    }
   
}