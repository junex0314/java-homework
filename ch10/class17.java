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
		System.out.println("���D�m�W:"+owner);
		System.out.println("���P�s��:"+id);
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
		System.out.println("���D�m�W:"+owner);
		System.out.println("���P���X:"+id);
		System.out.println("�����C��:"+color);
	}
}
public class class17 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		CColor mycar = new CColor ("Riaan","Al-2345","Black");
		mycar.show();
	}

}
