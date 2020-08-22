import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class bj1864 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String k = br.readLine();
        while (k.charAt(0)!='#'){
            int[] number = Octopus(k);
            int total = wlsqjq(number);
            System.out.println(total);
            k=br.readLine();
        }
    }
    private static int wlsqjq(int[] number){
        int q=1;
        int total=0;
        for(int i=number.length-1; i>=0; i--){
            total+=q*number[i];
            q*=8;
        }
        return total;
    }

    private static int[] Octopus(String k){
        int[] number = new int[k.length()];
        for(int i=0; i<k.length(); i++) {
            if (k.charAt(i) == '-') {
                number[i] = 0;
            } else if (k.charAt(i) == '\\') {
                number[i] = 1;
            } else if (k.charAt(i) == '(') {
                number[i] = 2;
            } else if (k.charAt(i) == '@') {
                number[i] = 3;
            } else if (k.charAt(i) == '?') {
                number[i] = 4;
            } else if (k.charAt(i) == '>') {
                number[i] = 5;
            } else if (k.charAt(i) == '&') {
                number[i] = 6;
            } else if (k.charAt(i) == '%') {
                number[i] = 7;
            } else if (k.charAt(i) == '/') {
                number[i] = -1;
            }
        }
        return number;
    }
}
