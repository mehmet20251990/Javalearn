package j26_inheritance.inheritance01;

public class Koyun extends Mammal{ //Mammal Parentin Child.ı class (Child)
    String name = "Dolly";
    public Koyun() {
        System.out.println("Koyun p.siz cons çalıştı");
    }

    public void semir() {
        System.out.println("Koyun semirir");
    }

    @Override
    public void yeme() {
        System.out.println("Koyun yeme");
    }
}
