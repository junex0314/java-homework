package app10_4;
class Caaa
{
	private int num;
	public void display() {
		System.out.println("printed from Caaa class");//a
	}
}
class Cbbb extends Caaa
{	
	public void display() {
		System.out.println("printed from Cbbb class");//b
	}
}
public class class09 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Caaa bb =new Cbbb();//c
		bb.display();
	}

}