import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int[] arr = new int[A];
        int count = 0;
        for(int i = 0; i < A; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < A; i++){
            if(arr[i] == 2){
                count++;
                continue;
            }
            else if(arr[i] == 1){
                continue;
            }
            for(int j = 2; j < arr[i]; j++){
                if(arr[i]%j == 0){
                    break;
                }
                else if(j == arr[i] - 1){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}