// Comparable ek Normal Intrface consist of int compareTo(Type obj) and int compareTo(String s)
// Comparator ek FunctionalInterface as a 3rd person hum use krte hai sorting ke liye
// Comparable hum it means hum jis class ko implement krte hai to woh class apne objects ko khud compare krega
// comparator consist of int compare(int i,int j) method
// comparable consist of int compareTo(Object) method

import java.util.*;

class Student implements Comparable<Student> {

    String name;
    int age;

    public Student(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public int compareTo(Student that) {
        if (this.name.length() > that.name.length())
            return 1;
        else
            return -1;
    }

    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

}

public class Comparable_Inter {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Ndkfd", 19));
        students.add(new Student("Ysh", 20));
        students.add(new Student("Ryan", 15));
        students.add(new Student("Sm", 13));

        Collections.sort(students);

        for (Student s : students)
            System.out.println(s);

    }
}
