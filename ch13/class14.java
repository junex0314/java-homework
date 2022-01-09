package ch13;
import java.util.InputMismatchException;
import java.util.Scanner;
class IntegerTooSmall extends Exception{
	
}
class IntegerTooLarge extends Exception{
	
}
public class class14 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		try {
			System.out.println("輸入一字串:");
			Scanner sc =new Scanner(System.in);
			int a = sc.nextInt();
			if (a<10) {
				throw new IntegerTooSmall();
			}
			else if (a>70) {
				throw new IntegerTooLarge();
			}
			else {
				System.out.println(a);
			}
		}
		catch(IntegerTooSmall e) {
			System.out.println("您輸入的整數的值太小");
		}
		catch(IntegerTooLarge e) {
			System.out.println("您輸入的整數的值太大");
		}
		catch(InputMismatchException e) {
			System.out.println("您輸入的不是整數");
		}
	}

}
