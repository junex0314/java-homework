package java08;
class CCircle
{
	double pi = 3.14;
	double radius;

	void show_periphery()
	{
		System.out.println("periphery="+2*this.pi*this.radius);	//(c)
	}
}
public class class06 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		CCircle cir1 =new CCircle();	//(a)
		cir1.radius = 3.0;	//(b)
		
		cir1.show_periphery();	//(d)
	}

}
