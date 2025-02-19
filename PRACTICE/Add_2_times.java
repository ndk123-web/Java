import java.util.*;

public class Add_2_times {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m1, s1, h1;
        int m2, h2, s2;
        int h3, m3, s3;

        System.out.print("Enter 1st time in hr min sec: ");
        h1 = sc.nextInt();
        m1 = sc.nextInt();
        s1 = sc.nextInt();

        System.out.print("Enter 2nd time in hr min sec: ");
        h2 = sc.nextInt();
        m2 = sc.nextInt();
        s2 = sc.nextInt();

        s3 = s1 + s2;
        m3 = m1 + m2;
        h3 = h1 + h2;

        if (s3 >= 60) {
            m3++;
            s3 -= 60;
        }
        if (m3 >= 60) {
            h3++;
            m3 -= 60;
        }

        System.out.print(h3 + " hr " + m3 + " min " + s3 + " sec");
    }
}
