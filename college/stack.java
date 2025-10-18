class stack {
    int top;
    int s[] = new int[5];

    stack() {
        top = -1;
    }

    void push(int item) {
        if (top == s.length - 1) {
            System.out.println("Stack overflow");
        } else {
            top++;
            s[top] = item;
            System.out.println(item + " pushed into stack");
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
        } else {
            int item = s[top];
            System.out.println("Item popped: " + item);
            top--;
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty, no items to display");
        } else {
            System.out.println("Items in stack are:");
            for (int i = top; i >= 0; i--) {
                System.out.println(s[i]);
            }
        }
    }
}
