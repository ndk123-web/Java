// Jab bhi Object create hota hai oose pahile 2 step hote hai 
// 1) Class Load hota hai memory mein and static block is part of class loader
// 2) After class load Object Create hota hai and object create hone ke baad constructor call hota hai
// So , First static block(only once) chalega and then constructor
// class loader also loads into memotry only once

class Student {

    static {
        System.out.println("Its a Static Block");
    }

    Student() {
        System.out.println("Constructor Called");
    }

}

public class Static_Block {
    public static void main(String[] args) throws ClassNotFoundException {

        Student s1 = new Student();
        Student s2 = new Student();

        // Agar sirf Class Load krna ho toh
        Class.forName(null);

    }
}
