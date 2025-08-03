package Dequeue;


class Dequeue{
    int size;
    int cap;
    int arr[];

    Dequeue(int x)
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

    public void insertRear(int i) {
      
        if (isFull()) 
            return;
        
        arr[size]=i;
        size++;
    }

    public void deleteRear(){
        if (isEmpty())
        return;
        size--;
    }

    public int getRear(){
         if (isEmpty())
        return -1;
       
       else return (size-1);
    }


      public void insertFront(int i) {
      
        if (isFull()) 
            return;

        for (int j = size-1; j >0; j--) {
                arr[j+1]=arr[j];
            }

            arr[0]=i;
            size++;
      }


     public void deleteFront() {
      if (isEmpty()) 
      return;

      for (int i = 0; i < size-1; i++) {
        arr[i]=arr[i+1];
        size--;
      }
    }

     public int getFront(){
         if (isEmpty())
        return -1;
       
       else return 0;
    }
}


public class arrayImplementation {
    public static void main(String[] args) {
        
        Dequeue q=new Dequeue(5);
       
    }
}
