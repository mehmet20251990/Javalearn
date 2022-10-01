package j02_DataTypes_WrapperClass;

public class C04_WrapperClass {

    public static void main(String[] args) {

        String name="Mehmet";
        int age=32;

        System.out.println(name.toLowerCase()); // mehmet

        // non-primitive data turleri data depolamak yaninda kullanışlı birçok method'a sahiptir
        // Ancak primitive data turlerinin boyle bir ozelligi yoktur
        // primitive data turleri sadece degerleri saklarlar (container) ve herhangi bir özellik(method) vs bulundurmaz.
        // Ancak primitive data turleri icin de bazi işlemler için (String'den tamsayı çekme) method'lar ihtiyaç
        // olduğunda Java her bir primitive data turunu, non-primitive  Wrapper Class  oluşturarak ilgili methodlarla
        // ara çözüm imkanı sunmuştur.

        String tc = "123456"; // Değişmez, işleme sokulmaz ya da işleme girmesini istemediğimiz sayılar da String'dir.
        String id = "987654";
        int yenitc = Integer.valueOf(tc); // String değerini int a çevirdi ve yenitc ye atadı.
        int yeniid = Integer.valueOf(id);

        System.out.println("yenitc = " + yenitc);
        System.out.println("yeniid = " + yeniid);
        System.out.println(yeniid+yenitc);

        String okulNo="2345431"; // Sonu 1 değilde A olsaydı, RTE verirdi.
        int yeniOkulNo= Integer.valueOf(okulNo); // Run Time Exception -> Çalışma Zamanı Hatası
        System.out.println("yeniOkulNo = " + yeniOkulNo);

        // TASK-> byte short int max ve min değerlerini print eden kod yaz.

        byte maxByteDegeri = Byte.MAX_VALUE;
        byte minByteDegeri = Byte.MIN_VALUE;
        System.out.println("maxByteDegeri = " + maxByteDegeri);
        System.out.println("minByteDegeri = " + minByteDegeri);

        int maxIntegerDegeri = Integer.MAX_VALUE;
        int minIntegerDegeri = Integer.MIN_VALUE;
        System.out.println("maxIntegerDegeri = " + maxIntegerDegeri);
        System.out.println("minIntegerDegeri = " + minIntegerDegeri);

        int a=5;
        System.out.println(a); // 5
        System.out.println(5); // 5



    }
}
