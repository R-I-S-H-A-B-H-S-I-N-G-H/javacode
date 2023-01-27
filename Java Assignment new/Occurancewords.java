import java.util.HashMap;
import java.util.Map;

public class Occurancewords {
    static void occ(String str) {
        HashMap<String, Integer> m = new HashMap<>();
        String arr[] = str.split(" ");

        for (String i : arr) {
            if (m.get(i) == null)
                m.put(i, 0);
            m.put(i, m.get(i) + 1);
        }
        for (Map.Entry<String, Integer> ele : m.entrySet())
            System.out.println(ele.getKey());

    }

    public static void main(String[] args) {
        occ("hello world hello");
    }
}
