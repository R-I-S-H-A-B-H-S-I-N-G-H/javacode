public class ReplaceStr {
    static String replaceStr(String str, String target, String rep) {
        for (int i = 0; i <= str.length() - target.length(); i++) {
            String temp = str.substring(i, i + target.length());
            if (temp.equalsIgnoreCase(target)) {
                String ans = str.substring(0, i);
                ans += rep;
                ans += str.substring(i + target.length());
                return ans;
            }
            // System.out.println(str.substring(i, i + target.length()));
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(replaceStr("abcde", "cd", "fgfd"));
    }
}
