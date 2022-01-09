package ch11;
interface Data
{
	public void showData();
}
interface Test
{
	public void showScore();
	public double calcu();
}
class CStu implements Test,Data
{
	protected String id;
	protected String name;
	protected int mid;
	protected int finl;
	protected int common;
	public  CStu(String id,String name,int mid,int finl,int common) {
		this.id=id;
		this.name=name;
		this.mid=mid;
		this.finl=finl;
		this.common=common;
	}
	public void showData() {
		 System.out.println("學號:"+id);
		 System.out.println("姓名:"+name);
	}
	public void showScore() {
		System.out.println("期中:"+mid);
		System.out.println("期末:"+finl);
		System.out.println("學期:"+common);
		System.out.println("平均:"+calcu());
	}
	public double calcu() {
		return mid*0.3+finl*0.3+common*0.4;
	}
	public void show() {
		showData();
		showScore();
	}
}
public class class11 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		CStu stu = new CStu ("940001","Fiona",90,92,85);
		stu.show();
	}

}
