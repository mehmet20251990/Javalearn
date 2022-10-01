package j18_Constructor;

public class C02_Arac {
    // Fields
    String marka;
    String model;
    int km=10;
    double motorHcm;
    boolean vitesAuto=false;
    boolean ikinciEl;
    int yıl;

    public static void main(String[] args) {

    C02_Arac arac1= new C02_Arac(); // default cons ile arac1 obj si create edildi.
    arac1.ikinciEl=true;
    arac1.marka="volvo";
    arac1.km=50000;
    arac1.model="xc60";
    arac1.motorHcm=2.4;
//                            volvo           xc60           50000      default=0         true              2.4
        System.out.println(arac1.marka+" "+arac1.model+" "+arac1.km+" "+arac1.yıl+" "+arac1.ikinciEl+" "+ arac1.motorHcm);

        // Task -> ikinci bir aracın tüm fieldlarını atayarak create ediniz
        C02_Arac arac2= new C02_Arac(); // default cons ile arac1 obj si create edildi.
        arac2.ikinciEl=true;
        arac2.marka="audi";
        arac2.km=5000;
        arac2.model="a3";
        arac2.motorHcm=2.4;
        arac2.vitesAuto=true;
        arac2.yıl=3;
        System.out.println(arac2.marka+" "+arac2.model+" "+arac2.km+" "+arac2.yıl+" "+arac2.ikinciEl+" "+ arac2.motorHcm+" "+arac2.vitesAuto);

        System.out.println(arac2);// override ile çağırdık hepsini
    }

    @Override
    public String toString() {
        return "C02_Arac{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", km=" + km +
                ", motorHcm=" + motorHcm +
                ", vitesAuto=" + vitesAuto +
                ", ikinciEl=" + ikinciEl +
                ", yıl=" + yıl +
                '}';
    }
}
