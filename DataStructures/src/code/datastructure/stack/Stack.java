package code.datastructure.stack;

/**
 * Created by archit.gupta on 1/5/17.
 */
public class Stack implements StackInterface {

    Integer[] data;
    int top;
    int size;

    public Stack(int size) {
        this.size = size;
        this.top = -1;
        this.data = new Integer[this.size];
    }

    @Override
    public Boolean isEmpty() {
        if (this.top == -1) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public Boolean isFull() {
        if (this.top == this.size - 1) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public void push(Object data) {
        if (this.top < this.size - 1) {
            this.data[++this.top] = (Integer) data;
            return;
        }
        System.out.println("Stack overflow.");
    }

    public Integer peek() {
        if (this.isEmpty()) {
            System.out.println("empty stack");
            return this.top;
        }
        return this.data[this.top];
    }

    public Integer pop() {
        if (isEmpty()) {
            System.out.println("underflow");
            return this.top;
        }
        int element = this.data[this.top];
        this.top--;
        return element;
    }
}
