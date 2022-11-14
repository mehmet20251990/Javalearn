package j26_inheritance.inheritance02;

public class Mammal extends Hayvancık { // Hayvancık Parentin Child.ı super class (Parent)

    public Mammal() {
        this('Y');
        System.out.println("Mammal p.siz cons çalıştı");
    }
    public Mammal(char c) {
        super(17);
        System.out.println("Mammal p.li cons çalıştı");
    }

    public void mC() { // Ezilen method

        System.out.println("mC call");
    }
    int m= 1;
    int c= 4;

    @Override
    public void mM() {
        System.out.println("mM call mammal classdan");
    }
}// Class sonu
