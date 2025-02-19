import java.util.*;

class Student {

    String name;
    int age;

    public Student(int age, String name) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

}

public class Custom_class_comparator {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(19, "Ndk"));
        students.add(new Student(14, "Nk"));
        students.add(new Student(18, "Ysh"));
        students.add(new Student(20, "Shbm"));

        // Anonymous class Concept
        Comparator<Student> com = new Comparator<>() {

            public int compare(Student i, Student j) {
                if (i.age > j.age)
                    return 1;
                else
                    return -1;
            }
        };

        Collections.sort(students, com);

        for (Student s : students)
            System.out.println(s);

    }
}