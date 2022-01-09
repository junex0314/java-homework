package ch15;
class CTe implements Runnable
{
	private String id;
	public CTe(String str) {
		id = str;
	}
	public void run()
	{
		for (int i=1;i<=5;i++) {
			try
			{
				Thread.sleep((int)(2000*Math.random()));
			}
			catch(InterruptedException e) {
			}
			System.out.println(id +" "+i);
		}
	}
}
public class class10 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		CTe hi=new CTe("Hello");
		CTe bye=new CTe("Good bye");
		CTe morning = new CTe ("Good morning");
		CTe night = new CTe("Good night");
		Thread t1 = new Thread(hi);
		Thread t2 = new Thread(bye);
		Thread t3 = new Thread(morning);
		Thread t4 = new Thread(night);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
