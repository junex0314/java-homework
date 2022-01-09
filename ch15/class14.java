package ch15;
class PrePaid extends Thread{
	private static int sum=200;
	public void run()
	{
		int fee;
		while (sum>10)
		{
			fee = (int)(100*Math.random());
			talk(fee);
		}
	}
	public synchronized static void talk(int n)
	{
		int tmp = sum-n;
		try
		{
			sleep((int)(5000*Math.random()));
		}
		catch(InterruptedException e){
			
		}
		if (tmp>0)
		{
			sum=tmp;
			System.out.println("通話費"+n+"元,餘額為"+sum+"元");
		}
	}
}
public class class14 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		PrePaid a = new PrePaid();
		PrePaid b = new PrePaid();
		PrePaid c = new PrePaid();
		a.start();
		b.start();
		c.start();
	}

}
