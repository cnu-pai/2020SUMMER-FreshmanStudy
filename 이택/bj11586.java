import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class bj11586 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        int N = Integer.parseInt(br.readLine());
        String [] mirror = new String[N];
        for(int i=0; i<N; i++){
            mirror[i] = br.readLine();
        }
        int anger = Integer.parseInt(br.readLine());

        if (anger == 1){
            for(int i=0; i<N; i++){
                System.out.println(mirror[i]);
            }
        }
        else if(anger==2){
            for(int i=0; i<N; i++){
                for(int j=N-1; j>=0; j--){
                    System.out.print(mirror[i].charAt(j)    );
                }
                System.out.println("");
            }
        }
        else{
            for(int i =N-1; i>=0; i--){
                System.out.println(mirror[i]);
            }
        }

    }
}
