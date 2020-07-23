import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int num[] = new int[3];
		int C = A*B;
		int cnt = 0;
		while(B != 0) {
			num[cnt] = B%10;
			cnt++;
			B = B/10;
		}
		for(int i = 0; i < 3; i++) {
			System.out.println(A * num[i]);
		}
		System.out.println(C);
	}
}
