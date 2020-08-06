import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();
        int x = 1 + (V-A)/(A-B);
        int i = A + (A - B) * (x - 1);
        if(i < V){
            System.out.println(x + 1);
        }
        else if(i > V + (A - B)){
            System.out.println(x - 1);
        }
        else{
            System.out.println(x);
        }
    }
}