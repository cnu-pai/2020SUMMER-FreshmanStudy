import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class bj1357 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] Snumber = br.readLine().split(" ");
        int[] number = new int[Snumber.length];
        String[] q = new String[Snumber.length];
        int total=0;

        q=k(Snumber);
        for(int i=0; i< q.length; i++){
            number[i] = (Integer.parseInt(q[i]));
            total+=number[i];
        }
        String sTotal = Integer.toString(total);
        String imit ="";
        for(int i=sTotal.length()-1; i>=0; i--){
            imit += sTotal.charAt(i);
        }
        System.out.println(Integer.parseInt(imit));



    }

    private static String[] k(String[] k) {
        String[] q = new String[k.length];
        for (int i = 0; i < k.length; i++) {
            String figure = k[i];
            String imit = "";
            for (int j = figure.length() - 1; j >= 0; j--) {
                imit += figure.charAt(j);
            }
            q[i] = imit;
        }
        return q;
    }
}
