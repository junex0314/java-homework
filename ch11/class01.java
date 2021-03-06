package ch11;
abstract class CShape
{
	protected String color;
	public void CShape(String str) //1
	{
		color=str;
	}
	public abstract void show();
}
class CRectangle extends CShape
{
	protected int width,height;
	public CRectangle(int w,int h)
	{
		width=w;
		height=h;
	}
	public void show()
	{
		System.out.print("color="+color+",  ");
		System.out.println("area="+width*height);
	}
}
class CCircle extends CShape
{
	protected double radius;
	public CCircle(double r)
	{
		radius=r;
	}
	public void show()     
	{
	    System.out.print("color="+color+",  ");
	    System.out.println("area="+3.14*radius*radius);
	}
}
public class class01 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		CRectangle rect=new CRectangle(5,10);
		rect.CShape("Yellow");
		rect.show();
		
		CCircle cir=new CCircle(2.0);
	    cir.CShape("Green");     
	    cir.show();
	}

}
