class Arr {
    int a[] = new int[5];

    Arr(int a[]) {
        for (int i = 1; i <= 5; i++) {
            this.a[i - 1] = i;
        }
    }

    Arr(Arr other) {
        for (int i = 1; i <= 5; i++) {
            this.a[i - 1] = other.a[i - 1];
        }
    }

}

public class Copy_Const1 {
    public static void main(String[] args) {
        int a[] = new int[5];

        Arr a1 = new Arr(a);

        Arr a2 = new Arr(a1);

        for (int i = 0; i < 5; i++) {
            System.out.println(a2.a[i] + " ");
        }
    }
}
