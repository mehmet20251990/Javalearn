package j20_PassByValue;

public class C02_PassByValue {
    public static void main(String[] args) {
        // Task -> verilen fiyat için %11 %22 ve %33 indirimli fiyatı print eden meth.lar create ediniz

        double fiyat = 100;
        System.out.println("meth öncesi " + fiyat); //100
        indir11(fiyat);
        indir22(fiyat);
        indir33(fiyat);
        System.out.println("meth sonrası "+ fiyat); //100
    }

    private static double indir33(double fiyat) {
        return fiyat *=0.89;
    }

    private static double indir22(double fiyat) {
        return fiyat *=0.78;
    }

    private static double indir11(double fiyat) {
        return fiyat *=0.67;
    }
}
