package ch11;

interface show_ans
{
	public void show();
}
interface maa extends show_ans
{
	public void add(int a,int b);
	public void sub(int a,int b);
	public void mul(int a,int b);
	public void div(int a,int b);
}

class coo implements maa
{
	public int ans;
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
		ans = a/b;
	}
	public void show() {
		System.out.println(ans);
	}
}
public class class13 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		coo cmp = new coo();
		cmp.mul(3, 5);
		cmp.show();
	}

}
