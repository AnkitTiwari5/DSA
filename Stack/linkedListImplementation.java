package Stack;

class Node{
    int data;
    Node next;

    Node(int x){
        this.data=x;
        next=null;
    }
}

class MyStack{
    Node head;
    int size;

    MyStack(){
        head=null;
        size=0;
    }

     int size(){
        return size;
    }

     public void push(int i) {
    
        Node temp=new Node(i);
        temp.next=head;
        head=temp;
        size++;
    }

    int pop (){
        if (head==null) 
        return -1;
        int res=head.data;
        head=head.next;
        size--;
        return res;
    }

    int peek(){
         if (head==null) 
        return -1;

        return head.data;
    }

}
public class linkedListImplementation {

    public static void main(String[] args) {

        MyStack s=new MyStack();
        s.push(1);
        s.push(5);
        System.out.println(s.pop());
        System.out.println(s.size());
    }
    
}
