public class StackArray {
    int max = 5;
    int[] stack = new int[max];
    int top = -1;

    void push(int x) {
        if(top == max - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = x;
    }

    int pop() {
        if(top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    int peek() {
        if(top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return stack[top];
    }

    boolean isEmpty() {
        return top == -1;
    }

    void display() {
        for(int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackArray s = new StackArray();
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        System.out.println(s.pop());
        s.display();
        System.out.println(s.peek());
    }
}
