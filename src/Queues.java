public class Queues {


    public static void main(String[] args) {
        QueueArray l1 = new QueueArray(15);

        l1.insertion(5);
        l1.insertion(6);
        l1.insertion(7);
        System.out.println(l1.deletion());

        QueueLinkedlist l2 = new QueueLinkedlist();
        l2.enqueue(12);
        l2.enqueue(13);
        l2.enqueue(14);
        System.out.println(l2.getSize());
    }










}
