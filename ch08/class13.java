package java08;
class C {
	double a;
	float b;
	double c;
	
	void area(double r) {	//(a)
		a = r*r*3.14;
	}
	void area(float r) {	//(b)
		b = (float) (r*r*3.14);
	}
	void area(int r) {	//(c)
		c = r*r*3.14;
	}
}
public class class13 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		C area = new C();
		area.area(2);	//(d)
		area.area(2.2f);	//(d)
		area.area(2.2);	//(d)
		System.out.println(area.a);	//(d)
		System.out.println(area.b);	//(d)
		System.out.println(area.c);	//(d)
	}

}
