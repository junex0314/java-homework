import java.util.Scanner;
public class JPD05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int a[]=new int[10];
		int c =0;
		int sum=0;
		System.out.println("請輸入10個整數：");
		for (int i=0;i<10;i++) {
			System.out.print("第"+(i+1)+"個整數:");
			int b= sc.nextInt();
			if (b>60) {
				c++;
			}
			a[i]=b;
		}
		for (int i=0;i<10;i++) {
			sum+=a[i];
		}
		System.out.println("陣列中大於60有"+c+"個");
		System.out.println("總合為"+sum);
		System.out.println("平均值為"+(double)sum/10);
	}

}
