package j25_Encapsulation.encapsulation02;

public class Kisi {
    /*
    Kişi pojo class için fields -> ad, soyad, password(String), yas tüm fieldları kullanıcı görebilmeli ve password hariç
    update edebilmeli (password encapsulated update edilmemeli).
    yas variable negatif değer girmeye karşı encapsulated

    runner class'da obj ile field ları print eden code create ediniz
     */

    String ad;
    String soyad;
    private String password;
    private int yas;

    public Kisi(String ad, String soyad, String password, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.password = password;
        this.yas = yas;
    }
    public String getPassword() {

        return password;
    }
    public int getYas() {

        return yas;
    }
    public void setYas(int yas) {

        this.yas = Math.abs(yas);
    }
}
