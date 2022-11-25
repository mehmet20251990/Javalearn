package Projects.P11_depoYonetimi.DepoTeam;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class Islemler implements GirisCikis {
    static Scanner scan = new Scanner(System.in);
    static int id = 1000;
    static HashMap<Integer, Urunler> urunlerMap = new HashMap<>();
    public static final String W = "\u001B[37m";
    public static final String R = "\u001B[31m";
    public static final String G = "\u001B[32m";
    public static final String Y = "\u001B[33m";
    public static final String B = "\u001B[34m";

    public void menu() {
        //Urunler hazır = new Urunler("TELEVİZYON","SAMSUNG","ADET");
        //Urunler hazır1 = new Urunler("BUZDOLABI","BOSCH","ADET");
        //Urunler hazır2 = new Urunler("BULASIK MAKİNESİ","ARCELİK","ADET");
        //urunlerMap.put(1000,hazır);
        //urunlerMap.put(1001,hazır1);
        //urunlerMap.put(1002,hazır2);

        System.out.println(Y + "========================== İŞLEMLER =======================\r\n"
                + W + "   ____________________             ____________________    \n"
                + R + "   | 1-URUN LISTESI  |              | 2-URUN TANIMLA   |  \n"
                + G + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯    \n"
                + Y + "   ____________________             ____________________    \n"
                + B + "   | 3-URUN RAFLAMA  |              | 4-URUN GIRIS     |   \n"
                + W + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯    \n"
                + R + "   ____________________             ____________________    \n"
                + G + "   | 5-URUN CIKIS    |              | 6-CIKIS          |   \n"
                + Y + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯       " + B);

        System.out.print("ISLEM SECİNİZ : ");
        int secim = tryCatch();
        switch (secim) {
            case 2:
                uruntanimlamaca();
                menu();
                break;
            case 1:
                urunListelemece();
                menu();
                break;
            case 4:
                urunGirisi();
                menu();
                break;
            case 3:
                urunuRafaKoymaca();
                menu();
                break;
            case 5:
                urunCıkıs();
                menu();
                break;
            case 6:
                cikisYap();
                menu();
                break;
            default:
                System.out.println("Lütfen dikkatli giris yapınız");
                menu();
        }
    }
    private static void urunCıkıs() {
        System.out.println("Cıkıs yapılacak urunun ıd nosunu giriniz");
        int arananId = tryCatch();
        if (urunlerMap.containsKey(arananId)) {
            System.out.println("Cıkılacak ürün miktarını giriniz");
            int cikilanUrun = tryCatch();
            if (cikilanUrun < urunlerMap.get(arananId).getMiktar()) {
                urunlerMap.get(arananId).setMiktar(urunlerMap.get(arananId).getMiktar() - cikilanUrun);

            } else if (cikilanUrun > urunlerMap.get(arananId).getMiktar()) {
                System.out.println("Elimizde bulunan stoktan fazlasını cıkmaya calışıyorsunuz....\nBilgilerinizi kontrol ediniz. Sistem bu haliyle ürün stoğunu '0' olarak ayarladı");
                urunlerMap.get(arananId).setMiktar(urunlerMap.get(arananId).getMiktar() - cikilanUrun);
                urunlerMap.get(arananId).setMiktar(0);
            }
            System.out.println("===========================================================================");
            System.out.println(arananId + " ıd nolu " + urunlerMap.get(arananId).getUrunIsmi() + " stok durumu= " + urunlerMap.get(arananId).getMiktar());
            System.out.println("===========================================================================");

        } else {
            System.out.println("aradığınız ıd de ürün yok");
            urunCıkıs();
        }

    }
    private static void urunuRafaKoymaca() {
        System.out.println("urunun ıd nosunu giriniz");
        int arananId = tryCatch();
        if (urunlerMap.containsKey(arananId)) {
            System.out.println("urunu koymak istediğiniz raf bilgisini giriniz");
            String rafBilgi = scan.nextLine().toUpperCase();
            urunlerMap.get(arananId).setRaf(rafBilgi);
            System.out.println(arananId + " ıd nolu ürün \"" + rafBilgi + "\" rafına yerleştirildi\n");

        } else {
            System.out.println("Girilen ıd de bir depoda yok");
            urunuRafaKoymaca();
        }

    }
    private static void urunGirisi() {
        System.out.println("urunun ıd nosunu giriniz");
        int arananId = scan.nextInt();
        if (urunlerMap.containsKey(arananId)) {
            System.out.println(urunlerMap.get(arananId));
            System.out.println(" Bu ürüne eklemek istediğniz miktarı giriniz");
            int yeniMiktar = tryCatch();
            urunlerMap.get(arananId).setMiktar(urunlerMap.get(arananId).getMiktar() + yeniMiktar);
            System.out.println("=============================================================");
            System.out.println(urunlerMap.get(arananId).getUrunIsmi() + " günecel miktarı= " + urunlerMap.get(arananId).getMiktar());
            System.out.println("=============================================================");
        } else System.out.println("Girilen ıd de bir depoda yok");
    }
    private static void urunListelemece() {
        Set<Map.Entry<Integer, Urunler>> urunlerSeti = urunlerMap.entrySet();
        System.out.println("id       ismi         ureticisi       miktari       birimi         raf" +
                "\n----------------------------------------------------------------------");
        for (Map.Entry<Integer, Urunler> each : urunlerSeti) {
            Integer urunlerKey = each.getKey();
            System.out.printf("%d    %-8s       %-14s %3d          %-14s %s"
                    , urunlerKey, each.getValue().getUrunIsmi(), each.getValue().getUretici(), each.getValue().getMiktar(), each.getValue().getBirim(), each.getValue().getRaf());
            System.out.println("");
        }
    }
    private static void uruntanimlamaca() {
        System.out.println("urun ismini giriniz");
        String urunismi = scan.nextLine().toUpperCase();

        System.out.println("Urun ureticisi?");
        String uretici = scan.nextLine().toUpperCase();

        System.out.println("Urun birimini gir?");
        String birim = scan.nextLine().toUpperCase();

        Urunler yeniUrun = new Urunler(urunismi, uretici, birim);
        urunlerMap.put(id, yeniUrun);
        System.out.println("yeni eklenen urun==> " + urunlerMap.get(id));
        id++;
    }
    public static int tryCatch() {
        int a;
        while (true) {
            try {
                a = scan.nextInt();
                if(a>0)break;
                else throw new Exception();

            } catch (Exception e) {
                System.out.println("Lütfen tam sayı giriniz");
                scan.nextLine();
            }
        }
        scan.nextLine();
        return a;
    }

    @Override
    public void cikisYap() {
        System.exit(6);
        System.out.println(" yine bekleriz");
    }
}
