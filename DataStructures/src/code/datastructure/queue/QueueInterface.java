package code.datastructure.queue;

/**
 * Created by archit.gupta on 1/6/17.
 */
public interface QueueInterface {

    public void enqueue(Object element);

    public Object dequeue();

    public Boolean isFull();

    public Boolean isEmpty();

    public Object peek();
}
