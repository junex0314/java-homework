import java.util.Scanner;
public class JPD02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		for (int i=0;i<2;i++) {
			System.out.println("Please enter score:");
			int a= sc.nextInt();
			if(a>=60) {
				System.out.println("You pass");
			}
		}
		System.out.println("End");
	}

}
