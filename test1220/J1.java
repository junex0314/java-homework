import java.util.Scanner;
public class J1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("密碼輸入測試");
		System.out.println("請輸入密碼:");
		int a=sc.nextInt();
		System.out.println("請再輸入一次密碼:");
		try {
			for (int i=1;i<=3;i++) {
			Scanner ac =new Scanner(System.in);
			int b=ac.nextInt();
			if (a==b) {
				System.out.println("密碼正確");
				break;
			}
			else if(a!=b && i==3) {
				 throw new RuntimeException();
			}
			else if(a!=b) {
				System.out.println("與第一次輸入的不同!");
				System.out.println("請再輸入一次密碼:");
			}
			}
		}catch( RuntimeException e){
			System.out.println("輸入三次錯誤！程式停止！");
		}
	}

}
