package java09;

class CCirclee        // �w�q���OCCircle
{
   private static double pi=3.14;
   private double radius;

   public CCirclee(double r)       // CCircle�غc��
   {
      radius=r;
   }
   public void show()
   {
      System.out.println("area="+pi*radius*radius);
   }
}
public class class16 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		CCirclee cir[];
	      cir=new CCirclee[6];
	      for(int i=0;i<=5;i++) {
	    	  cir[i]=new CCirclee(i);
	    	  cir[i].show(); 
	      }
	}

}
