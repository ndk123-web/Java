class Student {
    String name;
    int age;

    Student() {

    }

    Student(Student s2) { // s2.name mein s1 ke values aagye
        this.name = s2.name;
        this.age = s2.age;
    }

    void printinfo() {
        System.out.println(this.name);
        System.out.println(this.age);

    }
}

public class Copy_Constru {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "ndk";
        s1.age = 18;

        Student s2 = new Student(s1); // s1 ke values copy kiya s2 mein
        s2.printinfo();
    }
}