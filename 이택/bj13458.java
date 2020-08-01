import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj13458 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(br.readLine());
        String[] b =(br.readLine().split(" "));
        String[] input =(br.readLine().split(" "));
        int[] intInput = new int[input.length];
        int[] intb = new int[b.length];
        
        for(int i=0; i<input.length; i++) {
        	intInput[i]=Integer.parseInt(input[i]);
        }
        for(int i=0; i<b.length; i++) {
        	intb[i]=Integer.parseInt(b[i]);
        }
        
        int total = 0;
        for(int i=0; i<b.length; i++) {
        	int number = intb[i];
//        	System.out.print("number는 ");
//        	System.out.println(number);
        	number-=intInput[0];
//        	System.out.print("-한 number는 ");
//        	System.out.println(number);
        	total++;
//        	System.out.print("총감독관total은 ");
//        	System.out.println(total);
        	if(number%intInput[1]!=0 && number>0) {
        		total+=(number/intInput[1])+1;
//        		System.out.print("(1)");
//        		System.out.println(total);
        	}
        	else if(number%intInput[1]==0 && number>0) {
        		total+=number/intInput[1];
//        		System.out.print("(2)");
//        		System.out.println(total);
        	
        	}
//        	if (number<intInput[1] && number > 0) {
//        		total++;
//        		System.out.print("(1)부감독관total은 ");
//            	System.out.println(total);
//        	}
//        	else if(number%2 == 0 && number > 0) {
//        		if(intInput[1]==1) {
//        			total+=number;
//        			System.out.print("(2-1)부감독관total은 ");
//                	System.out.println(total);
//        		}
//        		else {
//        			total+=(number/intInput[1])+1;
//        			System.out.print("(2-2)부감독관total은 ");
//                	System.out.println(total);
//        		}
//        	}
//        	else if(number%2 !=0 && number > 0) {
//        		if(intInput[1]==1) {
//        			total+=number;
//        			System.out.print("(3-1)부감독관total은 ");
//                	System.out.println(total);
//        		}
//        		else {
//        			total+=(number/intInput[1])+1;
//        			System.out.print("(3-2)부감독관total은 ");
//                	System.out.println(total);
//        		}
//        	}
        }
        System.out.println(total);
	}

}
