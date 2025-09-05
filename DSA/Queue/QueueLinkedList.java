class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class QueueLinkedList {
    Node front, rear;

    void enqueue(int x) {
        Node newNode = new Node(x);
        if(rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    int dequeue() {
        if(front == null) {
            System.out.println("Queue Empty");
            return -1;
        }
        int val = front.data;
        front = front.next;
        if(front == null) rear = null;
        return val;
    }

    int peek() {
        if(front == null) {
            System.out.println("Queue Empty");
            return -1;
        }
        return front.data;
    }

    boolean isEmpty() {
        return front == null;
    }

    void display() {
        Node temp = front;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueLinkedList q = new QueueLinkedList();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        System.out.println(q.dequeue());
        q.display();
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
    }
}
