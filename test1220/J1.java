import java.util.Scanner;
public class J1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("�K�X��J����");
		System.out.println("�п�J�K�X:");
		int a=sc.nextInt();
		System.out.println("�ЦA��J�@���K�X:");
		try {
			for (int i=1;i<=3;i++) {
			Scanner ac =new Scanner(System.in);
			int b=ac.nextInt();
			if (a==b) {
				System.out.println("�K�X���T");
				break;
			}
			else if(a!=b && i==3) {
				 throw new RuntimeException();
			}
			else if(a!=b) {
				System.out.println("�P�Ĥ@����J�����P!");
				System.out.println("�ЦA��J�@���K�X:");
			}
			}
		}catch( RuntimeException e){
			System.out.println("��J�T�����~�I�{������I");
		}
	}

}
