package j19_StaticVariable;

public class C01_OgrtmnRunner {
    public static void main(String[] args) {

        C01_Ogrtmn hc1= new C01_Ogrtmn("cüneyt", 11);
        System.out.println(hc1.tecrube);
        System.out.println(hc1.isim);
        // hc1.okul="kabadaş"; // static var. obj ile call edilmez. Bad practise...
        System.out.println(hc1.okul); // Null
        C01_Ogrtmn.okul= "Kabataş E.L."; // Update oldu... Kabataş E. L.

        C01_Ogrtmn hc2= new C01_Ogrtmn("bekir", 7);
        System.out.println(hc2.tecrube);
        System.out.println(hc2.isim);
        System.out.println(hc2.okul); // Kabataş E. L.

        C01_Ogrtmn hc3= new C01_Ogrtmn("nazım", 13);
        System.out.println(hc3.tecrube);
        System.out.println(hc3.isim);
        System.out.println(hc3.okul); // Kabataş E. L.

        hc1.evlilikYıldonumu(); // obj ile nonstatic meth call ettik

        C01_Ogrtmn.maasHesapla(); // class ile static meth call ettik
        hc2.maasHesapla(); // obj ile static meth call ettik -> bad practise

    }

}
