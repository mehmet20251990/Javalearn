package j26_inheritance.inheritance01;

public class Kedi extends Mammal { // Mammal Parentin Child.ı class (Child)
    /*
    Child class obj olmadan parent class variable ve methodlara ulaşabilir.
     */
    public  Kedi(){
        System.out.println("Kedi p.siz cons çalıştı");
    }
    public void cırmala(){
        System.out.println("Kedi cırmalar");
    }

}
