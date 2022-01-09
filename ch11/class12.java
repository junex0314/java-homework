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
			System.out.println(name+"的數學比英文好");
		}
		else if (english>math) {
			System.out.println(name+"的英文比數學好");
		}
	}
	public void failed() {
		if(math<60 & english>60) {
			System.out.println(name+"的數學當掉了");
		}
		else if(english<60 & math>60) {
			System.out.println(name+"的英文當掉了");
		}
	}
	public void showData() {
		System.out.println("姓名:"+name);
		System.out.println("數學成績:"+math);
		System.out.println("英文成績:"+english);
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
		// TODO 自動產生的方法 Stub
		CStu stu = new CStu ("Judy",58,91);
		stu.show();
	}

}
