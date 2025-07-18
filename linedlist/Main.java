package linedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(2);
        list.insertStart(1);
        list.insertEnd(3);
        list.insertEnd(5);
        list.insertElem(3, 4);

        list.printList();
        list.removeNthFromEnd(2);
        System.out.println("after");
        list.printList();
    }

}
