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
		// TODO �۰ʲ��ͪ���k Stub
		try {
			Ctest.test(12,0);
		}catch(ArithmeticException e){
			System.out.println("���Ƭ��s");
		}
	}

}
