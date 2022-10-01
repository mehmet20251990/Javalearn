package j18_Constructor;

public class C07_OgrtmRunner {
    public static void main(String[] args) {

        C07_Ogrtm hcm = new C07_Ogrtm("Emine Öğretmen",7);
        System.out.println(hcm.isim); // Emine Öğretmen
        System.out.println(hcm.kıdem); // 5
        hcm.kıdemHesapla(13); // kıdemin 26, kıdemin 10

    }
}
