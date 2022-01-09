package ch14;
import java.io.*;
final class class02 {

	public static void main(String[] args) throws IOException{
		// TODO 自動產生的方法 Stub
		char data[]=new char[128];
		FileReader fr = new FileReader("c:\\Users\\win10user\\Desktop\\junex.txt");
		
		int num =fr.read(data);
		String str =new String (data,0,num);
		System.out.println(str.toUpperCase());

		fr.close();
	}

}
