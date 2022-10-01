package j18_Constructor;

public class C04_TeacherRunner {
    public static void main(String[] args) {

        C04_Teacher ogrt1= new C04_Teacher();

        ogrt1.ad="Muharrem";
        ogrt1.soyad="Güzel";
        ogrt1.branş="Qa";
        ogrt1.emekli=false;
        ogrt1.maaş=23000;
        ogrt1.tecrube=11;

        ogrt1.dersSaati();
        System.out.println(ogrt1);

        C04_Teacher ogrt2= new C04_Teacher("Mehmet","Şimşek","Qa",2,55000,1,false);
        System.out.println(ogrt2);

    }
}
