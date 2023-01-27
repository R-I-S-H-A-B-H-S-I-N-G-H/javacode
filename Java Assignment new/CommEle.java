import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CommEle {
    static void commEle(int a[], int b[]) {
        Set<Integer> st = new HashSet<>();
        for (int i : a)
            st.add(i);
        for (int i : b)
            if (st.contains(i))
                System.out.println(i);
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6 };
        int b[] = { 4, 5, 6, 7, 8, 9 };

        commEle(a, b);
    }
}
