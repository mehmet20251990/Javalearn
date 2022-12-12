package j29_Exceptions;

import java.io.IOException;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
Task -> girilen hava sıcaklığı 10'un altında ise IOException hatası tanımlayıp hatayı print eden method create
edip mainde kontrol ediniz.

Trick->
sicaklikKontrol(int sıcaklık){
 throw new IOException("Hava Gerçekten soğuk dışarı çıkma");
}
main(){
Scanner ...
try{
 sicaklikKontrol(int sıcaklık);
}
catch (IOException e) {
}
}
 */
        Scanner sc = new Scanner(System.in);
        System.out.println("sıcaklık gir");
        int x = sc.nextInt();
        try {
            if (x < 10) {
                sicaklikKontrol(x);
             //   throw new IOException("Hava Gerçekten soğuk dışarı çıkma");
            }
        } catch (IOException e) {
            System.out.println("sıcaklık çok düşük");
        }
        System.out.println("agam sorun handle edildi DEWAMKEEE :)");
    }
    private static void sicaklikKontrol(int x) throws IOException {
        throw new IOException("Hava Gerçekten soğuk dışarı çıkma");
    }
}

