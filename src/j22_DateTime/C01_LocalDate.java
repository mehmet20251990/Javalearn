package j22_DateTime;

import java.time.LocalDate;
import java.time.Month;

public class C01_LocalDate {

    public static void main(String[] args) {
        LocalDate bugun = LocalDate.now();
        System.out.println("bugün = " + bugun); //2022-11-04
        System.out.println("bugun.getYear() = " + bugun.getYear());
        System.out.println("bugun.getMonthValue() = " + bugun.getMonthValue()); //11
        System.out.println("bugun.getMonth() = " + bugun.getMonth()); //NOVEMBER
        System.out.println("bugun.getDayOfMonth() = " + bugun.getDayOfMonth()); //4
        System.out.println("bugun.getDayOfYear() = " + bugun.getDayOfYear()); //308
        System.out.println("bugun.getDayOfWeek() = " + bugun.getDayOfWeek()); //FRIDAY

        LocalDate date1 = LocalDate.of(1923,10,29);
        LocalDate date2 = LocalDate.of(1923, Month.OCTOBER,29);

        // verilen bir tarihin öncesi ve sonrasına gitme...minus()->önceki tarih, plus()->sonraki tarih

        System.out.println("date1.plusDays(12) = " + date1.plusDays(12));
        System.out.println("date2.plusMonths(3) = " + date2.plusMonths(3));
        System.out.println("bugun.plusWeeks(6) = " + bugun.plusWeeks(6));
        System.out.println("bugun.minusMonths(5) = " + bugun.minusMonths(5));
        System.out.println("bugun.plusDays(43).minusMonths(2) = " + bugun.plusDays(43).minusMonths(2));

    }
}
