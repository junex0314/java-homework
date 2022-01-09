package ch15;
class a extends Thread implements Runnable{
	private String id;
	private int sec;
	public a (String str , int s) {
		id = str;
		sec = s;
	}
	public void run()
	{
		for (int i=0;i<10;i++) {
			try
			{
				sleep(sec);
			}
			catch(InterruptedException e) {
			}
			System.out.println(id+" is running..");
		}
	}
}
public class class09 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		a t1 = new a("Thread 1",1000);
		a t2 = new a("Thread 2",2500);
		Thread a1 = new Thread(t1);
		Thread a2 = new Thread(t2);
		a1.start();
		a2.start();
	}

}
