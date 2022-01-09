package ch13;

public class class07 {
	public static void test(int a,int b) throws ArithmeticException{
		int ans;
		ans = a/b;
		System.out.println("ans="+ans);
	}
	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		try {
			test(12,0);
		}catch(ArithmeticException e){
			System.out.println("除數為零");
		}
	}

}
