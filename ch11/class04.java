package ch11;
abstract class m
{
	protected static   int ans;
	public  static void show() //4
	{
		System.out.println("ans="+ans);
	}
	public abstract void add(int a,int b);
	public abstract void sub(int a,int b);
	public abstract void mul(int a,int b);
	public abstract void div(int a,int b);
}
class C extends m
{
	public void add(int a,int b) {
		ans=a+b;
	}
	public void sub(int a,int b) {
		ans=a-b;
	}
	public void mul(int a,int b) {
		ans=a*b;
	}
	public void div(int a,int b) {
		ans=a/b;
	}
}
public class class04 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Compute cmp=new Compute();
		cmp.mul(3, 5);
		cmp.show();
	}

}
