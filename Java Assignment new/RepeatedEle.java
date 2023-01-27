public class RepeatedEle {
    static void repEle(int a[]) {
        int ans = 0;
        for (int i : a)
            ans ^= i;
        System.out.println(ans);
    }

    public static void main(String[] args) {
        int a[] = { 1, 1, 2, 2, 3, 3, 4, 5, 5, 4, 7 };
        repEle(a);
    }
}
