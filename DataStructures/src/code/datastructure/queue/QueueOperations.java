package code.datastructure.queue;

import java.io.*;

/**
 * Created by archit.gupta on 1/6/17.
 */
public class QueueOperations {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int type = Integer.parseInt(reader.readLine());
        QueueInterface queue;
        if (type == 0) {
            queue = new Queue(2);
        } else if(type ==1){
            queue = new DynamicQueue();
        } else {
            queue = new CircularQueue(2);
        }
        System.out.println("queue initialized");
        queue.isEmpty();
        queue.peek();
        queue.isFull();
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.peek();
        queue.isFull();
        queue.isEmpty();
        queue.dequeue();
        queue.peek();
        queue.isEmpty();
        queue.isFull();
        queue.dequeue();
        queue.isEmpty();
        queue.dequeue();
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.peek();
        queue.isEmpty();
        queue.isFull();
    }

}
