import java.util.Scanner;
public class bj10872 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int k = sc.nextInt();

		int a=1;
		
		if(k==0) {
			a=1;
		}
		else {
			for(int i=1; i<=k; i++) {
				a*=i;
			}
		}
		System.out.println(a);
	}
}
