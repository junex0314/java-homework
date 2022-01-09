package ch14;
import java.io.*; 
public class class06 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		try
		{
		char data[]=new char[128];
		FileReader fr=new FileReader("c:\\Users\\win10user\\Desktop\\donkey.txt");
		
		int num=fr.read(data);
		String str=new String(data,0,num);
		System.out.println("Characters read= "+num);
		System.out.println(str);
		
		fr.close();
		}
		catch(IOException e) {
			
		}
	}

}
