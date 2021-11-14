package java09;

class CCirclee        // 定義類別CCircle
{
   private static double pi=3.14;
   private double radius;

   public CCirclee(double r)       // CCircle建構元
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
		// TODO 自動產生的方法 Stub
		CCirclee cir[];
	      cir=new CCirclee[6];
	      for(int i=0;i<=5;i++) {
	    	  cir[i]=new CCirclee(i);
	    	  cir[i].show(); 
	      }
	}

}
