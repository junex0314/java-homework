package ch13;
import java.util.Scanner;
class Exception520 extends Exception{
	
}
public class class13 {

	public static void main(String[] args) throws Exception520 {
		// TODO �۰ʲ��ͪ���k Stub
		System.out.println("��J�@�r��:");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		try {
			if(!str.equals("520")) {
				System.out.println(str);
			}
			else { 
				throw new Exception520();
			}
		}
		catch(Exception520 e) {
			System.out.println("�o�O�Ѧr��520�Ҥް_���ҥ~");
		}
	}

}
