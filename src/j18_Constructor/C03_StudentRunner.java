package j18_Constructor;

public class C03_StudentRunner {
    public static void main(String[] args) {

        C03_Student ogrc1 = new C03_Student();

        ogrc1.ad="Fatih";
        ogrc1.soyad="Ataş";
        ogrc1.sınıf=1;
        ogrc1.okulNo=1001;
        ogrc1.ortalama=77;
        ogrc1.takdir=false;

        System.out.println("ogrc1 = " + ogrc1);// referansını verir... Override edilince istenilen değerleri verir.
        System.out.println(ogrc1.ad+" "+ogrc1.soyad);
        ogrc1.mezuniyet();

        // Task -> ögrenci 2 için değerleri print et

        C03_Student ogrc2 = new C03_Student();

        ogrc2.ad="Mehmet";
        ogrc2.soyad="Şimşek";
        ogrc2.sınıf=1;
        ogrc2.okulNo=10;
        ogrc2.ortalama=97;
        ogrc2.takdir=true;

        System.out.println("ogrc2 = " + ogrc2);
        ogrc2.mezuniyet();
    }
}
