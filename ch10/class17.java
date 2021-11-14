package app10_5;
class Car{
	protected String owner;
	protected String id;
	
	public Car (String own,String s) {//a
		owner=own;
		id = s;
	}
	void show()
	{
		System.out.println("車主姓名:"+owner);
		System.out.println("車牌編號:"+id);
	}
}
class CColor extends Car{//b
	String color;
	CColor(String own,String s,String color) {//c
		super(own,s);
		this.color=color;
	}
	public void show()//d
	{
		System.out.println("車主姓名:"+owner);
		System.out.println("車牌號碼:"+id);
		System.out.println("車身顏色:"+color);
	}
}
public class class17 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		CColor mycar = new CColor ("Riaan","Al-2345","Black");
		mycar.show();
	}

}
