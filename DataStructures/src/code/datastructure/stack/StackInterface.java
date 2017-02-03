package code.datastructure.stack;

/**
 * Created by archit.gupta on 1/6/17.
 */
public interface StackInterface {

    public Boolean isEmpty();

    public Boolean isFull();

    public void push(Object data);

    public Object peek();

    public Object pop();
}
