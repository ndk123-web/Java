// Create an array of Shape references of size 3.
// Assign a Circle object to the first element, a Square object to the second element, and a Shape object to the third element.
// Loop through the array and call the draw method on each element.
// Use type casting to call the fill method on each element inside the loop.

class Shape {
    void draw() {
        System.out.println("Drawing Shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }

    void fill() {
        System.out.println("Filling Circle");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Drawing Square");
    }

    void fill() {
        System.out.println("Filling Square");
    }
}

public class TypeCasting_5 {
    public static void main(String[] args) {

        Shape shape_ref_Arr[] = new Shape[3];
        shape_ref_Arr[0] = new Circle();
        shape_ref_Arr[1] = new Square();
        shape_ref_Arr[2] = new Shape();

        for (int i = 0; i < shape_ref_Arr.length; i++) {

            shape_ref_Arr[i].draw();

            if (shape_ref_Arr[i] instanceof Circle) {

                ((Circle) shape_ref_Arr[i]).fill();

            }

            if (shape_ref_Arr[i] instanceof Square) {

                ((Square) shape_ref_Arr[i]).fill();

            }

        }

    }
}
