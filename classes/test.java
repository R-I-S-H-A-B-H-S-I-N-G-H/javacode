import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<Employee> arr = new ArrayList<>();
        arr.add(new Employee("Rishabh", "Singh", 10));
        arr.add(new Employee("Shreya", "Gupta", 20));
        arr.add(new Employee("Kapil", "Gupta", 30));
        arr.add(new Employee("Manmohan", "Singh", 40));
        System.out.println(arr);
        Collections.sort(arr, new SortBySalary());
        System.out.println(arr);

    }
}
