import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
public class bj1152 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String k = br.readLine();
        String[] q = k.split(" ");
        int count=q.length;
        for(int i=0; i<q.length; i++){
//            System.out.println(q[i]);
            if(q[i].isEmpty()){
                count--;
            }
        }
        System.out.println(count);
    }
}
