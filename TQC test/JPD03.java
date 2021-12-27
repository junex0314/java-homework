import java.util.Scanner;
public class JPD03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int b=0;
		System.out.println("Input:");
		int a= sc.nextInt();
		for (int i=1;i<=a;i++) {
			b+=i;
		}
		System.out.println("1+...+"+a+"="+b);
	}

}
