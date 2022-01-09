package ch13;
class NotTriangle extends Exception{
	
}
class EquilateralTriangle extends Exception{
	
}
class NotEquilateralTriangle extends Exception{
	
}
public class class12 {
	public static void triangle(int a,int b,int c) throws NotTriangle,EquilateralTriangle,NotEquilateralTriangle{
		int a1 = a;
		int b1 = b;
		int c1 = c;
		
		if ((a1+b1)<c1 || (a1+c1)<b1 ||(b1+c1)<a1) {
			throw new NotTriangle();
		}
		else if (a1==b1 && a1==c1 && b1==c1) {
			throw new EquilateralTriangle();
		}
		else {
			throw new NotEquilateralTriangle();
		}
	}

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		try {
			triangle(1,1,12);
		}
		catch(NotTriangle e) {
			System.out.println("不構成三角形");
		}
		catch(EquilateralTriangle e) {
			System.out.println("這是正三角形");
		}
		catch(NotEquilateralTriangle e) {
			System.out.println("這不是正三角形");
		}
	}

}
