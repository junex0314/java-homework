package ch11;
interface a
{
	public void show();
	public void add(int a,int b);
	public void sub(int a,int b);
	public void mul(int a,int b);
	public void div(int a,int b);
}
class o implements a
{
	protected int ans;
	public void add(int a,int b) {
		ans = a+b;
		return;
	}
	public void sub(int a,int b) {
		ans = a-b;
		return;
	}
	public void mul(int a,int b) {
		ans = a*b;
		return;
	}
	public void div(int a,int b) {
		ans = a/b;
		return;
	}
	public void show() {
		System.out.println("ans="+ans);
	}
}
public class class05 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		o cmp =new o();
		cmp.mul(3, 5);
		cmp.show();
	}

}
