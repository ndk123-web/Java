// Ek hee Method use kiya hai and oosko alag alag ref deke alag operations karwaye hai

// Operate add_ref = (a, b) -> a + b;  also Equals to  ==

// Operate add_ref = new Operate(){
//      int operate(int a,int b){
//          return a+b;
//                              }
//                               };

@FunctionalInterface

interface Operate {

    int operatations(int a, int b);

}

public class Calculator {
    public static void main(String[] args) {

        Operate add_ref = (a, b) -> a + b;
        Operate sub_ref = (a, b) -> a - b;
        Operate mul_ref = (a, b) -> a * b;
        Operate div_ref = (a, b) -> a / b;

        System.out.println("Add : " + add_ref.operatations(10, 5));
        System.out.println("Sub : " + sub_ref.operatations(10, 5));
        System.out.println("Mul : " + mul_ref.operatations(10, 5));
        System.out.println("Div : " + div_ref.operatations(10, 5));

    }
}