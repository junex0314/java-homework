package test;
class Cal_area{
	int length;
	int width;
	int height;
	int radious;
	double pi=3.14159;
	
	void z(int x,int y,int z,int f) {	
		radious = x;
		length=y;
		width=z;
		height=f;
	}
	void show () {
		System.out.println("�b�| ="+radious);
		System.out.println("�y����n ="+ Math.round(4/3.*pi*radious*radious*radious));
		System.out.println();
		System.out.println("�� ="+length+",�e ="+width+",�� ="+height);
		System.out.println("�ߤ�����n="+(length*width*2+width*height*2+length*height*2));
	}
}
public class Class01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal_area b = new Cal_area();
		b.z(10,4,5,6);
		b.show ();
	}

}
