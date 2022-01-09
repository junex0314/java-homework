package ch14;
import java.io.*;

public class class05 {

	public static void main(String[] args) throws IOException {
		// TODO 自動產生的方法 Stub
		char data[]=new char[128];
		FileReader fr = new FileReader("c:\\Users\\win10user\\Desktop\\donkey.txt");
		
		int num =fr.read(data);
		String str =new String (data,9,num);
		System.out.println(num);
		System.out.println(str);
		
		fr.close();
	}

}
