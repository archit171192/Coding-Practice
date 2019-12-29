package code.datastructure.linkedlist;

public class LinkedList implements LinkedListInterface<Node, Integer> {

    private Node head = null;

    @Override
    public void insert_first(Integer data) {
        Node<Integer> node = new Node(data);
        if(this.head != null) {
            node.setNext(this.head);
        }
        this.head = node;
    }


    @Override
    public void insert_last(Integer data) {

    }

    @Override
    public Integer delete_first(Node head) {
        return null;
    }

    @Override
    public Integer delete_last(Node head) {
        return null;
    }

    @Override
    public void print() {
        if(this.head == null) {
            System.out.println("Empty linked list");
            return;
        }

        Node temp = this.head;
        while(temp != null) {
            System.out.print(temp.getData() + " -> ");
            temp = temp.getNext();
        }
    }

    @Override
    public void reverse() {
        Node prev = null, temp = null, cur = this.head;
        while(cur != null) {
            temp = cur.getNext();
            cur.setNext(prev);
            prev = cur;
            cur = temp;
        }
        this.head = prev;
    }

    @Override
    public void reverseGroupOfK(int k) {
        if(k == 0 || k == 1) {
            return;
        }

        Node newHead;
        if(hasKNodes(this.head, k)) {
            newHead = getKthNode(this.head, k);
        } else {
            newHead = this.head;
        }

        Node cur = this.head;
        Node prev = null;
        Node oldHead = cur;
        while (cur != null && hasKNodes(cur, k)) {
            if(prev != null) {
                oldHead.setNext(getKthNode(cur, k));
                oldHead = cur;
            }
            prev = getKthNode(cur,k+1);
            int i = 0;
            Node temp;
            while (i < k) {
                temp = cur.getNext();
                cur.setNext(prev);
                prev = cur;
                cur = temp;
                i++;
            }
        }

        this.head = newHead;
    }

    @Override
    public boolean hasKNodes(Node head, int k) {
        if(k < 0) {
            throw new UnsupportedOperationException("k is less than 0");
        }

        Node temp = head;
        int i;
        for (i = 1; i < k && temp != null; i++) {
            temp = temp.getNext();
        }

        if(i == k && temp != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Node getKthNode(Node head, int k) {
        if (k < 0) {
            throw new UnsupportedOperationException("k is less than 0");
        }

        Node temp = head;
        int i;

        for(i = 1; i< k && temp != null; i++) {
            temp = temp.getNext();
        }

        if (i == k) {
            return temp;
        } else {
            return null;
        }
    }

}


class Node<D> {
    private D data;

    private Node<D> next;

    public Node (D data) {
        this.data = data;
        this.next = null;
    }

    public D getData() {
        return data;
    }

    public void setData(D data) {
        this.data = data;
    }

    public Node<D> getNext() {
        return next;
    }

    public void setNext(Node<D> next) {
        this.next = next;
    }
}
