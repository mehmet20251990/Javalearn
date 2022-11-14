package j32_Abstract.abstract02;

public class IdariPersonel extends Personel{
    @Override
    public void maasHesapla() {
        System.out.println("İdareci Yevmiye saati 120$");
    }
    @Override
    public void maasBilgisi() {
        System.out.println("İdareciye ikramiye");
    }
    @Override
    public void sigorta() {
        System.out.println("Coder personele full sigorta");
    }
}
