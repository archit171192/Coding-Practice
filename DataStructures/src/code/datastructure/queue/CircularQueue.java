package code.datastructure.queue;

/**
 * Created by archit.gupta on 1/7/17.
 */
public class CircularQueue implements QueueInterface {

    private Integer[] data;
    private int front;
    private int rear;
    private int size;

    public CircularQueue(int size) {
        this.size = size;
        this.front = -1;
        this.rear = -1;
        this.data = new Integer[this.size];
    }

    @Override
    public void enqueue(Object element) {
        if (isFull()) {
            System.out.println("Queue overflow");
            return;
        }
        if (isEmpty()) {
            this.front = this.rear = 0;
        } else {
            this.rear = (this.rear + 1) % this.size;
        }
        this.data[this.rear] = (Integer) element;

    }

    @Override
    public Object dequeue() {
        if (isEmpty()) {
            System.out.println("Queue underflow");
            return null;
        }
        Integer element = this.data[this.front];
        this.data[this.front] = null;
        if (this.front == this.rear) {
            this.front = this.rear = -1;
            System.out.println("whole queue emptied by dequeue opertaions.");
        } else {
            this.front = (this.front + 1) % this.size;
        }
        return element;
    }

    @Override
    public Boolean isFull() {
        return (this.rear + 1) % this.size == this.front;
    }

    @Override
    public Boolean isEmpty() {
        return this.front == -1;
    }

    @Override
    public Object peek() {
        if (isEmpty()) {
            System.out.println("empty queue. Nothing to peek.");
            return null;
        }
        return this.data[this.front];
    }
}
