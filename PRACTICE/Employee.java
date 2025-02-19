import java.util.*;

class employee {
    employee() {
        System.out.println("Its Employee Class\n");
    }

    employee(int n, String name) {
        System.out.println("Name :" + name + "");
        System.out.println("Roll :" + n + "\n");
    }

    employee(int n, String name, int sal) {
        System.out.println("Name :" + name + "");
        System.out.println("Roll :" + n + "");
        System.out.println("Salaray :" + sal + "\n");
    }

    employee(int n, String name, int sal, int op) {
        System.out.println("Name :" + name + "");
        System.out.println("Roll :" + n + "");
        System.out.println("Salary :" + sal + "");
        System.out.println("Bonus : " + op + "\n");
    }
}

class Employee {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        employee e1 = new employee();
        employee e2 = new employee(10, "ndk");
        employee e3 = new employee(19, "ysh", 10000);
        employee e4 = new employee(20, "ysh", 190000, 90);
    }
}