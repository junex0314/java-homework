// app12_6.java,此檔案置於pack6資料夾內
package pack6;  // 將app12_6類別納入package pack6當中

import pack6.subpack1.CCircle;
import pack6.subpack1.subpack.CStyle;
import pack6.subpack2.CRectangle;

public class class06
{
   public static void main(String args[])
   {
      CCircle cir=new CCircle();
      CRectangle rect=new CRectangle();
      CStyle sty = new CStyle(1);
      cir.show();
      rect.show();
   }
}
