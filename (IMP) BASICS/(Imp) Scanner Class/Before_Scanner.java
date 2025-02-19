import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// Scanner is class Where it takes object of InputStream Class
// " System.in " is the static object of InputStream declare in System Class
// Before Scanner class they used BufferReader how we can see it

public class Before_Scanner {
    public static void main(String[] args) throws NumberFormatException, IOException {

        // It takes InputStream Object which is (System.in)
        InputStreamReader in = new InputStreamReader(System.in);

        // It takes InputStreamReader object which is (in)
        BufferedReader bf = new BufferedReader(in);

        // bf.readLine() returns the string
        int str = bf.readLine();

        System.out.println(str);

    }
}