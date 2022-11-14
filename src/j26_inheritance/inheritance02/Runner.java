package j26_inheritance.inheritance02;

import j26_inheritance.inheritance01.Koyun;
import j26_inheritance.inheritance01.Paluk;

public class Runner {
    public static void main(String[] args) {

        Kedi k1 = new Kedi(); //Hayvancık p.li cons.u çalıştı
                            //Mammal p.li cons çalıştı
                            //Mammal p.siz cons çalıştı
                            //Kedi p.siz cons çalıştı
        System.out.println("k1.a = " + k1.a); // 0
        System.out.println("k1.c = " + k1.c); // 2
        System.out.println("k1.d = " + k1.d); // 5
        System.out.println("k1.m = " + k1.m); // 1
        /*
      Ayni isimli variable'lardan hangisinin kullanildi
      olusturulan object'in data type'ina göre bilinir
      Variable'i arastirmaya data type'i classindan baslanır.
        */
        k1.mA();
        k1.mC();
        k1.mM();
        /*
     Method cagirilirken ayni isimli methodlardan
     hangisinin kullanilacagina Constructor karar verir.
     Methodlari arastirmaya Consctuctor ismini tasiyan
     class'dan baslayin ve parentlarda arastirmaya devam edin.
        */
        Mammal k2 = new Kedi("Kevser"); // Data Type Mammal Class -> Cons Kedi Classdan
        System.out.println("k2.c = " + k2.c);
        System.out.println("k2.a = " + k2.a);
        System.out.println("k2.m = " + k2.m);
        //System.out.println("k2.d = " + k2.d); CTE k2 data type Mammal Class olduğu için alttan variable call edilemez.
        k2.mA();
        k2.mC(); // override varsa meth.lar cons. olduğu classdan başlar.
        k2.mM();

        Mammal k3 = new Kedi();
        Hayvancık k4 = new Kedi();

        Mammal m1 = new Mammal('$');

        System.out.println("m1.m = " + m1.m);
        System.out.println("m1.c = " + m1.c);
        System.out.println("m1.a = " + m1.a);
        // System.out.println("m1.d = " + m1.d); // Alt classdan çağıramaz...
        m1.mA();
        m1.mC();
        m1.mM();
    }
}
