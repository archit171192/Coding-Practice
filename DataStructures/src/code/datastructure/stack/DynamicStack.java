package code.datastructure.stack;

/**
 * Created by archit.gupta on 1/6/17.
 */
public class DynamicStack implements StackInterface {

    private Node top;

    public DynamicStack() {
        System.out.println("Dynamic stack operations.");
    }

    @Override
    public Boolean isEmpty() {
        return top == null;
    }

    @Override
    public Boolean isFull() {
        System.out.println("dynamic stack is full only when heap is full.");
        return null;
    }

    @Override
    public void push(Object data) {
        Node node = new Node();
        node.setElement((Integer) data);
        node.setNext(this.top);
        this.top = node;
    }

    @Override
    public Object peek() {
        if (top == null) {
            System.out.println("Empty stack");
            return null;
        }
        return this.top.getElement();
    }

    @Override
    public Object pop() {
        if (this.top == null) {
            System.out.println("stack underflow.");
            return null;
        }
        Node temp = this.top;
        this.top = this.top.getNext();
        Integer data = temp.getElement();
        temp = null;
        return data;
    }
}

class Node {
    private Integer element;
    private Node next;

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

