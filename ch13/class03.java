package ch13;

public class class03 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		try {
			int num = 12,den = 0;
			int ans = num/den;
			System.out.println("ans="+ans);
		}
		catch(ArithmeticException e) {
			System.out.println("���Ƭ��s");
		}
		finally {
			System.out.println("end of main()!!");
		}
	}

}
