import java.util.Scanner;
public class TwoFourFourSix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int star = (2*(number-1))+1;
		int im = star;  //im�� �����ϴ� ���� ���� ����ϴ� while�� �������� ����ϱ� �����غ�
		int space = 1;
		while(star>0) { //1���� ���� ���鶧���� ������ �ϱ�
			for(int k = 1; k<=star; k++) {
				System.out.print("*");
			}
			System.out.println();
			if(star!=1) {//������ ���� �ϴ� ��
				for(int j =1; j<=space; j++) {
					System.out.print(" ");
				}
			}
			star-=2;
			space++;
		}
		star += 2; //1�� ����� ���Ѱ�
		space-=3; //���� ���߱� ���Ѱ�

		int reach =3; // ���Ϲ� ���� ������Ű���� ����

		while(reach!=im+2) {
			if(number == 1) { //�Է¹��� ���� 1�̶�� ����������  �׷��� ������ 
				break;
			}
			else {
				for(int j = 1; j<=space; j++) {
					System.out.print(" ");
				}
				for(int i = 1; i<=reach; i++) {
					System.out.print("*");
				}
				System.out.println();
				
			}
			
			reach += 2;
			space--;
		}
	}
}
