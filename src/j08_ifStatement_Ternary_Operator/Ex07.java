package j08_ifStatement_Ternary_Operator;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
     /*
     Task-> Kullanıcının ehliyetinin varlığını kontrol ediniz.
          Ehliyeti varsa yıl tecrübesi 7 yıl ve üstü ise aldıgı mesafe 100000 km ve üzeri ise kontak anahtarını teslim ediniz
          aksi durumda tecrübe yılı ve mesafe eksiklerini print eden code create ediniz

      */

        Scanner sc = new Scanner(System.in);
        System.out.println("ehliyet varsa E yoksa H gir: ");
        char ehlyt = sc.next().toUpperCase().charAt(0);

        if (ehlyt == 'E'){
            System.out.println("yıl ve km gir");
            int tcrb = sc.nextInt();
            int km =sc.nextInt();
            if (tcrb >= 7){
                System.out.println(km>=100000 ? "anahtar" : (100000- km)+" eksik");
            }else System.out.println((7-tcrb)+" yıl "+ (100000 - km)+" eksik");
        } else if (ehlyt== 'H') {
            System.out.println("ehlyt alll");
        } else System.out.println("yanlış girdin");

      /*
        char ehlyt = sc.next().toUpperCase().charAt(0);

        if (ehlyt=='E'){
            System.out.println("tecrübe ne");
            int tcrb=sc.nextInt();
            if (tcrb>=7) {
                System.out.println("mesafe");
                int km=sc.nextInt();
                if (km>=100000) {
                    System.out.println("anahtar senin");
                }else System.out.println("anahtar için: "+(100000-km)+ "yol lazım ");
            }else System.out.println("anahtar için: "+(7-tcrb)+"yıl lazım");

        }else if (ehlyt=='H'){
            System.out.println("ehliyet al");

        }else System.out.println("yanlış girdin");

       */
/*
        char ehlyt = sc.next().charAt(0);//kullanıcının girdiği karakteri buyuk harfe cevirip ilk değerini alır
        if (ehlyt == 'E'||ehlyt =='e') {//ehlyt varlığı k0ntrol edildi

            System.out.print("kac yıllık tecrübeniz var :");
            int tcrb = sc.nextInt();

            if (tcrb >= 7) {//tecrübe yılı kntrol edildi
                System.out.print("yaptıgınız km mesafeyi girniz : ");
                int km = sc.nextInt();
                if (km >= 100000) {//km mesafe kontrol edildi
                    System.out.println("agam gözün aydın kontak anahtarı senindir :)");
                } else//km sartı saglamazsa çalışır
                    System.out.println("kontak anahatarı lamanız için önce " + (100000 - km) + " yola ihtiyacınız var");

            } else //tecrübe şartı sağlamzsa çalışır
                System.out.println("kontak anahatarı lamanız için önce " + (7 - tcrb) + " yıla ihtiyacınız var");
            //yıl 7den byk olma şartı sağlamadığı içib eksik trc yazdrıldı

        } else
        if (ehlyt == 'H'||ehlyt=='h') {//ehliyet yoklugu kontrol edildi
            System.out.println("agam önce bi ehliyet al sonra kontak anahtarı sor :(");
        } else //ehlyt varlığı için e h girilme şartı sağlanmazsa  çalışır
            System.out.println("agam önce adam gibi karakter gir :(");
*/
    }
}
