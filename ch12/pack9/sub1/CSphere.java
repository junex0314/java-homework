package pack9.sub1;
public class CSphere {
	double radius;
	double pi=3.14;
	public CSphere(double r) {
		radius = r;
	}
	public void show() {
		System.out.println("radius="+radius);
		System.out.println("²y§ÎÅé¿n:"+(4/3)*pi*radius*radius*radius);
	}
}
