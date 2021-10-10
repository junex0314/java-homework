package java08;
class CBox1
{
	int lenght;
	int width;
	int height;
	int v;
	int s;

	void volume() {
		v = lenght*width*height;	//(b)
	}
	void surfaceArea() {
		s = lenght*width*2+lenght*height*2+width*height*2;	//(c)
	}
	void showData() {
		System.out.println("lenght="+lenght);	//(d)
		System.out.println("width="+width);		//(d)
		System.out.println("height="+height);	//(d)
	}
	void showAll() {
		System.out.println();
		System.out.println("lenght="+lenght);	//(e)
		System.out.println("width="+width);		//(e)
		System.out.println("height="+height);	//(e)
		System.out.println("volume="+v);		//(e)
		System.out.println("surfaceArea="+s);	//(e)
	}
}
	
public class class05 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		CBox1 box = new CBox1();
		box.lenght = 1;			//(a)
		box.width = 1;			//(a)
		box.height = 1;			//(a)
		
		box.volume();
		box.surfaceArea();
		box.showData();
		box.showAll();
	}

}
