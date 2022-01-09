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
		// TODO 自動產生的方法 Stub
		System.out.println("輸入一字串:");
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String str = br.readLine();
		int a = Integer.parseInt(str);
		try {
			mySqrt(a);
		}
		catch(ArgumentOutOfBound e) {
			System.out.println("n小於0");
		}
	}

}
