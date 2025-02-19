import java.util.*;

class Student {
    int age;
    String name;

    public Student(int age, String name) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student { Name : " + this.name + " Age : " + this.age + "}";
    }

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}

public class Student_Set {
    public static void main(String[] args) {

        Set<Student> students = new HashSet<>();

        students.add(new Student(18, "Ndk"));
        students.add(new Student(19, "Ysh"));
        students.add(new Student(18, "Ndk"));
        students.add(new Student(20, "Shubm"));

        System.out.println(students.toString());
    }
}
