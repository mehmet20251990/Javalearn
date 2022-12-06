package j37_Enum.enum04;

import j26_inheritance.Task01.A;

public enum Aylar {
   // OCAK(31,"kış","hayırlı seneler"),
    OCAK(31),
    SUBAT(28),
    MART(31),
    NISAN(30),
    MAYIS(31),
    HAZIRAN(30),
    TEMMUZ(31),
    AGUSTOS(31),
    EYLUL(30),
    EKIM(31),
    KASIM(30),
    ARALIK(31);
    int gunler;

    //Aylar(int gunSayısı, String mevsim, String birthDay) {//p.li cons p.sizi ezer enumdaki fields lara value girmemiz lazım}
    Aylar(int gunSayısı){
        gunler= gunSayısı;
    }
    void gunMiktarı(){//meth
        System.out.println("günler"+gunler);
    }
}
