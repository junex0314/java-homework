package ch13;
class CCircleException extends Exception
{
	public String toString() {
		return "CCircleException�ҥ~�Q�ߥX�F";
	}
}
class Circle        // �w�q���OCCircle
{
   private double radius;
   public void setRadius(double r) throws CCircleException
   {
      if(r<0)
      {
         throw new CCircleException();       // �ߥX�ҥ~
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
		// TODO �۰ʲ��ͪ���k Stub
		 Circle cir=new Circle();
	      try
	      {
	         cir.setRadius(-2.0);
	      }
	      catch(CCircleException e)    // ������setRadius()�ߥX���ҥ~
	      {
	         System.out.println(e);
	      }
	      cir.show();
	}

}
