package j29_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_FileInputStreamException01 {
    /*
     Dosya okuma/yazma işlemi bu işlemlerde hata olasılığı yüksek olduğundan hata kontrolü zorunlu tutuluyor.
     bu yüzden try-catch e alınması bu kodun zorunlu tutuluyor. bu gibi surumlara karşılk gelen hatalara
     Checked Exception denir. Özellikle IO(input output) işlemleri CHECKED EXCEPTİON dur.

    Bir kod yazilirken olasi exception'lar ongorulup
    exception olustugunda Java'nin ne yapmasini istedigimiz
    belirtilmelidir.

         1) FileNotFoundException, ustunde calisilicak bir dosyaya ulasma ile ilgili problemlerde
   kullanilir. Bir dosyaya ulasmada iki temel problem olabilir; a) Path yanlistir. b) Dosya silinmistir.

   2) IOException, input ve output ile alakali tum problemlerde kullanilir. IOException,
  FileNotFoundException'in yaptigi tum aksiyonları yapabilir dolayısıyla IOException kullanildiginda
  FileNotException'in kullanilmasina gerek yoktur. IOException FileNotFoundException
  Class'inin parent class Hz.Adem
   */
    public static void main(String[] args) throws IOException { // IO işlemleri en parent class exception
    //public static void main(String[] args) throws FileNotFoundException {// read() meth import öncesi child exception

        FileInputStream fis=new FileInputStream("C:\\Users\\samet\\IdeaProjects\\javaLearn\\src\\j29_Exceptions\\ebikGabık");
        // ilgili dosyaya ulaşmak için fis obj tanımlandı parametre olarak ulaşılacak dosya yolu(path) girildi
        // FileNotFoundException -> adres yanlışsa kontrolü

        /*
        Eğer bir methodda Checked (CTE riski olan excp.) exception varsa meth sign( meth name den sonraki bölüm) hata
        uyarısı altı kırmızı çizgi verir. komutun derlenmesine izin vermez ve kod üzerine gelindiğinde
        Add... exception handle etme tavsiye eder oto throws excp eklenir.
        bu şekilde meth call eden komutlar try-catch alınması garanti edilmiş olur.
         */

        int k;
        while ((k = fis.read())!= -1) {
            System.out.print((char)k); // k int ASCİİ olan file değeri char içi casting -> type dönüşümü
        }
        System.out.println("agaya selamlar");
    }
}
