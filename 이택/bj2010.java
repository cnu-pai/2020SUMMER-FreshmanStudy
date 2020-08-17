import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class bj2010 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int counting = Integer.parseInt(br.readLine());
        int[] number = new int[counting];
        int computer = 0;
        for(int i=0; i<counting; i++){
            number[i]=Integer.parseInt(br.readLine());
            int imit = number[i];
            if (imit == 1 && i==counting-1){
                imit+=1;
            }
            else if(i==counting-1){
                imit+=1;
            }
            imit-=1;
            computer += imit;
        }
    System.out.println(computer);
    }
}
