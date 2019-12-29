package code.datastructure.linkedlist;

public class ReverseLinkedList {

    public static void main(String [] args) {
        System.out.println("creating linked list");
        LinkedList linkedList = new LinkedList();
        linkedList.insert_first(1);
        linkedList.insert_first(2);
        linkedList.insert_first(3);
        linkedList.insert_first(4);
        linkedList.insert_first(5);
        linkedList.insert_first(6);
        linkedList.insert_first(7);
        linkedList.insert_first(8);
        linkedList.insert_first(9);
        linkedList.insert_first(10);

        linkedList.print();

        System.out.println("\n\nReversed linked list");
        linkedList.reverse();
        linkedList.print();

        System.out.println("\n\nReversed linked list in group of 3");
        linkedList.reverseGroupOfK(6);
        linkedList.print();


    }
}
