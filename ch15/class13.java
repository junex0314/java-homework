package ch15;
class CBank
{
   private static int sum=0;
   public synchronized static void add(int n)
   {
      int tmp=sum;
      tmp=tmp+n;            // �֥[�״��`�B
      try
      {
         Thread.sleep((int)(1000*Math.random()));   // �p��0~1����
      }
      catch(InterruptedException e){}
      sum=tmp;
      System.out.println("sum= "+sum);
  }
}
class CCustomer extends Thread // CCustomer���O�A�~�Ӧ�Thread���O
{
   public void run()        // run() method
   {
      for(int i=1;i<=3;i++)
         CBank.add(100);       // �N100�����T���פJ
   }
}
public class class13 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		CCustomer c1=new CCustomer();
	    CCustomer c2=new CCustomer();
	    c1.start();
	    c2.start();
	}

}
