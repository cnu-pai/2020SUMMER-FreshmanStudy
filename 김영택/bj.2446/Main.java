import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("");
		int N = sc.nextInt();
		for(int i = 0; i < N; i++) {
			for(int x = 0; x < i; x++) {
				System.out.print(" ");
			}
			for(int y = 0; y < (2*N-1) - (i*2); y++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i = 0; i < N-1; i++) {
			for(int x = 0; x < (N-1) - (i+1); x++) {
				System.out.print(" ");
			}
			for(int y = 0; y < 1 + (2*(i+1)); y++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}
