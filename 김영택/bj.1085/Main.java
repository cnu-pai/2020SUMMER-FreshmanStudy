import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("");
		int x = sc.nextInt();
		System.out.print("");
		int y = sc.nextInt();
		System.out.print("");
		int w = sc.nextInt();
		System.out.print("");
		int h = sc.nextInt();
		
		if(1<= x && x <= w-1 && 1<= y && y<= h-1 && 1<= w && w <= 1000 && 1 <= h && h <= 1000) {
			int a = x;
			if (x >= w - x) {
				a = w - x;
				if (w-x >= y) {
					a = y;
					if (y >= h-y) {
						a = h-y;
					}
				}
			}
			System.out.println(a);
		}
	}

}
