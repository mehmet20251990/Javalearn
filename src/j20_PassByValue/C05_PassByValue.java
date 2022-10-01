package j20_PassByValue;

public class C05_PassByValue {
    public static void main(String[] args) {
         /*
    Eğer bir meth.da yapılan değişiklik kalıcı olsun istenirse
    2. Değşiklik -> yapılan var.lara atama tanımlanır
     */
        double etiketFiyatı=100;
        double indirimOranı=0.1;
        System.out.println("önceki etiketFiyatı = " + etiketFiyatı);
        etiketFiyatı = indirim(etiketFiyatı, indirimOranı);
        System.out.println("sonraki etiketFiyatı = " + etiketFiyatı);

    }
    public static double indirim(double fiyat, double oran){
         fiyat*=(1-oran);
        System.out.println(fiyat);
        return fiyat;
    }
}
