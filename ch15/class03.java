package ch15;
class C extends Thread{
	String id;
	public C(String str) {
		id = str;
	}
	public void run()
	{
		for (int i=1;i<=5;i++) {
			System.out.println(id+" "+i);
		}
	}
}
public class class03 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		C hi = new C("Hellow");
		C bye = new C("Good bye");
		hi.start();
		bye.start();
	}

}
