package java09;
class Namcard{
	private String name;
	private String address;
	private Phone data;
	class Phone {
		private String company;
		private String cell;
	
	public Phone(String s1,String s2) {   //a
		company = s1;
		cell = s2;
	}
	}
	public Namcard(String a,String b,String c,String d) {//b
		name = a;
		address = b;
		data =new Phone(c,d);
	}
	void show() {//c
		System.out.println("好友姓名:"+name);
		System.out.println("聯絡地址:"+address);
		System.out.println("公司電話:"+data.company);
		System.out.println("手機號碼:"+data.cell);
	}
}
public class class17 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		 Namcard first=new Namcard("Andy","123City",   "2345-6789","0911-336600"); //d
		 first.show();   

	}

}
