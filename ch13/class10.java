package ch13;
class RadiusTooLarge extends Exception{	
}
class RadiusIsNegative extends Exception{	
}
class CCircle
{
	private double radius;
	public void setRadius(double r) throws RadiusTooLarge,RadiusIsNegative
	{
		if (r>100)
		{
			throw new RadiusTooLarge();
		}
		else if(r<0) 
		{
			throw new RadiusIsNegative();
		}
		else {
			radius=r;
		}
	}
	
	public void show()
	{
		System.out.println("area="+3.14*radius*radius);
	}
}

public class class10 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		CCircle cir = new CCircle();
		try
		{
			cir.setRadius(120);
		}
		catch(RadiusTooLarge e)
		{
			System.out.println(e+" throwed");
		}
		catch(RadiusIsNegative e)
		{
			System.out.println(e+" throwed");
		}
		cir.show();
	}

}
