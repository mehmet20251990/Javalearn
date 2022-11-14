package j22_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class C03_LocalDateTime {
    public static void main(String[] args) {

        // LocalDateTime-> tarih(yıl ay gün) ve zaman(saat dk sn mlsn) bilgilerini tutar

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt); // 2022-10-25T23:02:21.686715500

        LocalDate d = LocalDate.of(2016,3,13); // tarih ataması
        LocalTime t = LocalTime.of(14,45,35); // zaman ataması

        LocalDateTime trhZmn = LocalDateTime.of(d,t);
        System.out.println("trhZmn = " + trhZmn);
        LocalDateTime ldt1 = LocalDateTime.of(2018, Month.MAY, 19, 20, 30);
        System.out.println("ldt1 = " + ldt1);
        System.out.println("trhZmn.getDayOfMonth() = " + trhZmn.getDayOfMonth());
        System.out.println("trhZmn.getDayOfWeek() = " + trhZmn.getDayOfWeek());
        System.out.println("trhZmn.getHour() = " + trhZmn.getHour());

        // Tarih, zaman da ileri geri yapılabilir
        System.out.println("trhZmn.plusDays(75) = " + trhZmn.plusDays(75));
        System.out.println("trhZmn.minusMonths(3) = " + trhZmn.minusMonths(3));
        System.out.println("trhZmn.plusHours(78).minusWeeks(12) = " + trhZmn.plusHours(78).minusWeeks(12));

    }
}
