public class staack {

    private int size;
    private int top;
    private int [] arr;

    staack(int capacity){
        arr=new int [capacity-1];
        size= capacity;
        top=-1;
    }

    public void push(int value){
        if(top>size){
            System.out.println("STACKISFULL");
        }
        else {
            top++;
            arr[top]=value;

        }
    }
    public int pop (){
        int l =0;
        if(top==-1){
            System.out.println("stackis empty");

        }
        else{
             l = arr[top];
            arr[top]=0;
            top--;
        }

        return l;
    }

    public int sizeofst(){
        return top;
    }
}
