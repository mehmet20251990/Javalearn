package j26_inheritance.inheritance02;

public class Kedi extends Mammal { // Mammal Parentin Child.ı class (Child)
    /*
    Child class obj olmadan parent class variable ve methodlara ulaşabilir.
     */
    public  Kedi(){
        super();
        System.out.println("Kedi p.siz cons çalıştı");
    }
    public  Kedi(String str){
        this();
        System.out.println(super.c);
        System.out.println("Kedi p.li cons çalıştı");
    }
    int c=2;
    int d=5;

    @Override
    public void mC() { // Mammal classdan ezen method
        System.out.println("mC call kedi classdan");
    }

}
