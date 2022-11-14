package j22_DateTime;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class C05_ZoneDateTime {
    public static void main(String[] args) {

        // herhangi bir ülke-şehir-> local tarih ve zaman bilgisi tutar
        LocalDate trhZone = LocalDate.now(ZoneId.of("America/New_York"));
        LocalDate trhZone1 = LocalDate.now(ZoneId.of("Japan"));

        System.out.println("trhZone = " + trhZone);
        System.out.println("trhZone1 = " + trhZone1);

        ZonedDateTime zdt1 = ZonedDateTime.now(ZoneId.of("America/New_York"));
        //ZonedDateTime zdt2 = ZonedDateTime.now(ZoneId.of("America")); // Farklı saatler olduğu için yerelde belirtilmeli
        ZonedDateTime zdt3 = ZonedDateTime.now(ZoneId.of("Japan")); // Tek saat uygulandığı için sıkıntı yok

        System.out.println("zdt1 = " + zdt1);
        //System.out.println("zdt2 = " + zdt2);
        System.out.println("zdt3 = " + zdt3);


    }
}
