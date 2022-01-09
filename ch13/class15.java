package ch13;

import java.io.*;

class ArgumentOutOfBound extends Exception{
	
}
public class class15 {
	public static void mySqrt(int n) throws ArgumentOutOfBound{
		if(n>0) {
		double ans = Math.pow(n,1.0/2);
		System.out.println("ans="+ans);
		}
		else if(n<0) {
			throw new ArgumentOutOfBound();
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO �۰ʲ��ͪ���k Stub
		System.out.println("��J�@�r��:");
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String str = br.readLine();
		int a = Integer.parseInt(str);
		try {
			mySqrt(a);
		}
		catch(ArgumentOutOfBound e) {
			System.out.println("n�p��0");
		}
	}

}
