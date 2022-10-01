package j08_ifStatement_Ternary_Operator;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
     /*
     Task-> kullanıcının cinsiyeti KADIN ise 60 yasından buyuk ve prim gunu 6000 den  fazla ise emekliliğini,
      kullanıcının cinsiyeti ERKEK ise 65 yasından buyuk ve prim gunu 7000 den  fazla ise emekliliğini
      kontrol edip kalan yıl ve prim gununu print eden code create ediniz
      */
        Scanner sc= new Scanner(System.in);
        System.out.println("Kadın K-1, erkek E-2 gir");
        int cnsyt = sc.nextInt();

        if (cnsyt == 1){
            System.out.println("yaş ve prim gir");
            int yas = sc.nextInt();
            int prim =sc.nextInt();
            if (yas > 60){
                System.out.println(prim>6000 ? "emekli oldunuz" : (6000-prim)+" gün var");
            }else System.out.println((60- yas)+ " yıl daha var");

        } else if (cnsyt == 2){
            System.out.println("yaş ve prim gir");
            int yas = sc.nextInt();
            int prim =sc.nextInt();
            if (yas > 65){
                System.out.println(prim>7000 ? "emekli oldunuz" : (7000-prim)+" gün var");
            }else System.out.println((60- yas)+ " yıl daha var");

        } else System.out.println("yanlış girdin");

/*
        System.out.println("kadın için K\nerkek için E\ngir: ");
        char cnsyt = sc.next().toUpperCase.charAt(0);
        System.out.println("yası gir");


        if (cnsyt == 'K') {//cinsiyetin kadın olması kontrol edildi
            System.out.println("yasınızı giriniz : ");
            int yas = sc.nextInt();
            if (yas > 60) {//yasın 60 dan buyuklugu kontrol edildi
                System.out.print("prim gununuzu giriniz :");
                int primGunu = sc.nextInt();

                if (primGunu > 6000) {//prim gunu 6000 den buyuk olması kontrol edildi
                    System.out.println("tebrikler NİNEM emekli oldunuz haydı emekli parasını torunlara yedirmeye :) ");
                } else System.out.println("emeliliğiniz için: " + (6000 - primGunu) + " gun  yatırmanız lazım");

            } else System.out.println("emekliliğinize daha : " + (60 - yas) + " yıl daha var");

        } else if (cnsyt == 'E') {
            System.out.println("yasınızı giriniz : ");
            int yas = sc.nextInt();
            if (yas > 65) {//yasın 65 dan buyuklugu kontrol edildi
                System.out.print("prim gununuzu giriniz :");
                int primGunu = sc.nextInt();

                if (primGunu > 7000) {//prim gunu 7000 den buyuk olması kontrol edildi
                    System.out.println("tebrikler DEDEM emekli oldunuz haydı emekli parasını torunlara yedirmeye :) ");
                } else System.out.println("emeliliğiniz için: " + (7000 - primGunu) + " yatırmanız lazım");

            } else System.out.println("emekliliğinize daha : " + (65 - yas) + " yıl daha var");


        } else System.out.println("agam ne oldugunu yaz ona göre emekli edeyim seni :( ");
*/
    }

}
