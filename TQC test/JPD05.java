import java.util.Scanner;
public class JPD05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int a[]=new int[10];
		int c =0;
		int sum=0;
		System.out.println("�п�J10�Ӿ�ơG");
		for (int i=0;i<10;i++) {
			System.out.print("��"+(i+1)+"�Ӿ��:");
			int b= sc.nextInt();
			if (b>60) {
				c++;
			}
			a[i]=b;
		}
		for (int i=0;i<10;i++) {
			sum+=a[i];
		}
		System.out.println("�}�C���j��60��"+c+"��");
		System.out.println("�`�X��"+sum);
		System.out.println("�����Ȭ�"+(double)sum/10);
	}

}
