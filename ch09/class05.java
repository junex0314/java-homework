/**
 * 
 */
package java09;
 class CCount  
 {  
 private static int cnt=0;  
  
 public  CCount()  
 {  
 count();  
 }  
 public static void count()  //(b)
 {  
 cnt++;  
 }  
 public static void setZero()  
 {  
 cnt=0;  
 }  
 public static void setValue(int n)  //(c)
 {  
 cnt=n;  
 }  
 public static void show()  
 {  
 System.out.println("cnt="+cnt);  
 }  
 }  
  
 public class class05  
 {  
 public static void main(String args[])  
 {  
 CCount cn1=new CCount();  
 CCount cn2=new CCount();  
 CCount cn3=new CCount(); 
 CCount.show();  
  
 CCount.setZero();  
 System.out.println("using setZero()...");  
 CCount.show();  
  
 CCount.setValue(10);  
 System.out.println("using setValue(10)...");  
 CCount.show();  
 }  
} 
