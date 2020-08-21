import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       char[][] A = new char[N][N];
       for(int i = 0; i < N; i++){
           String str = sc.next();
           for(int j = 0; j < N; j++){
               A[i][j] = str.charAt(j);
           }
       }
       int K = sc.nextInt();
       if(K == 1){
           for(int i = 0; i < N; i++){
               for(int j = 0; j < N; j++){
                   System.out.print(A[i][j]);
               }
               System.out.println();
           }
       }
       else if(K == 2){
           for(int i = 0; i < N; i++){
               for(int j = 0; j < N/2; j++){
                   char temp = A[i][j];
                   A[i][j] = A[i][N-(j+1)];
                   A[i][N-(j+1)] = temp;
               }
           }
           for(int i = 0; i < N; i++){
               for(int j = 0; j < N; j++){
                   System.out.print(A[i][j]);
               }
               System.out.println();
           }
       }
       else if(K == 3){
           for(int i = 0; i < N/2; i++) {
               for (int j = 0; j < N; j++) {
                   char temp = A[i][j] ;
                   A[i][j] = A[N - (i + 1)][j];
                   A[N - (i + 1)][j] = temp;
               }
           }
           for(int i = 0; i < N; i++){
               for(int j = 0; j < N; j++){
                   System.out.print(A[i][j]);
               }
               System.out.println();
           }
       }
    }
}