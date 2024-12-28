
import java.util.*;

public class StacksusingQueues {
private Queue<Integer> q1 = new LinkedList<>();
private Queue<Integer> q2 = new LinkedList<>();



    public void push(int x) {
        q1.add(x);

    }

    public int pop() {
        int i =0;
        while(i< q1.size()-1){
            q2.add(q1.remove());
            i++;
        }
        return q1.remove();

    }

    public int top() {
        return q1.peek();

    }

    public boolean empty() {
      return q1.isEmpty();
    }




}
