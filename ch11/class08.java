package ch11;
interface iAaa
{
	public void show();
}

class Cbbb
{
	public int num=10;
	
	public void set(int n)
	{
		num=n;
	}
}
class Cccc extends Cbbb implements iAaa
{
	public void set(int n) {
		num=n;
	}
	public void show() {
		System.out.println("num="+num);
	}
}
public class class08 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Cccc cc=new Cccc();
		cc.set(5);
		cc.show();
	}

}
