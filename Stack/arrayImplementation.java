package Stack;

class MyStack{
    int arr[];
    int top;
    int cap;

    MyStack(int cap)
    {
        top=-1;
        this.cap=cap;
        arr=new int[cap];
    }

    public void push(int i) {
    
       if (top==cap-1) 
       {
        System.out.println("Stack overflow");
        return;
       }
       top++;
       arr[top]=i;
    }

    public int pop() {
       if (top==-1) 
       {
        System.out.println("Stack underflow");
        return -1;
       }
       int res=arr[top];
       top--;
       return res;

    }

    int size(){
        return top+1;
    }
    public int peek() {
    if (top == -1) {
        System.out.println("Stack is empty");
        return -1;
    }
    return arr[top];
}

}

public class arrayImplementation {

    public static void main(String[] args) {

        MyStack s=new MyStack(5);
        s.push(1);
        s.push(5);
        System.out.println(s.pop());
        System.out.println(s.size());

        
        

    }
}