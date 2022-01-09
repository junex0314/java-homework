package ch13;

public class class06 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		try {
			int num = 12;
			int den[]= {12,0,3,0,0,4};
			for (int i=0;i<10;i++) {
				System.out.println("ans="+num/den[i]);
			}
		} catch (Exception e) {
			System.out.println("捕捉到了例外了");
		}
	}

}
