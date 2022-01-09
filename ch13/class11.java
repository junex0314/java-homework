package ch13;
class CCircleException extends Exception
{
	public String toString() {
		return "CCircleException例外被拋出了";
	}
}
class Circle        // 定義類別CCircle
{
   private double radius;
   public void setRadius(double r) throws CCircleException
   {
      if(r<0)
      {
         throw new CCircleException();       // 拋出例外
      }
      else
         radius=r;
   }

   public void show()
   {
      System.out.println("area="+3.14*radius*radius);
   }
}
public class class11 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		 Circle cir=new Circle();
	      try
	      {
	         cir.setRadius(-2.0);
	      }
	      catch(CCircleException e)    // 捕捉由setRadius()拋出的例外
	      {
	         System.out.println(e);
	      }
	      cir.show();
	}

}
