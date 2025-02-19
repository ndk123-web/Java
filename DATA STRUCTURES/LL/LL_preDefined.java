import java.util.LinkedList;
import java.util.Scanner;

public class LL_preDefined {

    static LinkedList<Integer> list = new LinkedList<>(); // Integer ek Wrapper class hai LL mein int type ke data honge

    static void reverse() {

        int st = 0, end = list.size() - 1;

        while (st < end) {
            int t = list.get(st);
            list.set(st, list.get(end));
            list.set(end, t);
            st++;
            end--;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ch, data;

        while (true) {
            System.out.print("1.InsertFirst\n2.InsertLast\n3.DeleteFirst\n4.DeleteLast\n5.printLast\n6.Exit\n");
            System.out.print("Enter Choice");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter data");
                    data = sc.nextInt();
                    list.addFirst(data);
                    break;

                case 2:
                    System.out.print("Enter data");
                    data = sc.nextInt();
                    list.addLast(data); // list.addLast(data) == list.add(data)
                    break;

                case 3:
                    list.removeFirst();
                    break;

                case 4:
                    list.removeLast();
                    break;

                case 5:
                    System.out.print(list);
                    break;

                case 6:
                    reverse();
                    break;
            }
        }

    }
}