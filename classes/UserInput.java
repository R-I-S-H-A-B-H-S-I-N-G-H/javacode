import java.util.Scanner;

public class UserInput {
    static double areaOfCircle(int r) {
        return Math.PI * r * r;
    }

    static double circumferenceOfCircle(int r) {
        return Math.PI * r * 2;
    }

    static void menu() {
        Scanner kb = new Scanner(System.in);
        int stop = 3;
        int key = -1;
        while (key != stop) {
            System.out.println("1.Calculate Area of Circle");
            System.out.println("2. Calculate Circumference of a Circle");
            System.out.println("3. Exit.");
            key = kb.nextInt();
            switch (key) {
                case 1: {
                    System.out.println("Enter Radius");
                    int r = kb.nextInt();
                    System.out.println("Area of Circle: " + areaOfCircle(r));
                }
                    break;
                case 2: {
                    System.out.println("Enter Radius");
                    int r = kb.nextInt();
                    System.out.println("Circumference of Circle: " + circumferenceOfCircle(r));
                }
                    break;
                default:
                    break;

            }
        }
        kb.close();

    }

    static void userCommand() {
        Scanner kb = new Scanner(System.in);
        String res = "", temp = "";
        String stopkey = "XDONE";
        boolean flag = true;
        while (temp.compareTo(stopkey) != 0) {
            if (!flag)
                res += temp + ",";
            flag = false;
            temp = kb.nextLine();
        }
        kb.close();
        System.out.println("OUTPUT");
        System.out.println(res);
    }

    public static void main(String[] args) {
        userCommand();
        // menu();
    }
}
