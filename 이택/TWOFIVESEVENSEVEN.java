import java.util.Scanner;
public class TWOFIVESEVENSEVEN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt();
		int total = 0;
		total = number1*number2*number3;
		int[] count = new int[10];
		for(int i=0; i<=9; i++) {
			count[i]=0;
		}
//		int a=10;
		int check=1; //계속 곱해줄 것
		while(true) {
			if(check>=total) {
				break;
			}
			else {
				check*=10;
			}
		}
		check /= 10; //자릿수를 맞추기 위해 10을 나눈 것
		int b=0;
		int k;
		//System.out.print("처음 total 값은 "+total);
		//System.out.println();
		//System.out.println(" 처음 Check 값은 "+check);
		while(true) {
			k=total/check; //k는 저
			//System.out.print(" k의 값은 "+k);
			b=k*check;
			total-=b;
			check/=10;
			//System.out.println(" total값은 "+total+" check 값은 "+check);
			count[k]++;
			if(check==1) { //check==1로 하면 십의자리까지 자릿수 카운트 할 수 있음
				break;
			}
		}
		count[total]++; //일의 자리 숫자 count++를 하기 위하여
		for(int i=0; i<=9; i++) {
			System.out.println(count[i]);
		}
	}

}
