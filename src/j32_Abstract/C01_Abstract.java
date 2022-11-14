package j32_Abstract;

public class C01_Abstract {
    /*
    1- Bazı durumlarda child classlar parent classdaki meth.ların genellikle bodylerini değiştirerek override ederler.
    Bu gibi durumlarda parent classdaki meth.a body tanımlamak ram ve memory açısından gereksizdir.
    Çözüm olarak Java parent classa bodysiz -> abstract(soyut) meth.lar tanımlamıştır.

    2- Parent classdaki abstract meth.lar app güvenliği açısından child classda override edilmek zorundadır.
    Eğer parent classdaki child classın mutlaka kullanması gereken meth varsa abstract tanımlanmalı.
    motor() her araçta olmalı.

    3- abstract method tanımlamak  için
      a) {} body olmaz
      b) access modief sonrası abstract keyword kullanılmalı
      abstrack class tanımlamak için class ifadesinden önce abstract keyword kullanılmalı.

    4- Abs method sadece abs Class'da tanımlanabilir kesinlikle concrete class'da abs method tanımlanamaz.
       ama abs class'da concerete method tanımlanabilir

    5- Abs Class içinde hem abs method hem de concrete method ve variable tanımlanabilir.

    6- Bir concerete child class parent abs class extend ettiğnde abs method'ları implement etnek zorunda
        ama concerete methodlar isteğe göre override edilir.

    7- Parent child ilşkisi olan abstarct class'lar abs method'ları implement etmek zorunda değil

    8- Parent olan abs class birden çok concerete  veya abs child class extends edibilir.
        ancak child class birden cok abs parent class'dan extends e-de-mezz...

    9-  Abs Class'da final abs method tanımlanamaz CTE -> final method override edilemeyecegi için abs olamaz

    10- Abs Class'da private abs method tanımlanamaz CTE -> private method override edilemeyecegi için abs olamaz

    11- Abs Class'da static abs method tanımlanamaz CTE-> static method override edilemeyecegi için abs olamaz

        **** ABSTRACT CLASS ASLA KESİNLİKLE OBJE URETEMEZ !!!!
        TRİCK-> Abstract Class'lar referansı child Class'ın obj tutabilir(Polimorphism)
     */

}
