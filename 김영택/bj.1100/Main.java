import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       char[][] A = new char[8][8];
        int count = 0;
        for(int i = 0; i < 8; i++){
            String chess = sc.nextLine();
            for(int k = 0; k < 8; k++){
                A[i][k] = chess.charAt(k);
                if((i + k)%2 == 0 && A[i][k] == 'F'){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}