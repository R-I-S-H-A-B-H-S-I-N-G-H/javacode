public class test2 {
    String a, b;
    int c, d;

    test2(String a, String b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public static void main(String[] args) {
        test2 t2 = new test2("abc", "developer", 30, 20);
    }
}
