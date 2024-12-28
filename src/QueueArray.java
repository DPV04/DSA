public class QueueArray {

    private int head,tail,size;
    private int [] arr;
    private int capacity;


    public QueueArray(int Capacity){
        head=0;
        tail=0;
        capacity=Capacity;
        size=0;
        arr=new int [capacity-1];

    }

    public void insertion(int data){
        arr[tail]=data;
        tail=(tail+1)%capacity;
        size++;

    }
    public int deletion (){
        int result;
        result =arr[head];
        head=(head+1)%capacity;
        size--;

        return result;
    }

    public int peek(){
        int result;
        result =arr[head];
        return result;
    }

    public boolean empty(){
        return (size==0);
    }

    public boolean full(){
        return (size==capacity);
    }


}
