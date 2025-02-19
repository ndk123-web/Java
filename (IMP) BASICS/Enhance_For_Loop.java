        //har ek object "s" mein jaayega
        //for s1 -> s=s1 it will print s.name and s.age (s=s1)
        //for s2->  s=s2 it will print s.name and s.age (s=s2)
        //same for s3 (s=s3)

class Student {
    int age;
    String name;

    Student(int age, String name) {
        this.name = name;
        this.age = age;
    }

}

public class Enhance_For_Loop {
    public static void main(String[] args) {

        Student s1 = new Student(18, "Ndk");
        Student s2 = new Student(19, "Ysh");
        Student s3 = new Student(19, "Shbm");

        Student student[] = new Student[3];
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;

        //Enhance For Loop
       
        for (Student s : student) {
            System.out.println(s.name + " : " + s.age);
        }

    }
}
