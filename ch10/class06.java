package app10_3;
class CTriangle
{
	protected int base;
	protected int height;
	public CTriangle(int i,int j) {
		base = i;
		height = j;
	}
	
	protected void show() {//b
		System.out.println("base="+base+",height="+height);
	}
}

class CData extends CTriangle{//a
	public CData(int i,int j){
		super(i,j);
	}
	public void area() {
		super.show();
		System.out.println("area="+base*height/2);
	}
}

public class class06 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		CData obj = new CData(3,8);//c
		obj.area();
	}

}
