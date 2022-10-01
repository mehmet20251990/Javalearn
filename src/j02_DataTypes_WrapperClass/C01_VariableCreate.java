package j02_DataTypes_WrapperClass;

public class C01_VariableCreate {

    public static void main(String[] args) {
        // 1. yol-> best practice (Recommended)
        int yas=48;
        int maas=33000;
        System.out.println(yas); //48
        System.out.println("maaş");
        System.out.println(maas); // maas.s yazarak da hızlıca print satırına ulaşabilirsin.
        System.out.println("Nur Hanımın başlanagıç maaşı : "+maas); // Nur Hanımın başlangıç maaşı : 33000 ->yazar

        // 2. Yol
        int boy; // değeri atanmayan boy isminde bir int tanımlandı declaration
        // System.out.println(boy); //değeri atanmamış boy hiçbir aksiyonda kullanılamaz. CTE
        // İnitialize etmek ilk değer atamaktır.
        boy=175;
        System.out.println("Boyunuz:" +boy); // 175

        //3. Yol
        int yevmiye,age,kilo; // birden çok aynı tipte değişken tanımlandı.
        age=32;
        yevmiye=1000;
        kilo=70; //tanımlanan değişkenlere değer ataması yapıldı.

        int gunluk=1500, yil=2022, agirlik=70;
        // TRİCK bir variable sadece birkez tanımlanabilir ama birden çok değer atanabilir.

        System.out.println(gunluk); //1500
        gunluk=1800; // gunluk yeni değeri 1800 oldu.
        System.out.println("Günlük son değer:"+gunluk); //1800
        System.out.println("Günlük değer:"+gunluk+" Yıl:"+yil+" "+yas+yevmiye+agirlik);



    }
}
