interface IArea{
	void area();
}
class Circle implements IArea{
	private double r;
	public Circle(double r) {
		this.r = r;
	}
	public void area() {
		 System.out.println("��έ��n: " + 3.1416*r*r);
	}
}
class Rectangle implements IArea { 
	private double width;
	private double height;
	private double area;
	public Rectangle(double a,double b) {
		width=a;
		height=b;
	}
	public void area() {
		 System.out.println("����έ��n: " + 		width*height);
	}
}
class Triangle implements IArea {
	private double height;
	private double bottom;
	private double area;
	public  Triangle(double a,double b) {
		height=a;
		bottom=b;
	}public void area() {
		System.out.println("�T���έ��n:"+height*bottom/2);
	}
}
public class J3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IArea a; 
		Circle c = new Circle(6.0);
		Rectangle r=new Rectangle(10.0, 15.0);
		Triangle t=new Triangle(20.0, 15.0);
		for ( int i = 1; i <= 3; i++ ) {
			 if ( i == 1 ) {
				 a = c;
				 } // ���
			 else if ( i == 2 ) {
				 a = r;
				 } // �����
			 else {
				 a = t;
				 } // �T����
			a.area();
		}
	}

}
