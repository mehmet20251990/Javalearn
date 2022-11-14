package j22_DateTime;

import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {

        // LocalTime -> saat dakika saniye tutar
        LocalTime suan = LocalTime.now(); // system'den anlık zaman bilgisi atanır.
        System.out.println("suan = " + suan); // 01:46:12.993849900
        System.out.println("suan.getHour() = " + suan.getHour());
        System.out.println("suan.getMinute() = " + suan.getMinute());
        System.out.println("suan.getNano() = " + suan.getNano()); //993849900
        System.out.println("suan.getSecond() = " + suan.getSecond());

        // belirli zamanda ileri geri gidilebilir
        LocalTime time1 = LocalTime.of(13,43,34);// belirli saat dk sn.si olan zaman atandı
        System.out.println("time1.plusHours(2) = " + time1.plusHours(2));
        System.out.println("time1.minusMinutes(34) = " + time1.minusMinutes(34));
        System.out.println("time1.plusHours(2).minusMinutes(45) = " + time1.plusHours(2).minusMinutes(45));

        LocalTime forBası = LocalTime.now();
        System.out.println("forBası = " + forBası);
        int sayı=0;
        for (int i= 0;i<100000; i++){
            sayı +=i;
        }
        LocalTime forSonu = LocalTime.now();
        System.out.println("forSonu = " + forSonu);
        System.out.println("forSonu.getNano()-forBası.getNano() = " + (forSonu.getNano() - forBası.getNano()));

    }
}