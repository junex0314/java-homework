package ch13;
class test{
	public void test(int a,int b) throws ArithmeticException{
		int ans;
		ans = a/b;
		System.out.println("ans="+ans);
	}
}
public class class09 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		try {
			test t =new test();
			t.test(12,0);
		}catch(ArithmeticException e){
			System.out.println("���Ƭ��s");
		}
	}

}
