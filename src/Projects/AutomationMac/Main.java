package Projects.AutomationMac;

public class Main {
    /*
select(Urun product) →  Parametre olarak Urun classından oluşturulan bir obje alınarak, ilgili ürünlere göre seçim yapması beklenir.
Kullanıcı seçim yapabilmek için öncelikle ürünleri görmelidir.

balance(double price, double accountBalance, Urun product) → Parametre olarak, urunun fiyatı, mevcut bakiye, Urun classından oluşturulmuş
bir obje alınarak satın alınmak istenen ürünün fiyatı
kullanıcının bakiyesinden az ise ekleme yapmasına olanak sağlayan ve ya ekleme yapmak istemiyorsa programdan çıkışını sağlayabilecek bir metot
oluşturunuz.

purchase(double price, double accountBalance, Urun product)-->  Parametre olarak, urunun fiyatı, mevcut bakiye, Urun classından oluşturulmuş
bir obje alınarak, bakiye satın alınmak istenen üründen daha fazla ve ya eşit ise satın alınma işlemi yapılmalı, kullanıcıya kalan bakiye
gösterilmeli ve başka bir ürün alınıp alınmak istenmediği sorularak ilgili aksiyonlar alınmalıdır.  Kullanıcı başka bir ürün satın almak
istiyorsa tekrardan ürünlerin gösterildiği metoda gitmelidir.

 */
    public static void main(String[] args) {
        double accountBalance = 5;

        Urun urun = new Urun();
        // System.out.println(urun.toString());
        Options options = new Options();
        //options.select(urun);

        urun.setPrice(options.select(urun));
        accountBalance = options.balance(urun.getPrice(), accountBalance,urun);
        //System.out.println(accountBalance);
        options.purchase(urun.getPrice(), accountBalance, urun);

    }
}