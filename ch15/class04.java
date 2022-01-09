package ch15;
class CT extends Thread{
	String id;
	public CT(String str) {
		id = str;
	}
	public void run()
	{
		for (int i=1;i<=5;i++) {
			System.out.println(id+" "+i);
		}
	}
}
public class class04 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		CT hi = new CT("Hellow");
		CT bye = new CT("Good bye");
		CT morning = new CT("Good morning");
		hi.start();
		bye.start();
		morning.start();
	}

}
