import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        for(int i = 0; i < a.length(); i++){
            int A[] = new int[a.length()];
            A[i] = (int)a.charAt(i);
            if(A[i] > 64 && A[i] < 91){
                A[i] += 13;
                if(A[i] > 90){
                    A[i] -= 26;
                }
            }
            else if(A[i] > 96 && A[i] < 123){
                A[i] += 13;
                if(A[i] > 122){
                    A[i] -= 26;
                }
            }
            else if(A[i] == ' '){
                A[i] = ' ';
            }
            else{
                A[i] = A[i];
            }
            System.out.print((char)A[i]);
        }
    }
}