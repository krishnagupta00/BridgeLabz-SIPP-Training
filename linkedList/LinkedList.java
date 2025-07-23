class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node head;

    void add(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void addLast(int data) {
        add(data);
    }

    void remove(int key) {
        if(head == null) return;
        if(head.data == key) {
            head = head.next;
            return;
        }
        Node temp = head;
        while(temp.next != null && temp.next.data != key) {
            temp = temp.next;
        }
        if(temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    void removeFirst() {
        if(head != null) {
            head = head.next;
        }
    }

    void removeLast() {
        if(head == null || head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while(temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    boolean contains(int key) {
        Node temp = head;
        while(temp != null) {
            if(temp.data == key) return true;
            temp = temp.next;
        }
        return false;
    }

    int size() {
        int count = 0;
        Node temp = head;
        while(temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.addFirst(0);
        list.addLast(3);
        list.display();
        list.remove(2);
        list.removeFirst();
        list.removeLast();
        list.display();
        System.out.println(list.contains(1));
        System.out.println(list.size());
    }
}
