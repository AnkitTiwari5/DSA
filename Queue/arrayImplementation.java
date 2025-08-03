package Queue;

class Queue{
    int size;
    int cap;
    int arr[];

    Queue(int x)
    {
        cap=x;
        size=0;
        arr=new int [x];
    }

    boolean isFull()
    {
        return (size==cap);
    }
    boolean isEmpty()
    {
        return (size==0);
    }

    public void enque(int i) {
      
        if (isFull()) 
            return;
        
        arr[size]=i;
        size++;
    }

     public void deque() {
      if (isEmpty()) 
      return;

      for (int i = 0; i < size-1; i++) {
        arr[i]=arr[i+1];
        size--;
      }
    }
}
public class arrayImplementation {
    
    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.enque(1);
        q.enque(2);
        q.enque(3);
        q.deque();
        
    }
}
