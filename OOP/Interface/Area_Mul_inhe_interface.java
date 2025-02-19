/*
    Structure of Multiple inheritance is

        Area        Volume  (Interface) Parents
        |              |   
        |              | 
        --> | Circle |-----      (Class) Child

 */

import java.util.Scanner;

interface Area {
    void area(float r);
}

interface Volume {
    void Volume(float r);
}

class Circle implements Area, Volume {

    public void area(float r) {
        System.out.println("Area : " + (3.14) * r * r);
    }

    public void Volume(float r) {
        System.out.println("Volume : " + (r * r * r));
    }

}

public class Area_Mul_inhe_interface {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();

        int r;

        System.out.println("Enter Radius for Circle");

        r = sc.nextInt();

        c.area(r);
        c.Volume(r);

    }
}
