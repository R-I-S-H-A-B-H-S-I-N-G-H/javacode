// package classes;

public class Employee implements Comparable<Employee> {
    private String firstname, lastname;
    private Double age, salary;

    Employee(String fname, String lname) {
        this.firstname = fname;
        this.lastname = lname;
    }

    Employee(String fname, String lname, double salary) {
        this.firstname = fname;
        this.lastname = lname;
        this.salary = salary;
    }

    // Getter
    void setSalary(Double salary) {
        this.salary = salary;
    }

    void setAge(Double age) {
        this.age = age;
    }

    // Setter
    double getSalary() {
        return this.salary;
    }

    double getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return this.firstname + " " + this.lastname + " Age : " + ((this.age == null) ? "EMPTY"
                : this.age) + " Salary: " + ((this.salary == null) ? "EMPTY " : this.salary);
    }

    @Override
    public int compareTo(Employee other) {
        if (this.firstname.compareTo(other.firstname) == 0)
            return this.lastname.compareTo(other.lastname);
        return this.firstname.compareTo(other.firstname);
    }

}
