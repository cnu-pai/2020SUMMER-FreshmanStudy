import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int maxcnt = 0;
		int[] m = new int[1000];
		int cnt[] = new int[10];
		
		int k = A*B*C;
		while(k != 0) {
			int a = k % 10;
			m[maxcnt] = a;
			maxcnt++;
			k = k/10;
		}
		for(int x = 0; x < maxcnt; x++) {
			if(m[x] == 0) {
				cnt[0]++;
			}
			if(m[x] == 1) {
				cnt[1]++;
			}
			if(m[x] == 2) {
				cnt[2]++;
			}
			if(m[x] == 3) {
				cnt[3]++;
			}
			if(m[x] == 4) {
				cnt[4]++;
			}
			if(m[x] == 5) {
				cnt[5]++;
			}
			if(m[x] == 6) {
				cnt[6]++;
			}
			if(m[x] == 7) {
				cnt[7]++;
			}
			if(m[x] == 8) {
				cnt[8]++;
			}
			if(m[x] == 9) {
				cnt[9]++;
			}
		}
		for(int i = 0; i < 10; i ++) {
			System.out.println(cnt[i]);
		}
	}
}
