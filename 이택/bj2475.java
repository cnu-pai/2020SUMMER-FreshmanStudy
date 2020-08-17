import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj2475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sNumber = br.readLine().split(" ");
        int [] number = new int[sNumber.length];
        for(int i = 0; i< sNumber.length; i++){
            number[i]=Integer.parseInt(sNumber[i]);
        }

        int total = wprhq(number);
        System.out.println(total%10);

    }
    private static int wprhq(int[] a) {
        int total = 0;
        for (int i = 0; i < a.length; i++) {
            total += (a[i])*(a[i]);
        }
        return total;
    }
}
