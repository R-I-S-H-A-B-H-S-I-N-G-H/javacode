import java.util.HashSet;

public class test {
    public static void main(String[] args) {
        // Linklist ll = new Linklist();
        // ll.push(1);
        // ll.push(2);
        // ll.push(3);
        // ll.push(3);
        // Linklist l2 = ll.copy();
        // System.out.println(l2);

        Stack st = new Stack();
        st.push(5);
        st.push(4);
        st.push(3);
        st.push(2);
        int n = 1;
        while (n-- > 0)
            st.pop();
        // st.push(1);
        System.out.println(st);
        System.out.println("min val :" + st.getMin());

    }
}
