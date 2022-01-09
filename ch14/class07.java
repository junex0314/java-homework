package ch14;
import java.io.*; 
public class class07 {

	public static void main(String[] args) throws IOException{
		// TODO 自動產生的方法 Stub
		String str;
		int count=0;
		FileReader fr=new FileReader("c:\\Users\\win10user\\Desktop\\donkey.txt");
		BufferedReader bfr=new BufferedReader(fr);
		
		while((str=bfr.readLine())!=null) {
			if(count==1) {
				bfr.skip(14);
			}
			System.out.println(str);
			count++;
			}
		fr.close();
	}

}
