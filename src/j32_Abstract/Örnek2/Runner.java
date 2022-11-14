package j32_Abstract.Örnek2;

public class Runner {
    /*
            1- içinde name field ı ve  boş  constructorı olan Sekil isimli bir Abstract Class yazınız.
            2- Bu classın Alan ve cevre abstract metodları ve içinde Alan ve cevre nin sonucu olan toString somut metodu,
    sekilin adını veren getName somut metodu ve ciz isimli somut metodlarını ekleyiniz.
            3- Bu sınıftan Dikdörtgen ve Cember isimli 2 class oluşturunuz.
            4- Bunlardan birer örnek main metodunda çalıştırınız.
     */
    public static void main(String[] args) {
        Dikdortgen dd = new Dikdortgen(24,7);
        dd.setName("dikdörtgen ");
        // dd.cevreHesapla();//
        // dd.alanHesapla();//
        // System.out.println("dd.ciz() = " + dd.ciz());//
        System.out.println(dd);//

        Cember c1=new Cember(39);
        c1.setName("cemberimde gül oya ");
        System.out.println(c1);
    }
}