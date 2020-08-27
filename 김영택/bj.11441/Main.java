import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int[] Number = new int [A];
        int[] arr = new int [A];
        for(int i = 0; i < A; i++){
            Number[i] = sc.nextInt();
            arr[0] = Number[0];
            if(i>0) {
                arr[i] = Number[i] + arr[i - 1];
            }
        }
        int B = sc.nextInt();
        int[] N = new int [B];
        for(int i = 0; i < B; i++){
            int k = sc.nextInt();
            int j = sc.nextInt();
            if(k - 1 == 0){
                N[i] = arr[j - 1];
            }
            else {
                N[i] = arr[j - 1] - arr[k - 2];
            }
        }
        for(int i = 0; i < B; i++) {
            System.out.println(N[i]);
        }
    }
}