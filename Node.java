
public class Node {
    int val;
    Node next;

    Node(int v) {
        this.val = v;
        this.next = null;
    }

    @Override
    public String toString() {
        return this.val + " , ";
    }
}