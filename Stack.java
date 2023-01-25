public class Stack {
    Node head, tail;
    int len;
    int min;

    Stack() {
        this.min = Integer.MAX_VALUE;
        this.len = 0;
        this.head = this.tail = null;
    }

    int getMin() {
        return this.min;
    }

    void push(int val) {
        if (this.len == 0)
            this.min = val;
        if (val < this.min) {
            int temp_val = val;
            val = 2 * val - this.min;
            this.min = temp_val;
        }
        this.len++;
        if (this.head == null) {
            this.head = this.tail = new Node(val);
            return;
        }
        Node node = new Node(val);
        node.next = this.head;
        this.head = node;
    }

    void pop() {
        if (this.head == null)
            return;
        // for min
        if (this.min > this.head.val) {
            this.min = 2 * this.min - this.head.val;
        }
        this.len--;
        this.head = this.head.next;
        if (this.head == null)
            this.tail = null;
    }

    @Override
    public String toString() {
        String res = "";
        Node itr = this.head;
        while (itr != null) {
            res += itr.toString();
            itr = itr.next;
        }
        return res;
    }

}
