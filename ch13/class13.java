package ch13;
import java.util.Scanner;
class Exception520 extends Exception{
	
}
public class class13 {

	public static void main(String[] args) throws Exception520 {
		// TODO 自動產生的方法 Stub
		System.out.println("輸入一字串:");
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
			System.out.println("這是由字串520所引起的例外");
		}
	}

}
