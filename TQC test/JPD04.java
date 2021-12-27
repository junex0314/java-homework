import java.util.Scanner;
public class JPD04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		while(true) {
			int b=1;
			System.out.print("Input n (0 <= n <= 16):");
			int a= sc.nextInt();
			if(0<=a && a<=16) {
			for(int i=1;i<=a;i++) {
				b*=i;
			}
			System.out.println(a+"ªº¶¥­¼ = "+b);
			}
			else if(a==999) {
				break;
			}
		}
	}

}
