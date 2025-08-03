package Queue;

class QueueCircular {
    
    int size;
    int cap;
    int arr[];
    int front;

    QueueCircular(int x)
    {
        cap=x;
        size=0;
        arr=new int [x];
        front=0;
    }

    boolean isFull()
    {
        return (size==cap);
    }
    boolean isEmpty()
    {
        return (size==0);
    }

    int front(){
        if(isEmpty())
        return -1;

        else return front;
    }

    int rear(){
        if(isEmpty())
        return -1;

        else return (front +size -1)%cap;
    }

    public void enque(int i) {
      
        if (isFull()) 
            return;
        
            int rear=rear();
            rear=(rear+1)%cap;
        arr[rear]=i;
        size++;
    }

     public void deque() {
      if (isEmpty()) 
      return;

      front=(front+1)%cap;
      size--;
      
    }
}
public class circularArrayImplementation {
    
    public static void main(String[] args) {
        QueueCircular q=new QueueCircular(5);
        q.enque(1);
        q.enque(2);
        q.enque(3);
        q.deque();
        
    }
}
