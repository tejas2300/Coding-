import java.util.Scanner;

class Node {
    int data = 0;
    Node next = null;

    Node() {
        data = 0;
        next = null;

    }

    Node(int d, Node n) {
        data = d;
        next = n;
    }

    public void setData(int d) {
        data = d;
    }

    public void setNext(Node n) {
        next = n;
    }

    public int getdata() {
        return (data);

    }

    public Node getNext() {
        return (next);
    }
}

class Linkedlist {
    private int size;
    private Node start;

    Linkedlist() {
        start = null;
        size = 0;
    }

    public boolean isEmpty() {
        if (start == null)
            return (true);
        else
            return (false);
    }

    public int getListSize() {
        return (size);
    }

    public void ViewClass() {
        Node t;
        t = start;
        if (isEmpty())
            System.out.println("List is Empty");
        else {
            for (int i = 1; i <= size; i++) {
                System.out.println(" " + t.getdata());
                t = t.getNext();
            }

        }

    }

    public void insertAtStart(int val) {
        Node n;
        n = new Node();
        n.setData(val);
        n.setNext(start);
        start = n;
        size++;
    }
}

public class Sll {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Linkedlist list = new Linkedlist();

        // System.out.println("Enter the value");
        // int val = s.nextInt();
        list.insertAtStart(3);
        list.insertAtStart(4);
        list.insertAtStart(5);
        list.insertAtStart(6);
        list.ViewClass();
    }

}
