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
       ama abs class'da concerete emthod tanımlanabilir

     */





}
