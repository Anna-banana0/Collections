package generic;

public class QueueImpl {
    public static void main(String[] args) {
        GenericQueue<Integer> q = new GenericQueue<>();

        q.enqueue(10);
        q.showList();
        q.dequeue();
        q.showList();
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.showList();
        q.dequeue();
        q.dequeue();
        q.showList();
        q.dequeue();
        q.showList();
    }
}
