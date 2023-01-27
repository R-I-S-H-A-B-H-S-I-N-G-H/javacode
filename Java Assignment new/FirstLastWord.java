import java.util.Scanner;

public class FirstLastWord {
    static void firstlastword() {
        String command = "", stopword = "done";
        Scanner kb = new Scanner(System.in);
        while (command.compareTo(stopword) != 0) {
            if (command.length() > 0) {

                if (command.charAt(0) == command.charAt(command.length() - 1))
                    System.out.println("FIRST LETTER IS EQUAL");
                else
                    System.out.println("FIRST LETTER IS NOT EQUAL");
            }
            command = kb.nextLine();
        }
        kb.close();

    }

    public static void main(String[] args) {
        firstlastword();
    }

}
