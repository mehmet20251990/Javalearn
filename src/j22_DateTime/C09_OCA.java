package j22_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class C09_OCA {
    public static void main(String[] args) {
        // Task -> OCA-01
        String date1 = LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(date1);
        //what is the result ?
        /*
         * A) May 04, 2014T00:00:00:000
         *
         * B) 2014-05-04T00:00:00:000
         *
         * C) 5/4/14T00:00:00:000
         *
         * D) An exception is throw at runtime *********
         */


        // Task -> OCA-02
        /*TODO
           Which of the following can be inserted into the blank to create a date of June 21, 2014?
           21 Haziran 2014 tarihini olusturmak için bos bırakılan yere asagidakilerden hangisi veya hangileri getirilebilir?
           A. new LocalDate(2014, 5, 21);
           B. new LocalDate(2014, 6, 21);
           C. LocalDate.of(2014, 5, 21);
           D. LocalDate.of(2014, 6, 21); ***********
           F. LocalDate.of(2014, Month.JUNE, 21); **********
         */
        LocalDate dt1 = LocalDate.of(2014, 6, 21);
        LocalDate dt2 = LocalDate.of(2014, Month.JUNE, 21);
        System.out.println("dt1 = " + dt1);
        System.out.println("dt2 = " + dt2);


        // Task -> OCA-03
        /*
     What is the output of the following code?
     Asagidaki code'un  ciktisi  nedir?
*/
        //LocalDate date = LocalDate.of(2018, Month.APRIL, 40);
        LocalDate date = LocalDate.of(2000,Month.FEBRUARY, 29);
        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
/*
            A. 2018 APRIL 29
            B. 2018 APRIL 30
            C. 2018 MAY 10
            D. Another date.
            E. The code does not compile.
            F. A runtime exception is thrown. **********
            */


        // Task -> OCA-04
        /*
         What is the output of the following code?
        Asagidaki code'un  ciktisi  nedir?
        */
        LocalDate date2 = LocalDate.of(2018, Month.APRIL, 28);
        date2.plusDays(2);
        date2.plusYears(3);
        System.out.println(date2.getYear() + " " + date2.getMonth() + " " + date2.getDayOfMonth());
/*
            A. 2018 APRIL 28 *********
            B. 2018 APRIL 30
            C. 2018 MAY 2
            D. 2021 APRIL 2
            E. 2021 APRIL 30
            F. 2021 MAY 2
            G. A runtime exception is thrown.
 */


        // Task -> OCA-05
         /*
         What is the output of the following code?
        Asagidaki code'un  ciktisi  nedir?
        */
        LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
        Period p = Period.ofDays(1).ofYears(2);//çoklu period parametresinde sonuncusu kullanılır diğerlerini ezer
        d = d.minus(p);
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(d.format(f));
 /*
            A. 5/9/13 11:22
            B. 5/10/13 11:22 **********
            C. 5/9/14
            D. 5/10/14
            E. The code does not compile.
            F. A runtime exception is thrown.
*/
    }
}
