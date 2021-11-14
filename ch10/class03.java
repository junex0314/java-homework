package app10_2;
class Caaa
{
	public int num1;
	public int num2;
	Caaa(){
		num1=1;//a
		num2=1;//a
	}
	Caaa(int a,int b){
		num1 = a;//b
		num2 = b;//b
	}
}
class Cbbb extends Caaa{
	public Cbbb(int i,int j){//cs
			super(i,j);
		}
	public Cbbb() {
		// TODO 自動產生的建構子 Stub
	}
	public void show() {
			System.out.println("num1="+num1);
			System.out.println("num2="+num2);
		}
}
public class class03 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Cbbb bb = new Cbbb();
		Cbbb aa = new Cbbb();
		bb.show();
		aa.show();
	}

}
