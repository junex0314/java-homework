package ch15;
class CTest extends Thread{
	String id;
	public CTest(String str) {
		id = str;
	}
	public void run()
	{
		for (int i=1;i<=5;i++) {
			System.out.println(id+" "+i);
		}
	}
}
public class class02 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		CTest hi = new CTest("Hellow");
		CTest bye = new CTest("Good bye");
		hi.run();
		bye.run();
		
	}

}
