package code.datastructure.linkedlist;

public interface LinkedListInterface<T, D> {

    public void insert_first(D node);

    public void insert_last(D node);

    public D delete_first(T head);

    public D delete_last(T head);

    public void print();

    public void reverse();

    public void reverseGroupOfK(int k);

    public boolean hasKNodes(T head, int k);

    public T getKthNode(T head, int k);

}
