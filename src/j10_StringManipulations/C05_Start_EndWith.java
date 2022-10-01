package j10_StringManipulations;

import java.util.Scanner;

public class C05_Start_EndWith {
    public static void main(String[] args) {

        /**
         * startsWith()
         *  Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         *  String'in basladigi characteri dogrular
         * endsWith()
         * Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         */
        String sehir="istanbul";
        System.out.println(sehir.startsWith("i"));  // True
        System.out.println(sehir.startsWith("is")); // True
        System.out.println(sehir.startsWith("s"));  // False
        System.out.println(sehir.startsWith("a",3));  // True

        System.out.println(sehir.endsWith("l"));   // True
        System.out.println(sehir.endsWith("bul")); // True
        System.out.println(sehir.endsWith("bu"));  // False

        String str="bul";
        System.out.println(sehir.endsWith(str));   // True
        int yas=48;
        // System.out.println(sehir.endsWith(yas));   // CTE

        // Task-> Girilen email hesabı @gmail.com içermiyorsa "lütfen gmail hesabı giriniz",
        // bitiyorsa "hesabınız onaylandı" aksi durumda "geçerli hesap giriniz" print eden code create et.

        Scanner sc =new Scanner(System.in);
        System.out.println("gmail hesabı gir");
        String email= sc.nextLine().toLowerCase();
        if (email.endsWith("@gmail.com")){
            System.out.println("hesabınız onaylandı");
        }else {
            System.out.println("geçerli hesap gir");
        }
    }
}
