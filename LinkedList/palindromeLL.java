package LinkedList;

import java.util.Stack;
class Node{
    char data;
    Node next=null;

    Node(char x){
        this.data=x;
        next=null;

    }
}

public class palindromeLL {
    public static void main(String[] args) {
        

        Stack<Character> stack = new Stack<>();
          Node head=null;
        Node temp1=new Node('G');
        Node temp2=new Node('F');
        Node temp3=new Node('G');
        head=temp1;
        temp1.next=temp2;
        temp2.next=temp3;

        for(Node curr=head;curr!=null;curr=curr.next)
        stack.push(curr.data);

         for(Node curr=head;curr!=null;curr=curr.next)
        { if (stack.pop()!=curr.data)
           { System.out.println("Not Palidnrome");
            return;
        }
        }

        System.out.println("Palindrome");

    }
}
