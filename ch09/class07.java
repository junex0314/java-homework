package java09;
 class b{
	public static void power(int x,int n) {
		int sum =1;
		for (int i=0;i<n;i++) {
			sum=sum*x;
		}
		System.out.println(sum);
	}
}
public class class07 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		b.power(2,5);
		b.power(3,2);
	}

}
