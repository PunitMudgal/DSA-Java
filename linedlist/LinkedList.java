package linedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print("->" + temp.value);
            temp = temp.next;
        }
        System.out.println();
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);

    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void insertEnd(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public void insertStart(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public void removeLast() {
        if (length == 0)
            return;

        Node temp = head;
        for (int i = 1; i < length - 1; i++) {
            temp = temp.next;
        }
        System.out.println("Temp in removeLast: " + temp.value);
        tail = temp;
        tail.next = null;
        length--;
    }

    public void removeFirst() {
        if (length == 0)
            return;
        Node temp = head.next;
        head.next = null;
        head = temp;
        length--;
    }

    // get a node at particular index
    public Node getElem(int index) {
        if (index < 0 || index >= length) {
            return null;
        }

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // insert a node at a particular index
    public boolean insertElem(int index, int value) {
        if (index < 0 || index >= length) {
            return false;
        }

        Node temp = head;
        Node newNode = new Node(value);
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        System.out.println("temp value: " + newNode.value);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    // remove an item at particular index
    public void removeElem(int index) {
        if (index < 0 || index >= length) {
            return;
        }

        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        temp.next = (temp.next).next;

        // if the removed node was tail
        if (temp.next == null) {
            tail = temp;
        }
        length--;
    }

    // reverse
    public void reverseList() {
        if (length == 0)
            return;

        Node temp = head.next;
        for (int i = 1; i < length; i++) {

        }
    }

    // find middle node in the linked list
    // without length attribute (you cannot use length function)
    // you also cannot calculate length.
    public int findMiddle() {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.value;
    }

    public int sizeOfList() {
        Node temp = head;
        int size = 0;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        System.out.println("size is: " + size);
        return size;
    }

    // remove nth from last
    public void removeNthFromEnd(int n) {
        if (n < 0 || n >= length) {
            return;
        }

        Node temp = head;
        int size = 0;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        for (int i = 0; i < (size - n); i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

}
