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
		int check=1; //��� ������ ��
		while(true) {
			if(check>=total) {
				break;
			}
			else {
				check*=10;
			}
		}
		check /= 10; //�ڸ����� ���߱� ���� 10�� ���� ��
		int b=0;
		int k;
		//System.out.print("ó�� total ���� "+total);
		//System.out.println();
		//System.out.println(" ó�� Check ���� "+check);
		while(true) {
			k=total/check; //k�� ��
			//System.out.print(" k�� ���� "+k);
			b=k*check;
			total-=b;
			check/=10;
			//System.out.println(" total���� "+total+" check ���� "+check);
			count[k]++;
			if(check==1) { //check==1�� �ϸ� �����ڸ����� �ڸ��� ī��Ʈ �� �� ����
				break;
			}
		}
		count[total]++; //���� �ڸ� ���� count++�� �ϱ� ���Ͽ�
		for(int i=0; i<=9; i++) {
			System.out.println(count[i]);
		}
	}

}
