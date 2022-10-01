package j09_SwitchStatement;

import java.util.Scanner;

public class C05_SwitchCase_ATM_Project {
    public static void main(String[] args) {

        /*
     Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı
     bir ATM app. code create ediniz
 */

        Scanner sc = new Scanner(System.in);
        int bakiye = 1000;
        System.out.println("Hosgeldiniz. Lütfen yapmak istediginiz islemi seciniz...");
        System.out.println("Bakiye ögrenme icin -> 1 \nPara yatirmak icin -> 2\nPara cekmek icin -> 3\nCikmak icin ->4");
        int secim = sc.nextInt();

        switch (secim){
            case 1 :
                System.out.print("bakiyeniz = " + bakiye);
                break;
            case 2 :
                System.out.print("Lütfen hesabiniza yatirmak istediginiz tutari giriniz: ");
                int yTutar = sc.nextInt();
                bakiye += yTutar;
                System.out.println("Yeni bakiyeniz = " + bakiye + " Tl'dir");
                break;
            case 3:
                System.out.print("Lütfen cekmek istediginiz tutari giriniz: ");
                int cTutar = sc.nextInt();
                // System.out.println(cTutar<=bakiye ? "bakiye: "+(bakiye-cTutar) : "Az para iste bakiyen "+ bakiye);
                if(cTutar>bakiye){
                    System.out.println("Hesabinizda yeterli bakiyeniz bulunmamaktadir");
                } else {
                    bakiye-=cTutar;
                    System.out.println("yeni bakiyeniz = " + bakiye + " Tl'dir");
                }
                break;
            case 4:
                System.out.println("Sistemden cikiliyor");
                break;
            default:
                System.out.println("Hatali bir islem yaptiniz");
                 break;
        }
    }
}
