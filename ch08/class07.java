package java08;
class CTest
{
	int a;
	
	void test() {		//(7)
		if (a==0) {
			System.out.println("���Ƭ�0");
		}
		else if (a%2!=0) {
			System.out.println("���Ƭ��_��");
		}
		else {
			System.out.println("���Ƭ�����");
		}
	}
}
public class class07 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		CTest Ctest = new CTest();
		int [] arry = {3,8,0};
		for (int i=0 ; i<arry.length ;i++) {
			Ctest.a = arry[i];
			Ctest.test();
		}
	}
}
