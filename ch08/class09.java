package java08;
class CCalculator
{
	int a;
	int b;
	int c;
	int add;
	int sub;
	int mul;
	double avg;
	
	void set_value(int x,int y,int z) {	//(a)
		a=x;
		b=y;
		c=z;
	}
	void show() {	//(b)
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(avg);
	}
	void add() {	//(c)
		add =a+b+c;
	}
	void sub() {	//(d)
		sub =a-b-c;
	}
	void mul() {	//(e)
		mul =a*b*c;
	}
	void avg() {	//(f)
		avg =(a+b+c)/3;
	}
	
}
public class class09 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		CCalculator obj = new CCalculator();
		obj.set_value(25,3,7);	//(a)
		obj.add();	//(c)
		obj.sub();	//(d)
		obj.mul();	//(e)
		obj.avg();	//(f)
		obj.show();	//(b)
	}

}
