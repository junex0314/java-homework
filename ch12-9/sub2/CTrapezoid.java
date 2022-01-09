package pack9.sub2;

public class CTrapezoid {
	int upper,base,height;
	public CTrapezoid(int u,int b,int h) {
		upper = u;
		base = b;
		height = h;
	}
	public void show() {
		System.out.println("±è§Îªº­±¿n="+(upper+base)*height/2);
		System.out.println("upper="+upper);
		System.out.println("base="+base);
		System.out.println("height="+height);
	}
}
