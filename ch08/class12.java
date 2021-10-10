package java08;
class Cwin
{
	int width;	
	int height;	
	String name;
	
	void setW (int w)
	{
		width = w;	//(a)
	}
	void setH(int h) {
		height = h;	//(a)
	}
	void setName(String s) {
		name = s;
	}
	
	public void show() {
		System.out.println("Name="+this.name);
		System.out.println("W="+this.width+",H="+this.height);
	}
	void setWindows (int w,int h,String s) {	//(b)
		this.width = w;		//(b)
		this.height = h;	//(b)
		this.name = s;		//(c)
	}
}

public class class12 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Cwin cw = new Cwin();
		cw.setName("My Windows");
		cw.setW(5);
		cw.setH(3);
		cw.show();
	}

}
