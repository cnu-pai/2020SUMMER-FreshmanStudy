import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int A = sc.nextInt();
         int sum = 0;
         int B[] = new int[A];
         for(int i = 0; i < A; i++){
             B[i] = sc.nextInt();
         }
         for(int i = 0; i < A; i++){
             sum += B[i];
         }
        System.out.println(sum - (1*(A-1)));
    }
}