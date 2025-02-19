//Jab bhi hum variable as a argument pass krte to pass by value hota hai passed
//Jab bhi object as a argument pass krte to woh pass by reference passed hota hai

class Point {

    private int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getx() {     //getter and setter methods use in Encapsulation for Private datas
        return x;
    }

    public int gety() {
        return y;
    }

    // Syntax of Copy Contructor
    Point(Point other) { // other object and p1 object same hee address pe hai other=p1;
        this.x = other.x;
        this.y = other.y;
    }

}

public class Copy_Cons {
    public static void main(String[] args) {

        Point p1 = new Point(10, 20);

        Point p2 = new Point(p1); // p1 ka object pass kiya means address pass kiya object ka

        System.out.println(p2.getx() + " " + p2.gety());

    }
}