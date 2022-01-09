package ch111;
interface Data
{
	public void best();
	public void failed();
}
interface Test extends Data
{
	public void showData();
	public double average();
}
class CStu implements Test
{
	protected String name;
	protected int math;
	protected int english;
	public CStu (String name,int math,int english) {
		this.name=name;
		this.math=math;
		this.english = english;
	}
	public void best() {
		if (math>english) {
			System.out.println(name+"���ƾǤ�^��n");
		}
		else if (english>math) {
			System.out.println(name+"���^���ƾǦn");
		}
	}
	public void failed() {
		if(math<60 & english>60) {
			System.out.println(name+"���ƾǷ��F");
		}
		else if(english<60 & math>60) {
			System.out.println(name+"���^����F");
		}
	}
	public void showData() {
		System.out.println("�m�W:"+name);
		System.out.println("�ƾǦ��Z:"+math);
		System.out.println("�^�妨�Z:"+english);
	}
	public double average() {
		return (english+math)/2;
	}
	public void show() {
		showData();
		average();
		best();
		failed();
	}
}
public class class12 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		CStu stu = new CStu ("Judy",58,91);
		stu.show();
	}

}
