package java08;
class Cbbb
{
	double x;
	double y;
}
public class class02 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Cbbb obj1 = new Cbbb(); 		//a
		obj1.x = 5.2;					//b
		obj1.y = 3.9;					//b
		System.out.println(obj1.x);		//f
		System.out.println(obj1.y);		//f
		
		Cbbb obj2 = new Cbbb();			//a
		obj2.x = 6.5;					//c
		obj2.y = 4.6;					//c
		System.out.println(obj2.x);		//f
		System.out.println(obj2.y);		//f
		
		Cbbb avg = new Cbbb();			//a
		avg.x = (obj1.x + obj2.x)/2;	//d
		avg.y = (obj1.y + obj2.y)/2;	//e
		System.out.println(avg.x);		//f
		System.out.println(avg.y);		//f
	}

}
