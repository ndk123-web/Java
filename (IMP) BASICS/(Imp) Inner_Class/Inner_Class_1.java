public class Inner_Class_1 {

    class Add {

        int addition(int a, int b) {
            return a + b;
        }

    }

    class Sub {

        int substract(int a, int b) {
            return a - b;
        }
    }

    int perform_add(int a, int b) {
        Add add_obj = new Add();
        return add_obj.addition(a, b);
    }

    int perform_sub(int a, int b) {
        Sub sub_obj = new Sub();
        return sub_obj.substract(a, b);
    }

    public static void main(String[] args) {

        Inner_Class_1 calc_obj = new Inner_Class_1();

        System.out.println("Sum : " + calc_obj.perform_add(10, 5));

        System.out.println("Sub : " + calc_obj.perform_sub(10, 5));

    }
}