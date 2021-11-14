package java09;

class c{
	static double pi =3.14;
	double radius;
	public c(double r){
		radius = r;
	}
	public static  double b(c d[]){
		double max=0.0;
	      for(int i=0;i<d.length;i++)
	         if(d[i].radius>max)
	            max=d[i].radius;
	      return max;
	}
}
public class class15 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		c cir[];
	      cir=new c[3];
	      cir[0]=new c(1.0);
	      cir[1]=new c(4.0);
	      cir[2]=new c(2.0);
	      System.out.println("Largest radius = "+ c.b(cir));
	}

}
