package ch11;

interface iVolume
{
	public void showData();
	public double vol();
}
abstract class CSphere implements iVolume //b
{
	final double PI=3.14;
	protected int x;
	protected int y;
	public int r;
	public  CSphere(int a,int b,int c) {
		x=a;
		y=b;
		r=c;
	}
	public double vol() {
		return 4/3.0*PI*r*r*r;
	}
	public void showData() { //c
		System.out.println("�y��:("+x+","+y+")");
		System.out.println("�b�|:"+r);
		System.out.println("��n:"+vol());
	}
}
class CCC extends CSphere //a
{
	public CCC(int a, int b, int c) {
		super(a, b, c);
		// TODO �۰ʲ��ͪ��غc�l Stub
	}
	public double vol() {
		return 4/3.0*PI*r*r*r;
	}
	public void showData() {
		System.out.println("�y��:("+x+","+y+")");
		System.out.println("�b�|:"+r);
		System.out.println("��n:"+vol());
	}
}
public class class14 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		CCC cir =new CCC(8,6,2);
		cir.showData();
	}

}
