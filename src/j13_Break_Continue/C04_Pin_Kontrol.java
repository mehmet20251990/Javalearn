package j13_Break_Continue;

import java.util.Scanner;

public class C04_Pin_Kontrol {
    public static void main(String[] args) {
        // Task-> String data type bir pin datasının 3 giriş hakkında kontrol eden code create ediniz

        Scanner sc = new Scanner(System.in);

        String dgruPin = "javaCAN";
        int girisHakkı = 3;
        while(true){
            System.out.println("pin gir");
            String pin = sc.nextLine();
            if (pin.equals(dgruPin)){
                System.out.println("başarılı");
                break;
            } else {
                System.out.println("bir daha dene");
                girisHakkı--;
                System.out.println("kalan hakkın: "+ girisHakkı);
                if (girisHakkı==0){
                    System.out.println("olmadı hakkın bitti");
                    break;
                }
            }
        }
    }
}
