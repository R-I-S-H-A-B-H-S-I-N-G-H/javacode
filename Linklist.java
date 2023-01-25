
import java.util.*;
import java.lang.*;
import java.io.*;

public class Linklist {
    Node head, tail;

    Linklist() {
        this.head = null;
        this.tail = null;
    }

    int front() {
        if (this.head == null)
            return -1;
        return this.head.val;
    }

    int back() {
        if (this.tail == null)
            return -1;
        return this.tail.val;
    }

    // adding
    void push(int val) {
        if (this.head == null && this.tail == null) {
            this.head = new Node(val);
            this.tail = this.head;
            return;
        }
        this.tail.next = new Node(val);
        this.tail = this.tail.next;
    }

    // for removing elements
    boolean pop(int n) {
        if (this.tail == null || this.getSize() < n)
            return false;
        if (n == 1) {
            this.head = this.head.next;
            return true;
        }
        Node prev = null, nxt = this.head.next, cur = this.head;
        while (--n != 0 && nxt != null) {
            prev = cur;
            cur = nxt;
            nxt = nxt.next;
        }
        prev.next = nxt;
        return true;
    }

    boolean pop() {
        return this.pop(1);
    }

    // get size
    int getSize() {
        int n = 0;
        Node itr = this.head;
        while (itr != null) {
            n++;
            itr = itr.next;
        }
        return n;
    }

    // display list

    // void display() {
    // Node itr = this.head;
    // while (itr != null) {
    // // System.out.print(itr);
    // System.out.print(itr.val);
    // itr = itr.next;
    // }
    // System.out.println("");
    // }

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

    // clear
    void clear() {
        this.head = this.tail = null;
    }

    // copy
    Linklist copy() {
        Linklist res = new Linklist();
        Node itr = this.head;
        while (itr != null) {
            res.push(itr.val);
            itr = itr.next;
        }
        return res;
    }

    // contains
    boolean contains(int val) {
        Node itr = this.head;
        while (itr != null) {
            if (itr.val == val)
                return true;
            itr = itr.next;
        }
        return false;
    }

    // to list
    Vector<Integer> toList() {
        Vector<Integer> res = new Vector<>();
        Node itr = this.head;
        while (itr != null) {
            res.add(itr.val);
            itr = itr.next;
        }
        return res;
    }

    // toset
    HashSet<Integer> toSet() {
        HashSet<Integer> res = new HashSet<>();
        Node itr = this.head;
        while (itr != null) {
            res.add(itr.val);
            itr = itr.next;
        }
        return res;
    }

    // reverse
    void reverse() {
        if (head == null || tail == null)
            return;
        Node cur = this.head, nxt = this.head.next, prev = null;
        while (nxt != null) {
            cur.next = prev;
            prev = cur;
            cur = nxt;
            nxt = nxt.next;

        }
        cur.next = prev;
        Node temp = this.head;
        this.head = this.tail;
        this.tail = temp;

    }

}
