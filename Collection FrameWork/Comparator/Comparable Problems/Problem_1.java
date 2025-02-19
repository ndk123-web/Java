import java.util.*;

class Employee implements Comparable<Employee> {

    String name;
    float sal;
    String id;

    public Employee(String name, float sal, String id) {
        this.name = name;
        this.sal = sal;
        this.id = id;
    }

    public int compareTo(Employee that) {

        return Integer.parseInt(this.id.substring(this.id.length() - 2))
                - Integer.parseInt((that.id.substring(that.id.length() - 2)));

    }

    public String toString() {
        return "Employee [name=" + name + ", sal=" + sal + ", id=" + id + "]";
    }

}

public class Problem_1 {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Ndk", 20000, "23102B0061"));
        employees.add(new Employee("Ysh", 190000, "23102B0037"));
        employees.add(new Employee("Shb,", 20000, "23102B0019"));
        employees.add(new Employee("Ryn", 20000, "23102B0002"));

        Collections.sort(employees);

        for (Employee e : employees) {
            System.out.println(e);
        }

    }
}