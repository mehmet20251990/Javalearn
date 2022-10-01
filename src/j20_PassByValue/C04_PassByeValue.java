package j20_PassByValue;

public class C04_PassByeValue {

    static double etiketFiyatı;
    static double indirimOranı;

    public static void main(String[] args) {
    /*
    Eğer bir meth.da yapılan değişiklik kalıcı olsun istenirse
    1. Değşiklik yapılan var.lar static olarak tanımlanır
     */
        etiketFiyatı = 100;
        System.out.println("indirim öncesi etiketFiyatı = " + etiketFiyatı);//100
        indirimOranı = 0.1;

        indir();//method call
        indirimOranı = 0.1;

        indir();
        indirimOranı = 0.1;

        indir();
        System.out.println("indirim sonrası etiketFiyatı = " + etiketFiyatı);// 72.9
    }//main sonu
    public static void indir() {
        etiketFiyatı *= (1 - indirimOranı);//etiketfiyatı indirimli hale getirlidi
        System.out.println("etiketFiyatı = " + etiketFiyatı);
    }
}