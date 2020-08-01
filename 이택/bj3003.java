import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class bj3003 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input =br.readLine().split(" ");
        int[] result = new int[input.length];
        for(int i=0; i<input.length; i++) {
        	result[i] = Integer.parseInt(input[i]);
        }
        int[] total = new int[result.length];
        for(int i=0; i<input.length; i++) {
        	if(i==0 || i==1) {
        		if(result[i]==1) {
        			total[i]=0;
        		}
        		else {
        			total[i]=1-result[i];
        		}
        	}
        	else if(i==2 || i == 3 || i == 4) {
        		if(result[i]==2) {
        			total[i]=0;
        		}
        		else {
        			total[i]=2-result[i];
        		}
        	}
        	else if(i==5) {
        		if(result[i]==8) {
        			total[i]=0;
        		}
        		else {
        			total[i]=8-result[i];
        		}
        	}
        }
        for(int i=0; i<total.length; i++) {
        	System.out.print(total[i]);
        	System.out.print(" ");
        }
	}

}
