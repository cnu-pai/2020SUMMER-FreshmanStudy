import java.util.Scanner;
public class bj10870 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(k(a));
	}
	public static int k(int number) {
		int i=0;
		int a=number;
		if(a==0) {
			return 0;
		}
		else if(a==1) {
			return 1;
		}
		else {
			return k(number-1)+k(number-2);
		}
	}

}
