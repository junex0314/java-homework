package ch13;
class Ctest{
	public static void test(int a,int b) throws ArithmeticException{
		int ans;
		ans = a/b;
		System.out.println("ans="+ans);
	}
}
public class class08 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		try {
			Ctest.test(12,0);
		}catch(ArithmeticException e){
			System.out.println("除數為零");
		}
	}

}
