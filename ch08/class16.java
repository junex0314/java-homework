package java08;
class CSphere{
	private int x;
	private int y;
	private int z;
	private int radius;
	double surfaceArea;
	double volume;
	
	void setLocation() {	//(a)
		x=3;
		y=4;
		z=5;
	}
	void setRadius() {	//(b)
		radius=1;
	}
	void surfaceArea() {	//(c)
		surfaceArea = 4*3.14*radius*radius;
	}
	void volume() {	//(d)
		volume = 4/3*3.14*radius*radius*radius;
	}
	void showCenter() {	//(e)
		System.out.println("��߮y��:("+x+","+y+","+z+")");
	}
}
public class class16 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		CSphere cs = new CSphere();
		cs.setLocation();
		cs.setRadius();
		cs.surfaceArea();
		cs.volume();
		cs.showCenter();
	}

}
