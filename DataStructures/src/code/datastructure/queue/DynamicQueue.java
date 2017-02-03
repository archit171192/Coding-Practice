package code.datastructure.queue;

/**
 * Created by archit.gupta on 1/7/17.
 */
public class DynamicQueue implements QueueInterface {

    Node front;
    Node rear;

    @Override
    public void enqueue(Object element) {
        Node node = new Node((Integer) element);
        if (isEmpty()) {
            this.front = this.rear = node;
            return;
        }
        this.rear.setNext(node);
        this.rear = node;
    }

    @Override
    public Object dequeue() {
        if (isEmpty()) {
            System.out.println("queue unerflow");
            return null;
        }
        Node temp = this.front;
        if(this.front == this.rear) {
            this.front = this.rear = null;
            System.out.println("whole queue emptied by dequeue opertaions.");
            return null;
        }
        this.front = this.front.getNext();
        Integer element = temp.getElement();
        temp = null;
        return element;
    }

    @Override
    public Boolean isFull() {
        System.out.println("Dynamic queue is never full.");
        return Boolean.FALSE;
    }

    @Override
    public Boolean isEmpty() {
        return this.front == null;
    }

    @Override
    public Object peek() {
        if (isEmpty()) {
            System.out.println("empty queue");
            return null;
        }
        return this.front.getElement();
    }
}

class Node {

    Integer element;
    Node next;

    public Node(Integer element) {
        this.element = element;
    }

    public Integer getElement() {
        return element;
    }

    public void setElement(Integer element) {
        this.element = element;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
