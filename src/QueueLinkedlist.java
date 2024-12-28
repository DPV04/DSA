import org.w3c.dom.Node;

import java.sql.SQLOutput;

public class QueueLinkedlist {


    private int size = 0;
    private ListNode  tail,front =null;

//    public QueueLinkedlist(){
//        size=0;
//        front=tail=null;
//
//    }

    public void enqueue(int data){
      ListNode node =  new ListNode(data);

      if(size==0){

          front = node;
          tail=node;
          size++;
      }
      else{
          tail.next=node;
          tail=tail.next;
          size++;

          ;
      }

    }

    public int dequeue(int data){
        int result = 0;
        if (size==0){
            System.out.println("it is empty there is nothing ");

        }
        else{
           result = front.data;
            front= front.next;
            size--;
        }
        return result;
    }

    public int getSize(){
        return size;
    }

    public int peek(){
        int result = 0;
        if(size==0){
            return -1;
        }
        else{
           result = front.data;
        }

        return  result;
    }




}
