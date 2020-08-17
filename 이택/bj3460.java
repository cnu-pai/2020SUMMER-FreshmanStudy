import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.*;
public class bj3460 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String snumber = (br.readLine());
        int number = Integer.parseInt(snumber);
        int[] two =new int[number];
        int count = 0;
        for(int i=0; i<number; i++){
            int ten = Integer.parseInt(br.readLine());
            two[count]=To2(ten);
            count++;
        }
        for(int i=0; i<count; i++){
            int imit = two[i];
            printing(imit);
            if(i!=count-1){
                System.out.println("");
            }
        }
    }
    private static int To2(int k){
        int number=1;
        int answer = 0;
        while (k>0){
            answer+=k%2 * number;
            number*=10;
            k=(int) Math.ceil(k/2);
        }
        return answer;
    }
    private static void printing(int k){
        String imit = Integer.toString(k);
        int[] seat = new int[imit.length()];
        int count=0;
        int q=0;
        for(int i=imit.length()-1; i>=0; i--){
            if(imit.charAt(i)=='1'){
                q=imit.length()-1-i;
                System.out.print(q+" ");
            }
        }
    }
}
