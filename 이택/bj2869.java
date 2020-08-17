    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.math.*;
    public class bj2869 {
        public static void main(String[] args) throws IOException {
            int count;
            int total = 0;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] input = br.readLine().split(" ");
            int[] nInput = new int[input.length];
            for(int i=0; i<input.length; i++) {
                nInput[i] = Integer.parseInt(input[i]);
            }
//            100 3 200    3 97 194 291
//            2 1 5        4  2  5
//            9 8 48       40  5 48
//            10 5 20      3
//            9 8 9        1
//            ((nInput[0]-nInput[1])*k)+nInput[0]>=nInput[2]
            count = (int)(Math.ceil((nInput[2]-nInput[0])/(nInput[0]-nInput[1])));
            count++;
            System.out.println(count);
        }
    }
