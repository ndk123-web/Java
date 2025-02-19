// Create an object of Student class and assign it to a Person reference.
// Call the display method using the Person reference.
// Cast the Person reference to Student and call the study method.
// Now, try to cast the Person reference to Teacher and call the teach method. Handle any exception that occurs.

class Person {
    void display() {
        System.out.println("I am a person");
    }
}

class Student extends Person {
    void study() {
        System.out.println("I am studying");
    }
}

class Teacher extends Person {
    void teach() {
        System.out.println("I am teaching");
    }
}

public class TypeCasting_4 {
    public static void main(String[] args) {

        Person person_ref1 = new Student();                 // person_ref1 jo Student object ko point kr rha hai
        person_ref1.display();

        Person person_ref2 = new Teacher();                  // person_ref2 jo Teacher object ko point kr rha hai

        Student student_ref = (Student) person_ref1;        // ref and actual object same hai (Student ref -> Student Object)
        student_ref.study();                                // acccessing method of ref class

        //(Method 1 to print teach() using TypeCasting )

        
        // Teacher teacher_ref = (Teacher) person_ref2;    // ref and actual object same hai(Teacher ref -> Teacher Object)
        // teacher_ref.teach();                            // accessing method of ref class


        //(Method 2 to print teach() using instanceof keyword )

        if (person_ref2 instanceof Teacher) {            //  Person person_ref2 = new Teacher(); (Yaha dekho instance of Teacher ref2 hai)
            ((Teacher) person_ref2).teach();
        }

    }
}
