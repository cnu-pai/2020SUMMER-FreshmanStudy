import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int count = 0;
        ArrayList<Integer> arr = new ArrayList<>(A);
        ArrayList<Integer> N = new ArrayList<>(A);
        for(int i = 0; i < A; i++){
            arr.add(i + 1);
        }
        while(arr.size() != 0){
            count = (count + B - 1)%arr.size();
            N.add(arr.get(count));
            arr.remove(count);
        }
        System.out.print("<");
        for(int j = 0; j < A; j++){
            if(j != 0){
                System.out.print(", ");
            }
            System.out.print(N.get(j));
        }
        System.out.print(">");
    }
}