import java.util.Comparator;

/**
 * SortBySalary
 */
public class SortBySalary implements Comparator<Employee> {
    @Override
    public int compare(Employee a, Employee b) {
        return (int) (a.getSalary() - b.getSalary());
    }
}