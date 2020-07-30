import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	
		int A[] = new int[100];
		int count = 2;
		int f0 = 0;
		int f1 = 1;
		int fib = 0;
		A[0] = f0;
		A[1] = f1;
		if(n == 0) {
			System.out.println(0);
		}
		else if(n == 1){
			System.out.println(1);
		}
		else {
			while(true) {
				if(n+1 == count) {
					break;
				}
				else {
					fib = A[count - 1] + A[count - 2];
					A[count] = fib;
					count++;
				}
			}
			System.out.println(A[n]);
		}
	}
}
