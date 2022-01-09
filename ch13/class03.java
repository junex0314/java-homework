package ch13;

public class class03 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		try {
			int num = 12,den = 0;
			int ans = num/den;
			System.out.println("ans="+ans);
		}
		catch(ArithmeticException e) {
			System.out.println("除數為零");
		}
		finally {
			System.out.println("end of main()!!");
		}
	}

}
