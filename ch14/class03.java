package ch14;
import java.io.*;
import java.util.Scanner;
public class class03 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("輸入一個整數:");
		int a= sc.nextInt();
		
		for (int i=1;i<=a;i++) {
			sum+=i;
		}
		System.out.println("1+2+...+"+a+"="+sum);
	}

}
