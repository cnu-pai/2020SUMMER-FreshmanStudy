import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	
		int fact = 1;
		while(N != 0) {
			fact *= N;
			N--;
		}
		System.out.println(fact);
	}
}
