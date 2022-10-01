package j12_Loops.L01_ForLoops;

public class C01_ForLoop {

    public static void main(String[] args) {

        /*
        loop -> döngü, tekrarlanan aksiyonlar için kullanılan code bloklarıdır...
         */

        //   başlangıç   bitiş   değişim
        for (int i=1  ;  i<=11 ;  i++  ){
            System.out.println(i+".maşallah");
        }

        // TASK-> 2 basamaklı tek sayıları yanyana yazdır
        for (int i=11; i<=99; i+=2){
            System.out.print(i);
        }
        for (int i=10; i<=100; i++){
            if (i%2==1){
                System.out.print(i);
            }
        } // eğer şart sağlanmazsa -> False olan for body run olmaz, kod kırılarak sıradaki satırdan devam eder...
        // eğer şart sürekli olarak sağlanıyorsa da sonsuza kadar devam eder...



    }

}
