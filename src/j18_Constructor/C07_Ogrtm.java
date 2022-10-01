package j18_Constructor;

public class C07_Ogrtm {

    String isim;
    int tecrube;
    int kıdem=5;

    public C07_Ogrtm(String isim, int tecrube) {
        this.isim = isim;
        this.tecrube = tecrube;
    }
    public void kıdemHesapla(int kıdem){
        System.out.println("kıdemin "+(kıdem*2));
        System.out.println("kıdemin "+(this.kıdem*2));
    }



}
