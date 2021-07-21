package generic;

import java.util.ArrayList;
import java.util.List;

public class GenericQueue<T> {

    int front = -1;
    int rear = -1;

    List<T> list = new ArrayList<T>();

    void enqueue(T t) {              // front stays the same, rear keeps incrementing
        if (list.isEmpty()) {         // if storing the 1st element
            front = 0;              // store element at 0th index
            rear = 0;               // front=rear cause 1st element
            list.add(t);
            System.out.println("enqueued " + t);
            System.out.println("Front = " + front + " rear= " + rear);
        } else {
            rear++;                 // element added when rear incremented
            list.add(t);
            System.out.println("enqueued " + t.toString());
            System.out.println("Front = " + front + " rear= " + rear);
        }
    }

    void dequeue() {
        if (list.isEmpty()) {        // if queue is empty
            System.out.println("Queue is empty.");
        } else if (front == rear) {     // only 1 element left
            System.out.println(list.get(0) + " dequeued");
            list.remove(0);

            rear = front = -1;

            System.out.println("Front = " + front + " rear= " + rear);


        } else {
            System.out.println(list.get(0) + " dequeued");
            list.remove(0);
            front++;
            System.out.println("Front = " + front + " rear= " + rear);

        }
    }

    void showList() {
        if (list.isEmpty()) {
            System.out.println("No elements in the queue");
        } else {
//            for(int i=front; i<=rear; i++){
//                    System.out.print(" "+list.get(i));
//                System.out.print();
//            }
            System.out.print("Elements in queue [");
            for (int i = 0; i < list.size(); i++) {
                System.out.print(" " + list.get(i));
            }
            System.out.println("]");
            System.out.println("Front = " + front + " rear= " + rear);
        }
    }
}
