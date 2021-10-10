package java08;
class CTest
{
	int a;
	
	void test() {		//(7)
		if (a==0) {
			System.out.println("计0");
		}
		else if (a%2!=0) {
			System.out.println("计计");
		}
		else {
			System.out.println("计案计");
		}
	}
}
public class class07 {

	public static void main(String[] args) {
		// TODO 笆玻ネよ猭 Stub
		CTest Ctest = new CTest();
		int [] arry = {3,8,0};
		for (int i=0 ; i<arry.length ;i++) {
			Ctest.a = arry[i];
			Ctest.test();
		}
	}
}
