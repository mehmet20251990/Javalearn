package j18_Constructor;

public class C03_Student {// main olmyan sadece student obj create etmek için pojo
                         // pojo-> plan object java old : obj için standart class kalıphane
    // fields
    String ad;
    String soyad;
    int sınıf;
    double ortalama;
    int okulNo;
    boolean takdir;

    public void mezuniyet(){ // method
        if (ortalama>=50){
            System.out.println("diploman hayırlı olsun");
        }else System.out.println("seneye devam");
    }

    @Override
    public String toString() { // obj referans değeri print etmemesi için obj datalarını  stringe ceviren method
        return "C03_Student{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", sınıf=" + sınıf +
                ", ortalama=" + ortalama +
                ", okulNo=" + okulNo +
                ", takdir=" + takdir +
                '}';
    }
}
