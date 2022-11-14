package j26_inheritance.inheritance01;

public class Runner {
    public static void main(String[] args) {
/*
 1) Java'da class'lar arasinda parent(Aile)-child(Cocuk)  relationship(iliski) tanımlanmıştır.
 2) Parent Class'a "super class"   Child Class'a "subclass"  denir.
 3) Ortak ozellikler parent class'a, specific ozellikler child class'a tanımlanır.
 4) Parent Child Relationship "reusability", "maintenance", "less code", "well organization" avantajları içim kullanılır.
 5) Child classlar parent'lardaki her methodu ve variable'i  kullanabilir ama parent class child'dakileri kullanamaz.
 6) Java "Multiple Inheritance"i desteklemez. Yani; Java'da  bir Child Class'in 1'den fazla parent'i olamaz.
 7) Bir parent class, 1'den fazla child class ile olusturulan  parent child relationship'e
    "Hierarchical Inheritance" denir.
 8) Child-Parent-Grandparent... seklinde olusturulan cok katli parent child relationshipe'e multi-level inheritance denir.
 9) "Object Class" -> Hz.Adem Class :) butun classlarin parent class'idir.
     Java'da parent class'i olmayan tek class "Object Class"dir
*/

        Hayvancık hyvn = new Hayvancık(); //Hayvancık p.siz cons.u çalıştı
        hyvn.hareket();
        hyvn.içme();
        hyvn.yeme();
        System.out.println("     ***     ");

        Mammal m1 = new Mammal(); //Hayvancık ve Mammal p.siz cons çalıştı
        m1.sutleBeslenme();
        m1.dogum();
        m1.içme();
        m1.yeme();
        m1.hareket();
        System.out.println("     ***     ");

        Paluk hms = new Paluk(); //Hayvancık p.siz cons çalıştı
        hms.ızgaraTava();
        hms.hareket();
        hms.içme();
        hms.yeme();
        System.out.println("     ***     ");

        Kedi kd = new Kedi(); //Hayvancık, Mammal ve Kedi p.siz cons çalıştı
        kd.cırmala();
        kd.hareket();
        kd.dogum();
        kd.yeme();
        kd.sutleBeslenme();
        System.out.println("     ***     ");

        Hayvancık Kyn = new Koyun(); ////Hayvancık, Mammal ve Koyun p.siz cons çalıştı
        Kyn.hareket();
        Kyn.yeme();
        Kyn.içme();

        // TRİCK-> Parent class obj.si child class'da create edilirse cons.lar hepsi sırayla çalışır
        // fakat variablelar ve methodlar data type olduğu classdan başlar. Override varsa meth.lar alttan almaya başlar.

    }
}
