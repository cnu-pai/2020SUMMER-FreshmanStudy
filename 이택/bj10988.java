import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
public class bj10988 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S=br.readLine();
        String oppsiteS="";
        int decision=0;
        for(int i=S.length()-1; i>=0; i--){
            oppsiteS+=S.charAt(i);
        }
        for(int i=0; i<S.length(); i++){
            if(S.charAt(i) != oppsiteS.charAt(i)){
                decision=1;
            }
        }
        if (decision == 1){
            System.out.println(0);
        }
        else{
            System.out.println(1);
        }
    }
}
