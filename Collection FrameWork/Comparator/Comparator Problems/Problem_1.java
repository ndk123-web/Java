import java.util.*;

class Student {

    String name;

    public Student(String name) {
        this.name = name;
    }

    public String toString() {
        return "Student [name=" + name + "]";
    }

}

public class Problem_1 {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Navnath"));
        students.add(new Student("Yash"));
        students.add(new Student("Shubham"));
        students.add(new Student("Riyan"));

        Comparator<Student> com = (Student i, Student j) -> {
            return i.name.compareTo(j.name);
        };

        Collections.sort(students, com);

        for (Student s : students)
            System.out.println(s);

    }

}