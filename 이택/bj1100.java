import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class bj1100 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] row = new String[8];
        int count=0;
        for(int i=0; i<=7; i++){
            row[i]=br.readLine();
            if(i%2==0){
                for(int j=0; j<=7; j++){
                    if(row[i].charAt(j) == 'F' && j%2==0){
                        count++;
                    }
                }
            }
            else{
                for(int j=0; j<=7; j++){
                    if(row[i].charAt(j)=='F' && j%2!=0){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
