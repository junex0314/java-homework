package ch11;
interface b
{
	public void show();
	public void add(int a,int b);
	public void sub(int a,int b);
	public void mul(int a,int b);
	public void div(int a,int b);
}
interface AdvancedMath
{
	public void mod (int a,int b);
	public void fac(int a);
	public void pow(int a,int b);
}
class p implements b,AdvancedMath //9
{
	public int num;
	public void add(int a,int b) {
		num = a+b;
	}
	public void sub(int a,int b) {
		num = a-b;
	}
	public void mul(int a,int b) {
		num = a*b;
	}
	public void div(int a,int b) {
		num = a/b;
	}
	public void mod (int a,int b) {
		num = a%b;
	}
	public void fac(int a) {
		num=1;
		for (int i=1;i<=a;i++) {
			num = num*i;
		}
	}
	public void pow(int a,int b) {
		for (int i=0;i<=b;i++) {
			num = num*a;
		}
	}
	public void show() {
		System.out.println("num="+num);
	}
}
public class class09 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		p cmp =new p();
		cmp.mul(3, 5);
		cmp.show();
		cmp.mod(14, 5);
		cmp.show();
		cmp.fac(5);
		cmp.show();
	}

}
