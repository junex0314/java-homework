package app10_1;

class Caaa
{
	public int num1;
	public int num2;
}
class Cbbb extends Caaa{
		public void set_num(int i,int j){
		num1 = i;
		num2 = j;
		}
		public void show() {
			System.out.println("num1="+num1);
			System.out.println("num2="+num2);
		}
}
public class class01 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Cbbb bb = new Cbbb();
		bb.set_num(5,10);
		bb.show();
	}

}
