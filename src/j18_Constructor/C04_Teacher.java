package j18_Constructor;

public class C04_Teacher {

    String ad;
    String soyad;
    String branş;
    int tecrube;
    double maaş;
    int id;
    boolean emekli;

    public void dersSaati(){
        System.out.println("20 saaten sonrası extra");
    }

    public C04_Teacher() { // parametrelinin ezdiği default cons yerine parametresiz cons yazdık
    }

    // King of TRICK -> parametreli cons default cons.u ezer
    public C04_Teacher(String ad, String soyad, String branş, int tecrube, double maaş, int id, boolean emekli) {
        this.ad = ad;
        this.soyad = soyad;
        this.branş = branş;
        this.tecrube = tecrube;
        this.maaş = maaş;
        this.id = id;
        this.emekli = emekli;
    }

    @Override
    public String toString() {
        return "C04_Teacher{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", branş='" + branş + '\'' +
                ", tecrube=" + tecrube +
                ", maaş=" + maaş +
                ", id=" + id +
                ", emekli=" + emekli +
                '}';
    }
}
