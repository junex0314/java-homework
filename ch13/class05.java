package ch13;

public class class05 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		try {
			int num = 12;
			int den[]= {12,0,3,0,0,4};
			for (int i=0;i<10;i++) {
				System.out.println("ans="+num/den[i]);
			}
		} catch (ArithmeticException e) {
			System.out.println("���Ƭ�0");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�}�C���ޭȶW�X�F�d��");
		}
		
	}

}
