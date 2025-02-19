class Student {

    String name;
    int age;

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + age;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (age != other.age)
            return false;
        return true;
    }

}

public class Object_Class {
    public static void main(String[] args) {

        boolean isSame = false;

        Student s1 = new Student();
        s1.age = 18;
        s1.name = "Ndk";

        Student s2 = new Student();
        s2.age = 18;
        s2.name = "Ndk";
        // System.out.println(s); // By default s.toString() ko call kr rha hai

        isSame = s1.equals(s2); // Override kiya hai dekho toString and equals

        System.out.println(s1);
        System.out.println(s2);

        System.out.println("s1 and s2 Datas are " + isSame);

    }
}
