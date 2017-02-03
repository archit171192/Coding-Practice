package code.datastructure.queue;

/**
 * Created by archit.gupta on 1/6/17.
 */
public class Queue implements QueueInterface {

    private Integer[] data;

    private int front;

    private int rear;

    private int size;

    public Queue(int size) {
        this.size = size;
        this.front = -1;
        this.rear = -1;
        this.data = new Integer[this.size];
    }

    @Override
    public void enqueue(Object element) {
        if (this.rear == this.size - 1) {
            System.out.println("Queue overflow.");
            return;
        }
        if(this.front == -1) {
            ++this.front;
        }
        this.data[++this.rear] = Integer.parseInt(String.valueOf(element));
        return;
    }

    @Override
    public Object dequeue() {
        if(this.front == -1) {
            System.out.println("queue unerflow");
            return null;
        }
        Integer element = this.data[this.front];
        this.data[this.front] = null;
        this.front++;
        if(this.front == this.size) {
            this.front = this.rear = -1;
            System.out.println("whole queue emptied by dequeue opertaions.");
        }
        return element;
    }

    @Override
    public Boolean isFull() {
        return (this.rear == this.size - 1);
    }

    @Override
    public Boolean isEmpty() {
        return this.front == -1;
    }

    @Override
    public Object peek() {
        if (isEmpty()) {
            System.out.println("empty queue");
            return null;
        }
        return this.data[this.front];
    }
}
