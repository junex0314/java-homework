package ch13;
import java.util.InputMismatchException;
import java.util.Scanner;
class IntegerTooSmall extends Exception{
	
}
class IntegerTooLarge extends Exception{
	
}
public class class14 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		try {
			System.out.println("��J�@�r��:");
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
			System.out.println("�z��J����ƪ��ȤӤp");
		}
		catch(IntegerTooLarge e) {
			System.out.println("�z��J����ƪ��ȤӤj");
		}
		catch(InputMismatchException e) {
			System.out.println("�z��J�����O���");
		}
	}

}
