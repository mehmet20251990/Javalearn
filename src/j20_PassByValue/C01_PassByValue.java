package j20_PassByValue;

import org.w3c.dom.ls.LSOutput;

public class C01_PassByValue {

    public static void main(String[] args) {
      /*
    Java Pass by value bir programlama dilidir.
    Bir primitive variable argument olarak bir meth.a call edildiğinde variable değil,
    bir copy clone (vesikalık) (pointer) değeri gönderilir.
     */
        // Task-> verilen fiyat için %24 artırılmış fiyatı print eden method create ediniz.

        double fiyat =100;//primitive double type variable

        System.out.println("method call öncesi fiyat  değeri = " + fiyat);//100

        fiyatArttır(fiyat);//fiyat variable method'a parametre call edildi
        System.out.println("method call sonrası fiyat  değeri = " + fiyat);//100

    }//main sonu
    public static  void fiyatArttır(double bisey){
        bisey*=1.24;
        System.out.println("arttırılmış fiyat :"+bisey);
    }
}