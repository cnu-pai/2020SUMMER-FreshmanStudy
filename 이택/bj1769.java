import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class bj1769 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String snumber = (br.readLine());
        int number = Integer.parseInt(snumber);
        String answer2="";
        int total=0;
        int count=0;
        while (number>=10){
            count++;
            for(int i=0; i<snumber.length(); i++){
                char q=snumber.charAt(i);
                total += Integer.parseInt(String.valueOf(q));
            }
            snumber=Integer.toString(total);
            number = total;
            total=0;
        }
        if(number%3==0){
            answer2="YES";
        }
        else{
            answer2="NO";
        }
        System.out.println(count);
        System.out.println(answer2);


    }
}
