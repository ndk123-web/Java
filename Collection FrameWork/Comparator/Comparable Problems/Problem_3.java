import java.util.*;

class Student implements Comparable<Student> {

    String rno;
    int marks;

    public Student(String rno, int marks) {
        this.rno = rno;
        this.marks = marks;
    }

    public String toString() {
        return "Student [rno=" + rno + ", marks=" + marks + "]";
    }

    public int compareTo(Student that) {

        return (this.marks < that.marks) ? 1 : -1;

    }

}

public class Problem_3 {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Ndk", 60));
        students.add(new Student("Ndk", 20));
        students.add(new Student("Ndk", 61));
        students.add(new Student("Ndk", 67));
        students.add(new Student("Ndk", 64));

        Collections.sort(students);

        for (Student s : students)
            System.out.println(s);

    }
}
