public class Throw_Keyword {
    public static void main(String[] args) {

        int arr[] = new int[5];

        try {
            int s = arr[5];
            if (s == arr[5])
                throw new ArrayIndexOutOfBoundsException();
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

    }
}
