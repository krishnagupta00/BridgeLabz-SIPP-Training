public class QueueArray {
    int max = 5;
    int[] queue = new int[max];
    int front = 0;
    int rear = -1;
    int size = 0;

    void enqueue(int x) {
        if(size == max) {
            System.out.println("Queue Full");
            return;
        }
        rear = (rear + 1) % max;
        queue[rear] = x;
        size++;
    }

    int dequeue() {
        if(size == 0) {
            System.out.println("Queue Empty");
            return -1;
        }
        int val = queue[front];
        front = (front + 1) % max;
        size--;
        return val;
    }

    int peek() {
        if(size == 0) {
            System.out.println("Queue Empty");
            return -1;
        }
        return queue[front];
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == max;
    }

    void display() {
        if(size == 0) {
            System.out.println("Queue Empty");
            return;
        }
        for(int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % max] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueArray q = new QueueArray();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.display();
        System.out.println(q.dequeue());
        q.display();
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
        System.out.println(q.isFull());
    }
}
