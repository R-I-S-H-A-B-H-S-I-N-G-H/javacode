public class Queue {
    Node head, tail;
    int len;

    Queue() {
        this.head = tail = null;
        this.len = 0;
    }

    void push(int val) {
        this.len++;
        if (this.head == null || this.tail == null) {
            this.head = this.tail = new Node(val);
            return;
        }
        this.tail.next = new Node(val);
        this.tail = this.tail.next;
    }

    void pop() {
        if (this.head == null || this.tail == null)
            return;
        this.len--;
        this.head = this.head.next;
        if (this.head == null)
            this.tail = null;
    }

    int top() {
        if (this.head == null)
            return -1;

        return this.head.val;
    }

    int size() {
        return this.len;
    }
}
