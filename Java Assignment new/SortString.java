
public class SortString {
    static String replaceChar(String str, int indx, char ch) {
        return str.substring(0, indx) + ch + str.substring(indx + 1, str.length());
    }

    static String bubbleSort(String a) {
        for (int i = 0; i < a.length(); i++) {
            for (int j = 1; j < a.length() - i; j++) {
                if (a.charAt(j - 1) > a.charAt(j)) {
                    // swap
                    char temp = a.charAt(j - 1);
                    a = replaceChar(a, j - 1, a.charAt(j));
                    a = replaceChar(a, j, temp);
                }
            }
        }
        return a;
    }

    static String sort(String a) {
        return bubbleSort(a);
    }

    public static void main(String[] args) {

        System.out.println(sort("cba"));
    }
}
