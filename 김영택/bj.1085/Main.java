import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int a = x;
		int b = y;
		if (x >= w - x) {
			a = w - x;
		}
		if (y >= h - y) {
			b = h - y;
		}
		int min = a;
		if(a >= b) {
			min = b;
		}
		System.out.println(min);
	}
}
